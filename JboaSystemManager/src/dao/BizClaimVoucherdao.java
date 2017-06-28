package dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.BizClaimVoucher;
@Transactional(propagation=Propagation.REQUIRED)
public interface BizClaimVoucherdao {

	public List<BizClaimVoucher> find_BizClaimVoucher();
	
	public List<BizClaimVoucher> find_BizClaimVoucher(String id);
	
	public int del(int id);
	
	public int update(BizClaimVoucher b);
	
	public int save(BizClaimVoucher b);
	
	public BizClaimVoucher details(int id);
	
	public int go_back(int id);
	
	public int pass(int id);
	
}
