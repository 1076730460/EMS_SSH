package com.ems.dao;

import java.util.List;
import java.util.Map;

import com.ems.entity.TestParper;
import com.ems.entity.Testquestion;

public interface TestParperDAO extends GenericDAO<TestParper, String>{
	public List<Testquestion> getParpers(String parperId);
	public void clearParper(String postId);
	public void saveCentTable(String parperId,String questionId);
	public TestParper getParperByName(String name);
	public List<Testquestion> getTestParper(Map<String,Object> parmas);
}
