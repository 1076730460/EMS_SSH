package com.ems.service;

import java.util.List;

import com.ems.entity.Test;

public interface TestService {
	public String save(Test test);
	public List<Test> findAll();
	public List getTestByUserId(String userId);
}
