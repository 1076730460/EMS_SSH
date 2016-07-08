package com.ems.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ems.dao.OptionDAO;
import com.ems.entity.Option;
@Repository("optionDAO")
public class OptionDAOImpl implements OptionDAO{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	public Option load(String id) {
		// TODO Auto-generated method stub
		return (Option)this.getCurrentSession().load(Option.class, id);
	}

	public Option get(String id) {
		// TODO Auto-generated method stub
		return (Option)this.getCurrentSession().get(Option.class, id);
	}

	public List<Option> findAll() {
		// TODO Auto-generated method stub
		return this.getCurrentSession().createQuery("form Option").setCacheable(true).list();
	}

	public void persist(Option entity) {
		// TODO Auto-generated method stub
		this.getCurrentSession().persist(entity);
	}

	public String save(Option entity) {
		// TODO Auto-generated method stub
		return (String)this.getCurrentSession().save(entity);
	}

	public void saveOrUpdate(Option entity) {
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

}
