package dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.BizClaimVoucherdao;
import entity.BizClaimVoucher;

@Repository("claimvoucherdao")
public class BizClaimVoucherdaoimpl extends HibernateDaoSupport implements BizClaimVoucherdao {

	//解决了在注解模式下 使用模板类的问题
		@Resource(name="sessionFactory")
		public void setSuperSessionFactory(SessionFactory sessionFactory){
			super.setSessionFactory(sessionFactory);
		}

		public List<BizClaimVoucher> find_BizClaimVoucher(int index) {
			
			if(index>0){
				return this.getHibernateTemplate().find("from BizClaimVoucher b where b.status='已提交' and totalAccount>5000");
			}else
			{
				return this.getHibernateTemplate().find("from BizClaimVoucher b where b.status='已提交' and totalAccount<=5000");
			}
			
		}

		public int del(int id) {

			
			try {
				BizClaimVoucher b = this.getHibernateTemplate().get(
						BizClaimVoucher.class, id);
				
				this.getHibernateTemplate().delete(b);
				
				return 1;
			} catch (Exception e) {
				return 0;
			}
			
		}

		public int update(BizClaimVoucher b) {
			
			try {
				BizClaimVoucher b1=	this.getHibernateTemplate().get(BizClaimVoucher.class, b.getId());
				
				b1.setTotalAccount(b.getTotalAccount());
				
				b1.setEvent(b.getEvent());
				
				this.getHibernateTemplate().update(b1);
				
				return 1;
			} catch (Exception e) {
				return 0;
			}
		}

		public int save(BizClaimVoucher b) {
			try {
				return  (Integer) this.getHibernateTemplate().save(b);
				
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}

		public List<BizClaimVoucher> find_BizClaimVoucher(String id) {
			return this.getHibernateTemplate().find("from BizClaimVoucher where create_sn=?",id);
		}

		public BizClaimVoucher details(int id) {
			List<BizClaimVoucher> list=this.getHibernateTemplate().find("from BizClaimVoucher where id=?",id);
			return list.get(0);
		}

		public int go_back(int id) {
			
			try {
				Query q = this
						.getSession()
						.createQuery(
								"update BizClaimVoucher b set b.status='已打回' where b.id=?");
				q.setInteger(0, id);
				q.executeUpdate();
				return 1;
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}

		public int pass(int id) {
			try {
				Query q = this
						.getSession()
						.createQuery(
								"update BizClaimVoucher b set b.status='已通过' where b.id=?");
				q.setInteger(0, id);
				q.executeUpdate();
				return 1;
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}

		public int submit(int id) {
			try {
				Query q = this
						.getSession()
						.createQuery(
								"update BizClaimVoucher b set b.status='已提交' where b.id=?");
				q.setInteger(0, id);
				q.executeUpdate();
				return 1;
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
}
