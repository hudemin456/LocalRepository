package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
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
		
		try {
			this.getHibernateTemplate().save(c);
			
			return 1;
		} catch (DataAccessException e) {

			return 0;
			
		}

	}

	public List<CountResult> findAll() {
	
		 List<CountResult> list=this.getHibernateTemplate().find("from CountResult");
		
		return list;
	}

}
