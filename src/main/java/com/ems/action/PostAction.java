package com.ems.action;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import com.ems.entity.Post;
import com.ems.entity.User;
import com.ems.service.PostService;
import com.opensymphony.xwork2.ActionSupport;

public class PostAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,SessionAware{
	@Autowired
	private PostService postService;
	private HttpServletResponse response;
	private HttpServletRequest request;
	private Map<String,Object> session;
	private Post post;
	private JSONObject json = new JSONObject();
	public void savePost() throws IOException {
		try {
			String postName = request.getParameter("postName");
			postName = URLDecoder.decode(postName,"utf8"); 
			User user = (User)this.session.get("currentUser");
			this.post = new Post();
			this.post.setId(UUID.randomUUID().toString());
			this.post.setName(postName);
			this.post.setCreate_person(user.getName());
			this.post.setCreate_time(new Date());
			postService.save(post);
			json.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "数据存储异常!");
		}
		response.getWriter().write(json.toString());
	}
	
	public String showPost(){
		String result = "";
		try {
			String postId = request.getParameter("postId");
			this.post = postService.get(postId);
			result = "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result = "error";
		}
		
		return result;
	}
	
	public void delPost() throws IOException{
		try {
			String postId = request.getParameter("postId");
			postService.delete(postId);
			json.put("success", true);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "数据异常！");
		}
		response.getWriter().write(json.toString());
	}

	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.response = arg0;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}
}
