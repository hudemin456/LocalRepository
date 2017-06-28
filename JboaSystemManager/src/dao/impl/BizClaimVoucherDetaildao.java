package dao.impl;


import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import entity.BizClaimVoucherDetail;

@Repository("claimvoucherdetaildao")
public class BizClaimVoucherDetaildao extends HibernateDaoSupport implements dao.BizClaimVoucherDetaildao {

	//解决了在注解模式下 使用模板类的问题
			@Resource(name="sessionFactory")
			public void setSuperSessionFactory(SessionFactory sessionFactory){
				super.setSessionFactory(sessionFactory);
			}

			public List<BizClaimVoucherDetail> findByid(int id) {
				// TODO Auto-generated method stub
				return this.getHibernateTemplate().find("from BizClaimVoucherDetail where id=?",id);
			}

			public int update(BizClaimVoucherDetail b) {
				try {
					// TODO Auto-generated method stub
					this.getHibernateTemplate().update(b);
					
					return 1;
				} catch (Exception e) {
					return 0;
				}
				
			}

			public int del(int id) {

				try {
					
					Query q= getSession().createQuery("delete from BizClaimVoucherDetail where bizClaimVoucher.id=?");
					
					q.setInteger(0, id);
					
					q.executeUpdate();
					
					return 1;
					
				} catch (Exception e) {
					
					e.printStackTrace();
					
					return 0;
				}

			}

			public int save(BizClaimVoucherDetail b) {
				return (Integer) this.getHibernateTemplate().save(b);
			}
			
}
