package dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.BizClaimVoucherDetail;

@Transactional(propagation=Propagation.REQUIRED)
public interface BizClaimVoucherDetaildao {

	public List<BizClaimVoucherDetail> findByid(int id);
	
	public int update(BizClaimVoucherDetail b);
	
	public int del(int id);
	
	public int save(BizClaimVoucherDetail b);
}
