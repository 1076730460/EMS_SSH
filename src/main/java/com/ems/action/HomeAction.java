package com.ems.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import com.ems.entity.Post;
import com.ems.entity.TestParper;
import com.ems.entity.TestquestionType;
import com.ems.entity.User;
import com.ems.service.PostService;
import com.ems.service.TestParperService;
import com.ems.service.TestquestionService;
import com.ems.service.TestquestionTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	@Autowired
	private PostService postService;
	
	@Autowired
	private TestquestionTypeService typeService;
	
	@Autowired
	private TestParperService parperService;
	
	private List<Post> postList = new ArrayList<Post>();
	
	private List<TestquestionType> typeList = new ArrayList<TestquestionType>();
	
	private List<TestParper> parpers = new ArrayList<TestParper>();
	
	private User user;
	
	private Map<String,Object> session;
	
	public void postList(){			
		
		
	}
	public List<Post> getPostList() {
		return postService.findAll();
	}
	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
	public List<TestquestionType> getTypeList() {
		return typeService.findAll();
	}
	public User getUser() {
		return (User)this.session.get("currentUser");
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setTypeList(List<TestquestionType> typeList) {
		this.typeList = typeList;
	}
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}
	public List<TestParper> getParpers() {
		return this.parperService.findAll();
	}
	public void setParpers(List<TestParper> parpers) {
		this.parpers = parpers;
	}	
}
