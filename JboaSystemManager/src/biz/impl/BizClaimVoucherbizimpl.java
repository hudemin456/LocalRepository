package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dao.BizClaimVoucherdao;
import entity.BizClaimVoucher;

import biz.BizClaimVoucherbiz;

@Service("claimvoucherbiz")
public class BizClaimVoucherbizimpl implements BizClaimVoucherbiz {
	
	@Autowired
	
	BizClaimVoucherdao dao;

	public BizClaimVoucherdao getDao() {
		return dao;
	}

	public void setDao(BizClaimVoucherdao dao) {
		this.dao = dao;
	}

	public List<BizClaimVoucher> find_BizClaimVoucher() {
		// TODO Auto-generated method stub
		return dao.find_BizClaimVoucher();
	}

	public int del(int id) {
		// TODO Auto-generated method stub
		return dao.del(id);
	}

	public int update(BizClaimVoucher b) {
		// TODO Auto-generated method stub
		return dao.update(b);
	}

	public int save(BizClaimVoucher b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}

	public List<BizClaimVoucher> find_BizClaimVoucher(String id) {
		// TODO Auto-generated method stub
		return dao.find_BizClaimVoucher(id);
	}

	public BizClaimVoucher details(int id) {
		// TODO Auto-generated method stub
		return dao.details(id);
	}

	public int go_back(int id) {
		// TODO Auto-generated method stub
		return dao.go_back(id);
	}

	public int pass(int id) {
		// TODO Auto-generated method stub
		return dao.pass(id);
	}
	
	
}
