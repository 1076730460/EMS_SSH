package com.ems.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.TestParperDAO;
import com.ems.entity.TestParper;
import com.ems.entity.Testquestion;
import com.ems.service.TestParperService;
@Service("testParperService")
public class TestParperServiceImpl implements TestParperService{
	@Autowired
	private TestParperDAO testParperDAO;
	public List<TestParper> findAll() {
		// TODO Auto-generated method stub
		return testParperDAO.findAll();
	}
	public String save(TestParper entity) {
		// TODO Auto-generated method stub
		return testParperDAO.save(entity);
	}
	public TestParper get(String id) {
		// TODO Auto-generated method stub
		return testParperDAO.get(id);
	}
	public void saveOrUpdate(TestParper entity) {
		// TODO Auto-generated method stub
		testParperDAO.saveOrUpdate(entity);
	}
	public List<Testquestion> getParpers(String parperId) {
		// TODO Auto-generated method stub
		return testParperDAO.getParpers(parperId);
	}
	public void clearParper(String postId) {
		// TODO Auto-generated method stub
		this.testParperDAO.clearParper(postId);
	}
	public void saveCentTable(String parperId, String questionId) {
		// TODO Auto-generated method stub
		this.testParperDAO.saveCentTable(parperId, questionId);
	}
	public TestParper getParperByName(String name) {
		// TODO Auto-generated method stub
		return this.testParperDAO.getParperByName(name);
	}
	public List<Testquestion> getTestParper(Map<String,Object> parmas) {
		// TODO Auto-generated method stub
		return this.testParperDAO.getTestParper(parmas);
	}
	
}
