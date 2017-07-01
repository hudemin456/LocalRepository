package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.CountResultdao;
import entity.CountResult;

@Repository("monthresult")
public class CountResultdaoimpl extends HibernateDaoSupport implements CountResultdao {
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

	public int save(CountResult c) {
		
		return (Integer) this.getHibernateTemplate().save(c);

	}

	public List<CountResult> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from CountResult");
	}

}
