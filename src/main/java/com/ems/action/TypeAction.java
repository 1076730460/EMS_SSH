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
import com.ems.entity.TestquestionType;
import com.ems.entity.User;
import com.ems.service.PostService;
import com.ems.service.TestquestionTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class TypeAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware,SessionAware {
	@Autowired
	private TestquestionTypeService typeService;
	private HttpServletResponse response;
	private HttpServletRequest request;
	private Map<String,Object> session;
	private TestquestionType type;
	public TestquestionType getType() {
		return type;
	}

	public void setType(TestquestionType type) {
		this.type = type;
	}

	private JSONObject json = new JSONObject();

	public void saveType() throws IOException {
		try {
			User user = (User)this.session.get("currentUser");
			String typeName = request.getParameter("typeName");
			typeName = URLDecoder.decode(typeName, "utf-8");
			this.type = new TestquestionType();
			this.type.setId(UUID.randomUUID().toString());
			this.type.setName(typeName);
			this.type.setCreate_person(user.getName());
			this.type.setCreate_time(new Date());
			typeService.save(type);
			json.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			json.put("errorMsg", "数据存储异常!");
		}
		response.getWriter().write(json.toString());
	}

	public String showType() {
		String result = "";
		try {
			String typeId = request.getParameter("typeId");
			this.type = typeService.get(typeId);
			result = "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result = "error";
		}

		return result;
	}

	public void delType() throws IOException {
		try {
			String typeId = request.getParameter("typeId");
			typeService.delete(typeId);
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

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}
}
