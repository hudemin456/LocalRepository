package dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.SysPositiondao;

@Repository("positiondao")
public class SysPositiondaoimpl extends HibernateDaoSupport implements SysPositiondao {

	//解决了在注解模式下 使用模板类的问题
			@Resource(name="sessionFactory")
			public void setSuperSessionFactory(SessionFactory sessionFactory){
				super.setSessionFactory(sessionFactory);
			}
			
}
