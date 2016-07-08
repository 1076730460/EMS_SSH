package com.ems.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ems.entity.Option;
import com.ems.entity.Post;
import com.ems.entity.TestParper;
import com.ems.entity.Testquestion;
import com.ems.entity.TestquestionType;
import com.ems.entity.User;
import com.ems.entity.model.Checkbox;
import com.ems.service.OptionService;
import com.ems.service.PostService;
import com.ems.service.TestParperService;
import com.ems.service.TestquestionService;
import com.ems.service.TestquestionTypeService;
import com.ems.utils.RandomNum;
import com.opensymphony.xwork2.ActionSupport;

/**
 * create time 2016.6.20
 * 
 * @author gjp
 * 
 */
public class TestquestionAction extends ActionSupport implements
		ServletResponseAware, SessionAware, ServletRequestAware {
	private static final long serialVersionUID = -2955734156582786449L;
	private static final Logger LOGGER = Logger
			.getLogger(TestquestionAction.class);
	@Autowired
	private TestquestionService testQuestionService;
	@Autowired
	private PostService postService;
	@Autowired
	private TestquestionTypeService typeService;
	@Autowired
	private TestParperService parperService;
	@Autowired
	private OptionService optionService;
	private List<Testquestion> questionList = new ArrayList<Testquestion>();
	private List<Post> postList = new ArrayList<Post>();
	private List<TestquestionType> typeList = new ArrayList<TestquestionType>();
	private HttpServletResponse response;
	private Map<String, Object> session;
	private HttpServletRequest request;
	private Testquestion question;
	private Post post;
	private TestquestionType type;
	private JSONObject json = new JSONObject();
	private Option option;
	// 单选答案
	private String radio;
	// 多选
	private Checkbox checkbox;
	// 试卷
	private TestParper parper;
	// 组卷题数
	private int zujuanNum;

	public TestquestionType getType() {
		return type;
	}

	public void setType(TestquestionType type) {
		this.type = type;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public List<Testquestion> getQuestionList() {
		return this.questionList;
	}

	public void setQuestionList(List<Testquestion> questionList) {
		this.questionList = questionList;
	}

	public List<Post> getPostList() {
		return this.postList;
	}

	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}

	public List<TestquestionType> getTypeList() {
		return this.typeList;
	}

	public void setTypeList(List<TestquestionType> typeList) {
		this.typeList = typeList;
	}

	public String showQuestion() {
		String result = "";
		try {
			/*
			 * List objList= testQuestionService.getQuestions(); for(int
			 * i=0;i<objList.size();i++){ Object obj[] =
			 * (Object[])objList.get(i); QuestionModel qm = new QuestionModel();
			 * qm.setId(obj[0].toString()); qm.setName(obj[1].toString()); Post
			 * post = new Post(); post.setName(obj[2].toString());
			 * qm.setPost(post); TestquestionType type = new TestquestionType();
			 * type.setName(obj[3].toString()); qm.setTestquestionType(type);
			 * qm.setRightOption(obj[4].toString());
			 * qm.setOptionId(obj[5].toString());
			 * qm.setOptionA("A."+obj[6].toString());
			 * qm.setOptionB("B."+obj[7].toString());
			 * qm.setOptionC("C."+obj[7].toString());
			 * qm.setOptionD("D."+obj[8].toString());
			 * 
			 * this.questionList.add(qm); }
			 */
			this.questionList = testQuestionService.findAll();
			this.postList = postService.findAll();
			this.typeList = typeService.findAll();
			result = "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result = "error";
		}

		return result;
	}

	/**
	 * 
	 * 
	 * @throws IOException
	 */
	public void deletQuestion() throws IOException {
		String id = request.getParameter("questionId");
		try {
			testQuestionService.delete(id);
			json.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "删除失败");
		}
		response.getWriter().write(json.toString());
	}

	// 修改
	public void updateQuestion() throws IOException {
		String id = request.getParameter("questionId");
		try {
			question = testQuestionService.get(id);
			json.put("success", true);
			json.put("questionId", question.getId());
			json.put("questionName", question.getName());
			// json.put("options", question.getOptions());
			json.put("rightOption", question.getRightOption());
			json.put("post", question.getPost().getId());
			json.put("type", question.getTestquestionType().getId());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "删除失败");
		}
		response.getWriter().write(json.toString());
	}

	/**
	 * create time 2016.6.21
	 * 
	 * @author gjp
	 * @param request
	 * @param params
	 * @return
	 * @throws IOException
	 */

	public void addQuestion() throws IOException {
		try {

			User user = (User) this.session.get("currentUser");
			question.setId(UUID.randomUUID().toString());
			question.setPost(post);
			question.setTestquestionType(type);
			question.setCreate_person(user.getName());
			question.setCreate_time(new Date());
			if (this.radio != null && !(this.radio.equals(""))) {
				question.setRightOption(this.radio);
			} else if (this.checkbox != null) {
				String flag = "";
				if (checkbox.getA() != null)
					flag = checkbox.getA();
				if (checkbox.getB() != null)
					flag += " " + checkbox.getB();
				if (checkbox.getC() != null)
					flag += " " + checkbox.getC();
				if (checkbox.getD() != null)
					flag += " " + checkbox.getD();
				question.setRightOption(flag);
			}
			this.option.setId(UUID.randomUUID().toString());
			question.setOption(option);
			String id = testQuestionService.save(question);
			LOGGER.info(JSON.toJSONString(id));

			json.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "存储数据异常!");
		}
		response.getWriter().write(json.toString());

	}

	/**
	 * 修改数据提交
	 * 
	 * @author gjp update question
	 * @throws IOException
	 */

	public void updateOrSaveQuestion() throws IOException {
		try {
			User user = (User) this.session.get("currentUser");
			question.setPost(post);
			question.setTestquestionType(type);
			question.setCreate_person(user.getName());
			question.setCreate_time(new Date());
			testQuestionService.update(question);
			json.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "存储数据异常!");
		}
		response.getWriter().write(json.toString());
	}

	public String searchData() throws IOException {

		try {
			String postId = post.getId();
			String typeId = type.getId();
			this.questionList = testQuestionService.getSearchQuestion(postId,
					typeId);
			/*
			 * HttpSession session = this.request.getSession();
			 * session.setAttribute("searchQuestionList", questionList);
			 */
			session.put("searchQuestionList", questionList);
			this.postList = postService.findAll();
			this.typeList = typeService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "SUCCESS";
	}

	// 自动组卷
	public void automaticParper() throws IOException {
		try {
			String tpName = this.parper.getName();
			List<TestParper> parperList = this.parperService.findAll();
			boolean flag = false;
			for (TestParper parper : parperList) {
				if (parper.getName().equals(tpName)) {
					flag = true;
					this.parper = parper;
				}

			}

			int questionNum = this.zujuanNum;
			List<Testquestion> questionList = (List<Testquestion>) session
					.get("searchQuestionList");
			int index[] = RandomNum.randomCommon(0, questionList.size() + 1,
					questionNum);
			for (int i = 0; i < index.length; i++) {
				Testquestion tq = questionList.get(index[i] - 1);
				if (!flag) {
					parper.setId(UUID.randomUUID().toString());
					parper.setStatus("used");
					parperService.save(parper);
				}
				this.parperService.saveCentTable(this.parper.getId(),
						tq.getId());

			}
			json.put("success", true);
			json.put("Msg", "组卷成功！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "数据存储异常！");
		}
		response.getWriter().write(json.toString());
	}

	/**
	 * 人工组卷 create time 2016.6.23 (questionId数组) update time 2016.6.28
	 * 
	 * @throws IOException
	 */
	public void artficalParper() throws IOException {
		try {
			String tpName = this.parper.getName();
			List<TestParper> parperList = this.parperService.findAll();
			boolean flag = false;
			for (TestParper parper : parperList) {
				if (parper.getName().equals(tpName)) {
					flag = true;
					this.parper = parper;
				}

			}
			if (!flag) {
				parper.setId(UUID.randomUUID().toString());
				parper.setStatus("used");
				parperService.save(parper);
			}
			String sellectQuestionId = request.getParameter("questionIdList");
			String questionIdArray[] = sellectQuestionId.split(",");
			for (int i = 0; i < questionIdArray.length; i++) {

				Testquestion question = testQuestionService
						.get(questionIdArray[i]);
				// question.setLib("1");
				
				this.parperService.saveCentTable(this.parper.getId(),
						question.getId());
			}
			json.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "数据加载失败!");
		}

		response.getWriter().write(json.toString());
	}

	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		response = arg0;
	}

	public Testquestion getQuestion() {
		return question;
	}

	public void setQuestion(Testquestion question) {
		this.question = question;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session = arg0;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public Checkbox getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(Checkbox checkbox) {
		this.checkbox = checkbox;
	}

	public int getZujuanNum() {
		return zujuanNum;
	}

	public void setZujuanNum(int zujuanNum) {
		this.zujuanNum = zujuanNum;
	}

	public TestParper getParper() {
		return parper;
	}

	public void setParper(TestParper parper) {
		this.parper = parper;
	}

}
