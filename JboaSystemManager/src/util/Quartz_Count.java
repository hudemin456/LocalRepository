package util;

import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import entity.BizClaimVoucher;
import entity.CountResult;

import biz.BizClaimVoucherbiz;
import biz.CountResultbiz;

public class Quartz_Count  extends QuartzJobBean {

	
	private BizClaimVoucherbiz claimvoucherbiz;
	
	private CountResultbiz countbiz;
	
	
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
	
		try {
			List<Object[]>list=claimvoucherbiz.Count_Month();
			
			int i=0;
			
			for (Object[] aa : list) {
				
				CountResult c=new CountResult();

				c.setTotalAccount( (Double) aa[0]); 
				c.setYear(Integer.parseInt((String) aa[1]));
				c.setMonth(Integer.parseInt((String) aa[2]));
				c.setPositionName((String) aa[3]);
 
				countbiz.save(c);
				i++;
			}
			
			System.out.println("ss");
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


	
	

}
