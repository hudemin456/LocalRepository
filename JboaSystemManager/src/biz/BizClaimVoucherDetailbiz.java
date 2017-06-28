package biz;

import java.util.List;

import entity.BizClaimVoucherDetail;

public interface BizClaimVoucherDetailbiz {

	public List<BizClaimVoucherDetail> findByid(int id);
	
	public int update(BizClaimVoucherDetail b);
	
	public int del(int id);
	
	public int save(BizClaimVoucherDetail b);
}
