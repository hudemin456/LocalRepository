package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.SysEmployeedao;
import entity.SysEmployee;

@Repository("employeedao")
public class SysEmployeedaoimpl extends HibernateDaoSupport implements SysEmployeedao {

	//解决了在注解模式下 使用模板类的问题
			@Resource(name="sessionFactory")
			public void setSuperSessionFactory(SessionFactory sessionFactory){
				super.setSessionFactory(sessionFactory);
			}

			@SuppressWarnings("unchecked")
			public SysEmployee login(String name, String pwd) {

				List<SysEmployee>list= this.getHibernateTemplate().find("from SysEmployee where name=? and password=?",name,pwd);
					
				return list.get(0);
				
			}

			@SuppressWarnings("unchecked")
			public List<SysEmployee> find_employee() {

				return this.getHibernateTemplate().find("from SysEmployee");
				
			}

			public SysEmployee find_Manager() {
				// TODO Auto-generated method stub
				List<SysEmployee>list= this.getHibernateTemplate().find("from SysEmployee where name=? and password=?","胡德民","123");
				
				return list.get(0);
			}
			
}
