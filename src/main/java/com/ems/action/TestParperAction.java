package com.ems.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.ems.entity.Post;
import com.ems.entity.Test;
import com.ems.entity.Testquestion;
import com.ems.entity.User;
import com.ems.service.PostService;
import com.ems.service.TestParperService;
import com.ems.service.TestService;
import com.ems.service.TestquestionService;
import com.ems.service.UserService;
import com.ems.utils.Config;
import com.ems.utils.WordUtil;
import com.ems.utils.MDoc;
import com.opensymphony.xwork2.ActionSupport;

public class TestParperAction extends ActionSupport implements
		ServletRequestAware, SessionAware, ServletResponseAware {
	private static final Logger LOGGER = Logger
			.getLogger(TestParperAction.class);

	@Autowired
	private TestquestionService testQuestionService;
	@Autowired
	private TestParperService parperService;
	@Autowired
	private PostService postService;
	@Autowired
	private TestService testService;
	@Autowired
	private UserService userService;
	private List<Testquestion> questionList = new ArrayList<Testquestion>();
	private HttpServletRequest request;
	private Map<String, Object> session;
	private HttpServletResponse response;
	private Post post;
	private JSONObject json = new JSONObject();
	public String parper() {
		String parperId = request.getParameter("parperId");
		/*this.post = postService.get(postId);
		this.postName = post.getName();*/
		this.questionList = parperService.getParpers(parperId);
		return "success";
	}
	
	
	//考试卷
	public String test(){
		//获取当前用户session
		User user = (User)this.session.get("currentUser");
		Map<String,Object> parmas = new HashMap<String, Object>();
		parmas.put("post", user.getPost());
		parmas.put("radio", Config.radio);
		parmas.put("checkbox", Config.checkbox);
		parmas.put("panduan", Config.panduan);
		parmas.put("common", Config.common);
		parmas.put("commonPost", "common");
		
		this.questionList = this.parperService.getTestParper(parmas);
		return SUCCESS;
	}
	//考试提交
	public void submitQuestion() throws IOException{
		try {
			String questionStr = this.request.getParameter("questionStr");
			questionStr = URLDecoder.decode(questionStr, "utf-8");
			String score = this.request.getParameter("score");
			int scoure_num = Integer.parseInt(score);
			/*Map<String,List> question = this.request.getParameterMap();
			List questionList = question.get("question_array");*/
			String questionArray [] = questionStr.split("/");
			User user = (User)this.session.get("currentUser");
			//记录提交次数
			int times = user.getSubmitTimes()+1;
			int current_score = user.getScore();
			user.setSubmitTimes(times);
			if(scoure_num>current_score){
				user.setScore(scoure_num);
			}
			userService.saveOrUpdate(user);
			for(int i=0;i<questionArray.length;i++){
				String questionId_Option = questionArray[i];
				String id_option_array[] = questionId_Option.split(",");
				String questionId = id_option_array[0];
				String option = id_option_array[1];
				Test test = new Test();
				test.setId(UUID.randomUUID().toString());
				test.setUserId(user.getUserName());
				test.setQuestionId(questionId);
				test.setSelectOption(option);
				test.setCurrentTiems(times);
				this.testService.save(test);
				this.json.put("success", true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			this.json.put("success", false);
		}
	
		this.response.getWriter().write(json.toString());
		
	}
	//用户考试记录
	public void getTestRecord(){
		User user = (User)this.session.get("currentUser");
		List list = this.testService.getTestByUserId(user.getUserName());
		
	}
	
	//清空试卷
	public void clearParper(){
		try {
			String postId = request.getParameter("postId");
			this.parperService.clearParper(postId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	// 下载world
	public void downloadWorld() {

		try {
			String postName = request.getParameter("postName");
			this.questionList = parperService.getParpers(postName);
			// 指定下载路径
			String path = request.getSession().getServletContext()
					.getRealPath("/");
			String filename = postName + "试卷.doc";
			path = path + "filesfold/" + filename; // 获取文件，如果不存在，新建该文件

			Map<String, Object> dataMap = new HashMap<String, Object>();
			// 设置名称
			dataMap.put("xytitle", postName + "试卷");
			// 根据试题类型分类

			// 单选题
			int radio_index = 1;
			List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
			List<Map<String, Object>> list11 = new ArrayList<Map<String, Object>>();

			// 抽取填空题
			int completion_index = 1;
			List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();
			List<Map<String, Object>> list12 = new ArrayList<Map<String, Object>>();

			// 抽取判断题
			int judgement_index = 1;
			List<Map<String, Object>> list3 = new ArrayList<Map<String, Object>>();
			List<Map<String, Object>> list13 = new ArrayList<Map<String, Object>>();

			// 抽取简答题
			int jianda_index = 1;
			List<Map<String, Object>> list4 = new ArrayList<Map<String, Object>>();
			List<Map<String, Object>> list14 = new ArrayList<Map<String, Object>>();
			for (int i = 0; i < questionList.size(); i++) {
				Testquestion tq = questionList.get(i);
				String question_type = tq.getTestquestionType().getName();
				if (question_type.equals("单选题") || question_type.equals("多选题")) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("xzn", radio_index + ".");
					map.put("xztest", tq.getName() + "(   )");
				//	map.put("ans", tq.getOptions());
					list1.add(map);

					Map<String, Object> map1 = new HashMap<String, Object>();
					map1.put("fuck", radio_index + ".");
					map1.put("abc", tq.getRightOption());
					list11.add(map1);
					radio_index++;
				} else if (question_type.equals("填空题")) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("tkn", completion_index + ".");
					map.put("tktest", tq.getName());
					list2.add(map);

					Map<String, Object> map1 = new HashMap<String, Object>();
					map1.put("fill", completion_index + ".");
					map1.put("def", tq.getRightOption());
					list12.add(map1);
					completion_index++;
				} else if (question_type.equals("判断题")) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("pdn", judgement_index + ".");
					map.put("pdtest", tq.getName());
					list3.add(map);

					Map<String, Object> map1 = new HashMap<String, Object>();
					map1.put("judge", judgement_index + ".");
					map1.put("hij", tq.getRightOption());
					list13.add(map1);
					judgement_index++;
				} else if (question_type.equals("简答题")) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("jdn", jianda_index + ".");
					map.put("jdtest", tq.getName());
					list4.add(map);

					Map<String, Object> map1 = new HashMap<String, Object>();
					map1.put("answer", jianda_index + ".");
					map1.put("xyz", tq.getRightOption());
					list14.add(map1);
					jianda_index++;
				}
			}
			dataMap.put("table1", list1);
			dataMap.put("table11", list11);

			dataMap.put("table2", list2);
			dataMap.put("table12", list12);

			dataMap.put("table3", list3);
			dataMap.put("table13", list13);

			dataMap.put("table4", list4);
			dataMap.put("table14", list14);

			MDoc mdoc = new MDoc();
			mdoc.createDoc(dataMap, path);

			File file = new File(path);
			// 以流的形式下载文件。
			InputStream is = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[is.available()];
			is.read(buffer);
			is.close();
			// 清空response
			response.reset();
			// 设置response的Header
			response.addHeader("Content-Disposition", "attachment;filename="
					+ new String(filename.getBytes("gb2312"), "ISO8859-1"));
			response.addHeader("Content-Length", "" + file.length());
			OutputStream toClient = new BufferedOutputStream(
					response.getOutputStream());
			response.setContentType("application/vnd.ms-excel;charset=gb2312");
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
			
			file.delete();
			System.out.println("world导出成功！");
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			LOGGER.error("下载文档(WordUtil)出错：[msg：" + e.getMessage() + "]");
			e.printStackTrace();
		}

	}

	public List<Testquestion> getQuestionList() {
		return questionList;
	}

	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public void setQuestionList(List<Testquestion> questionList) {
		this.questionList = questionList;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}

	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.response = arg0;
	}
}
