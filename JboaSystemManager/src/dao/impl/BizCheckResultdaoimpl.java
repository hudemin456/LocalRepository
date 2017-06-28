package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.BizCheckResultdao;
import entity.BizCheckResult;

@Repository("checkresultdao")
public class BizCheckResultdaoimpl extends HibernateDaoSupport implements BizCheckResultdao {

	//�������ע��ģʽ�� ʹ��ģ���������
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

	public int save(BizCheckResult b) {
		
		return (Integer) this.getHibernateTemplate().save(b);

	}

	public List<BizCheckResult> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from BizCheckResult");
	}
	
	
}
