package biz;

import java.util.List;

import entity.BizClaimVoucher;

public interface BizClaimVoucherbiz {

	public List<BizClaimVoucher> find_BizClaimVoucher(int index);
	
	public List<BizClaimVoucher> find_BizClaimVoucher(String id);
	
	public int del(int id);
	
	public int update(BizClaimVoucher b);
	
	public int save(BizClaimVoucher b);
	
	public BizClaimVoucher details(int id);
	
	public int go_back(int id);
	
	public int pass(int id);
	
	public int submit(int id);
	
	public List<Object[]> Count_Month();
	
	public List<Object[]> Count_Year();
	
	public List<Object[]> Count_Month_Deteils(int month,int year,String name);
	
	public List<Object[]> Count_Year_Deteils(int year,String name);
}
