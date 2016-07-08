package com.ems.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ems.dao.TestDAO;
import com.ems.entity.Test;
@Repository("testDAO")
public class TestDAOImpl implements TestDAO{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	public Test load(String id) {
		// TODO Auto-generated method stub
		return (Test)this.getCurrentSession().load(Test.class, id);
	}

	public Test get(String id) {
		// TODO Auto-generated method stub
		return (Test)this.getCurrentSession().get(Test.class, id);
	}

	public List<Test> findAll() {
		// TODO Auto-generated method stub
		return this.getCurrentSession().createQuery("from Test").setCacheable(true).list();
	}

	public void persist(Test entity) {
		// TODO Auto-generated method stub
		this.getCurrentSession().persist(entity);
	}

	public String save(Test entity) {
		// TODO Auto-generated method stub
		return (String)this.getCurrentSession().save(entity);
	}

	public void saveOrUpdate(Test entity) {
		// TODO Auto-generated method stub
		this.getCurrentSession().saveOrUpdate(entity);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		this.getCurrentSession().delete(id);
	}

	public void flush() {
		// TODO Auto-generated method stub
		this.getCurrentSession().flush();
	}
	public List getTestByUserId(String userId) {
		// TODO Auto-generated method stub
		String sql = "select tq.id,tq.`name`,tq.rightOption,o.optionA,o.optionB,o.optionC,o.optionD,t.selectOption,t.currentTiems from ems_test t,ems_testquestion tq,ems_option o where tq.optionId=o.id and t.questionId=tq.id and t.userId=?";
		SQLQuery query = this.getCurrentSession().createSQLQuery(sql);
		query.setString(0, userId);
		return query.list();
	}

}
