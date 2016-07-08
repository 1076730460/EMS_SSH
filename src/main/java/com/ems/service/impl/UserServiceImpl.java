package com.ems.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.utils.HttpServletUtil;
import com.ems.dao.UserDAO;
import com.ems.entity.User;
import com.ems.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return this.userDAO.get(id);
	}
	public String save(User user) {
		// TODO Auto-generated method stub
		return this.userDAO.save(user);
	}
	public boolean login(String userName, String password,Map<String,Object> session) {
		// TODO Auto-generated method stub
		boolean b = false;
		User user = getUser(userName);
		if(user != null){
			//user exist
			if(user.getPassword().equals(password)){
				//login success
				 b = true;
				 //存 session
				 session.put("currentUser", user);
			}else{
				//login failure
				b = false;
			}
		}else{
			b = false;
		}
		return b;
	}
	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		this.userDAO.saveOrUpdate(user);
	}

}
