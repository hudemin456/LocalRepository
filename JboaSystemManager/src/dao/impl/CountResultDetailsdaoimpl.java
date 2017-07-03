package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.CountResultDetailsdao;
import entity.CountResultDetails;

@Repository("monthDetailsresult")
public class CountResultDetailsdaoimpl extends HibernateDaoSupport implements CountResultDetailsdao {

	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
	public List<CountResultDetails> findAll(int id) {

		return this.getHibernateTemplate().find("from CountResultDetails c where c.countResult.id=?",id);
	}

	public int save(CountResultDetails c) {

		return (Integer) this.getHibernateTemplate().save(c);
	}

}
