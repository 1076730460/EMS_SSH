package com.ems.service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ems.entity.Option;
import com.ems.entity.Post;
import com.ems.entity.TestParper;
import com.ems.entity.Testquestion;
import com.ems.entity.TestquestionType;
import com.ems.entity.User;
import com.ems.utils.Config;
import com.ems.utils.RandomNum;
import com.ems.utils.WordUtil;
import com.ems.utils.MDoc;

/**
 * create time 2016.618
 * @author gjp
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml",
		"classpath:spring-hibernate.xml"})
public class EmsTest {
	private static final Logger LOGGER = Logger.getLogger(EmsTest.class);
	@Autowired
	private UserService userService;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private TestquestionTypeService typeService;
	
	@Autowired
	private TestquestionService questionService;
	
	@Autowired
	private TestParperService parperService;
	
	@Autowired
	private OptionService optionService;
	
	@Autowired
	private TestService testService;
	@Test
	public void save(){
		User user = new User();
		user.setUserName("zhansan");
		user.setPassword("123456");
		user.setName("张三");
		user.setDeptName("研发部");
		user.setTitle("软件开发工程师");
		user.setCellPhone("15988234526");
		user.setMailAddress("153526527@qq.com");
		user.setPost("JAVA");
		user.setUserType("common");
		String id = userService.save(user);
		LOGGER.info(JSON.toJSONString(id));
	}
	@Test
	public void getUser(){
		User user= userService.getUser("zhangsan");
		user.toString();
	}
	@Test
	public void getPost(){
		Post post = postService.get("29228d67-2b2f-4bcc-8af2-e4856e9dadb5");
		Set<Testquestion> set = post.getTestQuestion();
		for(Testquestion tq:set){
			System.out.println("------------>"+tq.toString());
		}
		System.out.println(post.toString());
	}
	
	@Test
	public void savePostAndType(){
		Post post = new Post();
		post.setId(UUID.randomUUID().toString());
		post.setName("db");
		post.setCreate_person("张三");
		post.setCreate_time(new Date());
		postService.save(post);
		
		TestquestionType type = new TestquestionType();
		type.setId(UUID.randomUUID().toString());
		type.setName("判断题");
		type.setCreate_person("张三");
		type.setCreate_time(new Date());
		typeService.save(type);
		
		Testquestion tq1 = new Testquestion();
		tq1.setId(UUID.randomUUID().toString());
		tq1.setName("方法的定义和常量值的集合是( )");
		//tq1.setOptions("A.单元     B.接口     C.成员    D.变量");
		tq1.setRightOption("B");
		tq1.setPost(post);
		tq1.setTestquestionType(type);
		tq1.setCreate_person("张三");
		tq1.setCreate_time(new Date());
		questionService.save(tq1);
		
	}
	@Test
	public void saveTestquestion(){
		
		Post post = postService.load("29228d67-2b2f-4bcc-8af2-e4856e9dadb5");
		TestquestionType type = typeService.load("702a9277-a78a-4acc-b388-bd55c7c4e021");	
		Testquestion tq1 = new Testquestion();
		tq1.setId(UUID.randomUUID().toString());
		tq1.setName("谁说啦啦啦啦");
		tq1.setRightOption("D");
		tq1.setPost(post);
		tq1.setTestquestionType(type);
		tq1.setCreate_person("张三");
		tq1.setCreate_time(new Date());
		
		
		Option option = new Option();
		option.setId(UUID.randomUUID().toString());
		option.setOptionA("水水水水");
		option.setOptionB("多大多大");
		option.setOptionC("呃呃呃额额");
		option.setOptionD("天天天天天");
		//optionService.save(option);
		
		//option.setQuestion(tq1);
		tq1.setOption(option);
		String id = questionService.save(tq1);
		LOGGER.info(JSON.toJSONString(id));
		//optionService.save(option);
	}
	@Test
	public void getSearchQuestion(){
		String post = "";
		String type = "e9ddf3d7-1e5f-4fee-98b7-9ec5ca8f160c";
		List<Testquestion> result = questionService.getSearchQuestion(post, type);
		for(int i=0;i<result.size();i++){
			Testquestion question = result.get(i);
			System.out.println(question.toString());
		}
	}
	@Test
	public void deletQuestion(){
		String id = "73ff3419-f4c7-454d-97cb-7fdc0139b5bd";
		questionService.delete(id);
	}
	@Test
	public void getQuestion(){
		String id = "ce1dc1a7-687b-4513-9932-3495a2016e6d";
		Testquestion question = questionService.get(id);
		Option option = question.getOption();
		System.out.println("----------->"+option.getOptionA());
		//System.out.println("--------------->"+question.toString());
	}
	
	@Test
	public void saveParper(){
		String questionId = "364e6388-5c14-4a76-92aa-3a59178a65b8";
		Testquestion question = questionService.get(questionId);
		TestParper parper = new TestParper();
		
		parper.setId(UUID.randomUUID().toString());
		parper.setName("测试试卷");
		parper.setPostType("JAVA");
		parper.setStatus("");	
		parperService.save(parper);
		
		parperService.saveCentTable(parper.getId(), questionId);
		
	}
	@Test
	public void saveCentTable(){
		String questionId = "364e6388-5c14-4a76-92aa-3a59178a65b8";
		String parperId = "b6a1c233-55d2-47a1-b343-9c13378e8357";
		parperService.saveCentTable(parperId, questionId);
	}
	
	@Test
	public void saveOrUpdateParper(){
		String questionId = "2ba8b794-1f57-4acb-b558-d6b53c84e561";
		String parperId = "ec0c43c3-5e2f-426f-a96b-74d5140e80c5";
		Testquestion question = questionService.get(questionId);
		TestParper parper = new TestParper();
		parper.setId(parperId);
		parper.getQuestion().add(question);
		parperService.saveOrUpdate(parper);
	}
	@Test
	public void getParpers(){
		List<Testquestion> tq = parperService.getParpers("JAVA");
		for(int i=0;i<tq.size();i++){
			System.out.println("----------->"+tq.get(i).toString());
		}
	}
	
	
	@Test
	public void random(){
		int num[] = RandomNum.randomCommon(0, 2, 1);
		for(int i=0;i<num.length;i++){
			System.out.println("--------》"+num[i]);
		}
		
	}
	@Test
	public void createWorld(){
		//指定下载路径
		String path = "D:/";
		String tempFileName = "试卷.doc";
		
	}
	@Test
	public void createWorld1() throws UnsupportedEncodingException{
		System.out.println("hello");
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("xytitle", "试卷");
		int index = 1;
		// 抽取选择题
				List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
				List<Map<String, Object>> list11 = new ArrayList<Map<String, Object>>();
				index = 1;
				for (int i = 0; i < 5; i++) {

					Map<String, Object> map = new HashMap<String, Object>();
					map.put("xzn", index + ".");
					map.put("xztest",
							"(   )操作系统允许在一台主机上同时连接多台终端，多个用户可以通过各自的终端同时交互地使用计算机。");
					map.put("ans1", "A" + index);
					map.put("ans2", "B" + index);
					map.put("ans3", "C" + index);
					map.put("ans4", "D" + index);
					list1.add(map);

					Map<String, Object> map1 = new HashMap<String, Object>();
					map1.put("fuck", index + ".");
					map1.put("abc", "A" + index);
					list11.add(map1);

					index++;
				}
				dataMap.put("table1", list1);
				dataMap.put("table11", list11);

				MDoc mdoc = new MDoc();
				mdoc.createDoc(dataMap, "E:/hello.doc");
	}
	@Test
	public void clearParper(){
		String postId = "bcc5c4b1-c55f-4fb4-9a51-28738911f8f8";
		parperService.clearParper(postId);
	}
	@Test
	public void getQuestions(){
		List questionList = this.questionService.getQuestions();
		System.out.println("-------------------------------------");
		for(int i=0;i<questionList.size();i++){
			Object obj[] = (Object[])questionList.get(i);
			String questionId = obj[0].toString();
			
			System.out.println("questionId----------------->"+questionId);
		}
	}
	@Test
	public void getParperByName(){
		TestParper parper = this.parperService.getParperByName("测试试卷");
		System.out.println(parper.toString());
	}
	@Test
	public void getTestParper(){
		Map<String,Object> parmas = new HashMap<String, Object>();
		parmas.put("post", "JAVA");
		parmas.put("radio", Config.radio);
		parmas.put("checkbox", Config.checkbox);
		parmas.put("panduan", Config.panduan);
		parmas.put("common", Config.common);
		parmas.put("commonPost", "common");
		
		List<Testquestion> questionList = this.parperService.getTestParper(parmas);
		for(Testquestion tq:questionList){
			System.out.println(tq.getName());
			System.out.println(tq.getRightOption());
		}
		
	}
	@Test
	public void getTestByUserId(){
		List list= this.testService.getTestByUserId("zhangsan");
	}
	
}
