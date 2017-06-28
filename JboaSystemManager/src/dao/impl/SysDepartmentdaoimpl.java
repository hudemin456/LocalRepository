package dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.SysDepartmentdao;

@Repository("departmentdao")
public class SysDepartmentdaoimpl extends HibernateDaoSupport implements SysDepartmentdao {

	//�������ע��ģʽ�� ʹ��ģ���������
			@Resource(name="sessionFactory")
			public void setSuperSessionFactory(SessionFactory sessionFactory){
				super.setSessionFactory(sessionFactory);
			}
			
}
