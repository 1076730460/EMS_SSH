package com.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.TestDAO;
import com.ems.entity.Test;
import com.ems.service.TestService;
@Service("testService")
public class TestServiceImpl implements TestService{
	@Autowired
	private TestDAO testDAO;
	public String save(Test test) {
		// TODO Auto-generated method stub
		return testDAO.save(test);
	}

	public List<Test> findAll() {
		// TODO Auto-generated method stub
		return this.testDAO.findAll();
	}

	public List getTestByUserId(String userId) {
		// TODO Auto-generated method stub
		return this.testDAO.getTestByUserId(userId);
	}

}
