package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.YearCountResultdao;
import entity.YearCountResult;

@Repository("yearcount")
public class YearCountResultdaoimpl extends HibernateDaoSupport implements YearCountResultdao {
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
	public int save(YearCountResult y) {
		return (Integer) this.getHibernateTemplate().save(y);
	}

	public List<YearCountResult> findAll() {
		return this.getHibernateTemplate().find("from YearCountResult");
	}

}
