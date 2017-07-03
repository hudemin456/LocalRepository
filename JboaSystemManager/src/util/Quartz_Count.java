package util;

import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import entity.BizClaimVoucher;
import entity.CountResult;
import entity.CountResultDetails;
import entity.YearCountResult;

import biz.BizClaimVoucherbiz;
import biz.CountResultDetailsbiz;
import biz.CountResultbiz;

public class Quartz_Count  extends QuartzJobBean {

	
	private BizClaimVoucherbiz claimvoucherbiz;
	
	private CountResultbiz countbiz;
	
	private CountResultDetailsbiz detailsbiz;
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
	
		try {
			List<Object[]>list=claimvoucherbiz.Count_Month();
			
			int i=0;
			
			//遍历把查询出来的数据存到统计表中
			for (Object[] aa : list) {
				
				CountResult c=new CountResult();
				
				c.setTotalAccount( (Double) aa[0]); 
				c.setYear(Integer.parseInt((String) aa[1]));
				c.setMonth(Integer.parseInt((String) aa[2]));
				c.setPositionName((String) aa[3]);
 
				//拿到新增进入数据的主键
				countbiz.save(c);
				

				i++;
			}
			
			//查询刚刚新增进去的统计表
			List<CountResult>newlist=countbiz.findAll();
			
			for (CountResult countResult : newlist) {
					
				//根据数据查询详情集合
				int month=countResult.getMonth();
				
				int year=countResult.getYear();
				
				String name=countResult.getPositionName();

				List<Object[]> deteils_list = claimvoucherbiz.Count_Month_Deteils(month,year,name);
			

				for (Object[] bb : deteils_list) {
					//创建详情对象
					CountResultDetails crd=new CountResultDetails();
					
					crd.setName((String) bb[0]);

					crd.setCountResult(countResult);
					
					crd.setMoney(Double.parseDouble(String.valueOf(bb[1])));
					
					crd.setYear(Integer.parseInt((String) bb[2]));
					
					crd.setMonth(Integer.parseInt((String) bb[3]));
					
					crd.setPositionName((String) bb[4]);
					
					detailsbiz.save(crd);
				}
				
			}
			
	
		//现在的需求就是要拿到主键，然后建立遍历 用来遍历新增详情表 现在问题在于 如果我用save 那我下次进来这个方法的时候就会
		//出现主键冲突的问题，如果我不用 那saveOrUpdate则不能返回主键。

		/*	List<Object[]>year=claimvoucherbiz.Count_Year();
			
			for (Object[] bb : year) {
				YearCountResult y=new YearCountResult();
				
				y.setTotalAccount(Integer.parseInt((String) bb[0]));
				y.setYear(Integer.parseInt((String) bb[1]));
				y.setPositionName((String) bb[2]);
				
				
			}*/
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public BizClaimVoucherbiz getClaimvoucherbiz() {
		return claimvoucherbiz;
	}



	public void setClaimvoucherbiz(BizClaimVoucherbiz claimvoucherbiz) {
		this.claimvoucherbiz = claimvoucherbiz;
	}



	public CountResultbiz getCountbiz() {
		return countbiz;
	}



	public void setCountbiz(CountResultbiz countbiz) {
		this.countbiz = countbiz;
	}

	public CountResultDetailsbiz getDetailsbiz() {
		return detailsbiz;
	}

	public void setDetailsbiz(CountResultDetailsbiz detailsbiz) {
		this.detailsbiz = detailsbiz;
	}



	
	

}
