package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BizClaimVoucherDetaildao;
import entity.BizClaimVoucherDetail;

import biz.BizClaimVoucherDetailbiz;

@Service("claimvoucherdetailbiz")
public class BizClaimVoucherDetailbizimpl implements BizClaimVoucherDetailbiz {

	@Autowired
	BizClaimVoucherDetaildao dao;

	public BizClaimVoucherDetaildao getDao() {
		return dao;
	}

	public void setDao(BizClaimVoucherDetaildao dao) {
		this.dao = dao;
	}

	public List<BizClaimVoucherDetail> findByid(int id) {
		// TODO Auto-generated method stub
		return dao.findByid(id);
	}

	public int update(BizClaimVoucherDetail b) {
		// TODO Auto-generated method stub
		return dao.update(b);
	}

	public int del(int id) {
		// TODO Auto-generated method stub
		return dao.del(id);
	}

	public int save(BizClaimVoucherDetail b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}
	
	
	
}
