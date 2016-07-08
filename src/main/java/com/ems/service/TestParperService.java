package com.ems.service;

import java.util.List;
import java.util.Map;

import com.ems.entity.TestParper;
import com.ems.entity.Testquestion;

public interface TestParperService {
	public List<TestParper> findAll();
	public String save(TestParper entity);
	public TestParper get(String id);
	public void saveOrUpdate(TestParper entity);
	public List<Testquestion> getParpers(String parperId);
	public void clearParper(String postId);
	public void saveCentTable(String parperId,String questionId);
	public TestParper getParperByName(String name);
	public List<Testquestion> getTestParper(Map<String,Object> parmas);
}
