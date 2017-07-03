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
			this.getHibernateTemplate().saveOrUpdate(c);
			
			return 1;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return 0;
		}
		
		

	}

	public List<CountResult> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from CountResult");
	}

}
