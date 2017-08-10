package dao.impl;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.YearCountresultDetailsdao;
import entity.YearCountResultDetails;

@Repository("yearDetails")
public class YearCountresultDetailsdaoimpl extends HibernateDaoSupport implements YearCountresultDetailsdao {

	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

	public List<YearCountResultDetails> findAll(int id) {

		return this.getHibernateTemplate().find("from YearCountResultDetails y where y.yearCountResult.id=? ",id);
		
	}

	public int save(YearCountResultDetails y) {
		// TODO Auto-generated method stub
		return (Integer) this.getHibernateTemplate().save(y);
	}
	
}
