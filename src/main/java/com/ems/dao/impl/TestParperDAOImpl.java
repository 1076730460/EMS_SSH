package com.ems.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import com.ems.dao.TestParperDAO;
import com.ems.entity.TestParper;
import com.ems.entity.Testquestion;

/**
 * create time 2016.6.22
 * 
 * @author gjp
 * 
 */
@Repository("testParperDAO")
public class TestParperDAOImpl implements TestParperDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public TestParper load(String id) {
		// TODO Auto-generated method stub
		return (TestParper) this.getCurrentSession().load(TestParper.class, id);
	}

	public TestParper get(String id) {
		// TODO Auto-generated method stub
		return (TestParper) this.getCurrentSession().get(TestParper.class, id);
	}

	public List<TestParper> findAll() {
		// TODO Auto-generated method stub
		List<TestParper> testParperList = this.getCurrentSession()
				.createQuery("from TestParper").setCacheable(true).list();
		return testParperList;
	}

	public void persist(TestParper entity) {
		// TODO Auto-generated method stub
		this.getCurrentSession().persist(entity);

	}

	public String save(TestParper entity) {
		// TODO Auto-generated method stub
		return this.getCurrentSession().save(entity).toString();
	}

	public void saveOrUpdate(TestParper entity) {
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
	
	public List<Testquestion> getParpers(String parperId) {
		// TODO Auto-generated method stub
		Query query = this
				.getCurrentSession()
				.createQuery(
						"select tq from Testquestion as tq inner join tq.parper as p where p.id=:id");
		query.setString("id", parperId);
		return query.list();
	}

	public void clearParper(String postId) {
		// TODO Auto-generated method stub
		String hql = "update Testquestion set lib=''  where post=?";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setString(0, postId);
		query.executeUpdate();
	}

	public void saveCentTable(String parperId, String questionId) {
		// TODO Auto-generated method stub
		String sql = "insert into ems_parper_question values(?,?)";
		SQLQuery query = this.getCurrentSession().createSQLQuery(sql);
		query.setString(0, questionId);
		query.setString(1, parperId);
		query.executeUpdate();
	}

	public TestParper getParperByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from TestParper where name=?";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setString(0, name);
		List<TestParper> list = query.list();
		return list.get(0);
	}

	public List<Testquestion> getTestParper(Map<String,Object> parmas) {
		// TODO Auto-generated method stub
		List<Testquestion> result = new ArrayList<Testquestion>();
		//单选题
		String sqlRadio = "select tq.* from ems_testquestion tq,ems_post p,ems_testquestiontype t where tq.post=p.id and tq.type=t.id and p.name=? and t.name='单选题'  ORDER BY rand() LIMIT "+parmas.get("radio").toString();
		SQLQuery query = this.getCurrentSession().createSQLQuery(sqlRadio).addEntity(Testquestion.class);
		query.setString(0, parmas.get("post").toString());
		//query.setInteger(1, Integer.parseInt(parmas.get("radio").toString()));
		List<Testquestion> radioList = query.list();
		if(radioList.size()>0)
		result.addAll(radioList);
		
		//多选题
		String sqlCheckbox = "select tq.* from ems_testquestion tq,ems_post p,ems_testquestiontype t where tq.post=p.id and tq.type=t.id and p.name=? and t.name='多选题' ORDER BY rand() LIMIT "+parmas.get("checkbox").toString();
		SQLQuery queryCheckbox = this.getCurrentSession().createSQLQuery(sqlCheckbox).addEntity(Testquestion.class);
		queryCheckbox.setString(0, parmas.get("post").toString());
		List<Testquestion> checkboxList = queryCheckbox.list();
		if(checkboxList.size()>0)
		result.addAll(checkboxList);
		
		//判断题
		String sqlPanDuan = "select tq.* from ems_testquestion tq,ems_post p,ems_testquestiontype t where tq.post=p.id and tq.type=t.id and p.name=? and t.name='判断题' ORDER BY rand() LIMIT "+parmas.get("panduan").toString();
		SQLQuery queryPanDuan = this.getCurrentSession().createSQLQuery(sqlPanDuan).addEntity(Testquestion.class);
		queryPanDuan.setString(0, parmas.get("post").toString());
		List<Testquestion> panduanList = queryPanDuan.list();
		if(panduanList.size()>0)
		result.addAll(panduanList);
		
		//思维题
		String sqlSiWei = "select tq.* from ems_testquestion tq,ems_post p,ems_testquestiontype t where tq.post=p.id and tq.type=t.id and p.name=? and t.name='思维题' ORDER BY rand() LIMIT "+parmas.get("common").toString();
		SQLQuery querySiWei = this.getCurrentSession().createSQLQuery(sqlSiWei).addEntity(Testquestion.class);
		querySiWei.setString(0, parmas.get("commonPost").toString());
		List<Testquestion> siWeiList = querySiWei.list();
		if(siWeiList.size()>0)
		result.addAll(siWeiList);
		
		return result;
	}

}
