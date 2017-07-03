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

		public List<Object[]> Count_Month() {

			return this.getHibernateTemplate().find("select sum(b.totalAccount) as count,to_CHAR(b.createTime,'YYYY') as year ,to_CHAR(b.createTime,'MM') as month," +
					"d.name as name from BizClaimVoucher b,SysEmployee s,SysDepartment d "+
					"where b.sysEmployeeByCreateSn.sn=s.sn and d.id=s.sysDepartment.id and b.status='已通过' "+
					" group by to_CHAR(b.createTime,'MM'),to_CHAR(b.createTime,'YYYY'),d.name");
			
		
		}

		public List<Object[]> Count_Year() {
			return this.getHibernateTemplate().find("select sum(b.totalAccount),to_CHAR(b.createTime,'YYYY')," +
					"d.name from BizClaimVoucher b,SysEmployee s,SysDepartment d "+
					"where b.sysEmployeeByCreateSn.sn=s.sn and d.id=s.sysDepartment.id and b.status='已通过'"+
					" group by to_CHAR(b.createTime,'YYYY'),d.name");
		}

		@SuppressWarnings("unchecked")
		public List<Object[]> Count_Month_Deteils(int month, int year,String name) {
			
			/*System.out.println("进来了");
			
			List<Object[]> list= this.getHibernateTemplate().find("select s.name,sum(b.totalAccount),to_CHAR(b.createTime,'YYYY'),to_CHAR(b.createTime,'MM'),d.name "+
					"from BizClaimVoucher b,SysDepartment d,SysEmployee s,BizClaimVoucherDetail "+
					"where b.sysEmployeeByCreateSn.sn=s.sn and d.id=s.sysDepartment.id and " +
					"to_CHAR(b.createTime,'MM')=? and to_CHAR(b.createTime,'YYYY')=? and d.name=?  " +
					"group by s.name,to_CHAR(b.createTime,'YYYY'),to_CHAR(b.createTime,'MM'),d.name ",month,year,name);
			
			System.out.println();
*/

			try {
				Query q = this.getSession().createQuery("select s.name,sum(b.totalAccount),to_CHAR(b.createTime,'YYYY'),to_CHAR(b.createTime,'MM'),d.name "+
						"from BizClaimVoucher b,SysDepartment d,SysEmployee s "+
						"where b.sysEmployeeByCreateSn.sn=s.sn and d.id=s.sysDepartment.id and " +
						"to_CHAR(b.createTime,'MM')=? and to_CHAR(b.createTime,'YYYY')=? and d.name=?  and b.status='已通过' " +
						"group by s.name,to_CHAR(b.createTime,'YYYY'),to_CHAR(b.createTime,'MM'),d.name ");

				q.setInteger(0, month);
				q.setInteger(1, year);
				q.setString(2, name);
				List<Object[]> list=q.list();
				return list;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			
		}

		public List<Object[]> Count_Year_Deteils(int year) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
}
