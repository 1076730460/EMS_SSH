package com.ems.dao;

import java.util.List;

import com.ems.entity.Test;

public interface TestDAO extends GenericDAO<Test, String>{
	public List getTestByUserId(String userId);
}
