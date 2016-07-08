package com.ems.action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.ems.entity.Post;
import com.ems.entity.User;
import com.ems.service.EmsTest;
import com.ems.service.PostService;
import com.ems.service.UserService;
import com.ems.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements SessionAware,ServletResponseAware,ServletRequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2955734156582786449L;
	private static final Logger LOGGER = Logger.getLogger(UserAction.class);
	private JSONObject json = new JSONObject();
	@Autowired
	private UserService userService;
	private User user;
	private Map<String, Object> session;
	private HttpServletResponse response;
	private HttpServletRequest request;
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void loginIn() throws IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		boolean b = userService.login(userName, password,this.session);
		if(b){
			json.put("success", true);
			json.put("url", "home.action");
		}else{
			json.put("success", false);
			json.put("errorMsg", "用户名或密码错误！");
		}
		// 记录日志
		LOGGER.debug("TEST");
		this.response.getWriter().write(json.toString());
	}
	
	public void modifyPassword() throws IOException{
		try {
			String newPassword = this.request.getParameter("newPassword");
			User user1 = (User)this.session.get("currentUser");
			user1.setPassword(newPassword);
			userService.saveOrUpdate(user1);
			json.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "数据存储异常！");
		}
		
		this.response.getWriter().write(json.toString());
	}


	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session = arg0;
	}

	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		response = arg0;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}

}
