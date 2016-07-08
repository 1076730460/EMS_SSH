package com.ems.service;

import java.util.Map;

import com.ems.entity.User;

public interface UserService {
	public User getUser(String id);
	public String save(User user);
	public boolean login(String userName,String password,Map<String,Object> session);
	public void saveOrUpdate(User user);
	
}
