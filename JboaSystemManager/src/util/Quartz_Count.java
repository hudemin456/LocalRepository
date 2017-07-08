package util;

import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import entity.BizClaimVoucher;
import entity.CountResult;
import entity.CountResultDetails;
import entity.YearCountResult;
import entity.YearCountResultDetails;

import biz.BizClaimVoucherbiz;
import biz.CountResultDetailsbiz;
import biz.CountResultbiz;
import biz.YearCountResultbiz;
import biz.YearCountresultDetailsbiz;

public class Quartz_Count extends QuartzJobBean {

	private BizClaimVoucherbiz claimvoucherbiz;

	private CountResultbiz countbiz;

	private CountResultDetailsbiz detailsbiz;

	private YearCountResultbiz yearbiz;

	private YearCountresultDetailsbiz yearDetailsbiz;
	
	

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		


		try {
			List<Object[]> list = claimvoucherbiz.Count_Month();

			// �����Ѳ�ѯ���������ݴ浽ͳ�Ʊ���
			for (Object[] aa : list) {

				CountResult c = new CountResult();

				c.setTotalAccount((Double) aa[0]);
				c.setYear(Integer.parseInt((String) aa[1]));
				c.setMonth(Integer.parseInt((String) aa[2]));
				c.setPositionName((String) aa[3]);

				// �õ������������ݵ�����
				countbiz.save(c);

				
			}

			// ��ѯ�ո�������ȥ��ͳ�Ʊ�
			List<CountResult> newlist = countbiz.findAll();

			for (CountResult countResult : newlist) {

				// �������ݲ�ѯ���鼯��
				int month = countResult.getMonth();

				int year = countResult.getYear();

				String name = countResult.getPositionName();

				List<Object[]> deteils_list = claimvoucherbiz
						.Count_Month_Deteils(month, year, name);

				for (Object[] bb : deteils_list) {
					// �����������
					CountResultDetails crd = new CountResultDetails();

					crd.setName((String) bb[0]);

					crd.setCountResult(countResult);

					crd.setMoney(Double.parseDouble(String.valueOf(bb[1])));

					crd.setYear(Integer.parseInt((String) bb[2]));

					crd.setMonth(Integer.parseInt((String) bb[3]));

					crd.setPositionName((String) bb[4]);

					detailsbiz.save(crd);
				}

			}
			
			
			//�������ͳ�Ƶ�����
			
			List<Object[]> year_list = claimvoucherbiz.Count_Year();

			// �����Ѳ�ѯ����������ݴ浽���ͳ�Ʊ���
						for (Object[] aa : year_list) {

							YearCountResult y = new YearCountResult();
							
							y.setTotalAccount((Double) aa[0]);
							y.setYear(Integer.parseInt((String)aa[1]));
							y.setPositionName((String)aa[2]);

							// �õ������������ݵ�����
							yearbiz.save(y);

						}
			
						
						// ��ѯ�ո�������ȥ�����ͳ�Ʊ�
						List<YearCountResult> newyear_list = yearbiz.findAll();

						for (YearCountResult yearcountResult : newyear_list) {

							// �������ݲ�ѯ���鼯��

							int year = yearcountResult.getYear();

							String name = yearcountResult.getPositionName();

							List<Object[]> deteils_list =claimvoucherbiz.Count_Year_Deteils(year, name);
									

							for (Object[] bb : deteils_list) {
								// �����������
								YearCountResultDetails ycrd = new YearCountResultDetails();

								ycrd.setName((String) bb[0]);
								
								ycrd.setMoney(Double.parseDouble(String.valueOf(bb[1])));
								
								ycrd.setYear(Integer.parseInt((String)bb[2]));
								
								ycrd.setPositionName((String) bb[3]);
								
								ycrd.setYearCountResult(yearcountResult);

								yearDetailsbiz.save(ycrd);
							}

						}
			
			

		} catch (Exception e) {
		
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

	public YearCountResultbiz getYearbiz() {
		return yearbiz;
	}

	public void setYearbiz(YearCountResultbiz yearbiz) {
		this.yearbiz = yearbiz;
	}

	public YearCountresultDetailsbiz getYearDetailsbiz() {
		return yearDetailsbiz;
	}

	public void setYearDetailsbiz(YearCountresultDetailsbiz yearDetailsbiz) {
		this.yearDetailsbiz = yearDetailsbiz;
	}

	
}
