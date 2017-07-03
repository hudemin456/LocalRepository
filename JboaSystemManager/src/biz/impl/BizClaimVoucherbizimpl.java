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

	public List<BizClaimVoucher> find_BizClaimVoucher(int index) {
		// TODO Auto-generated method stub
		return dao.find_BizClaimVoucher(index);
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

	public int submit(int id) {
		// TODO Auto-generated method stub
		return dao.submit(id);
	}

	public List<Object[]> Count_Month() {
		// TODO Auto-generated method stub
		return dao.Count_Month();
	}

	public List<Object[]> Count_Year() {
		// TODO Auto-generated method stub
		return dao.Count_Year();
	}

	public List<Object[]> Count_Month_Deteils(int month, int year, String name) {
		// TODO Auto-generated method stub
		return dao.Count_Month_Deteils(month, year, name);
		
	}

	public List<Object[]> Count_Year_Deteils(int year) {
		// TODO Auto-generated method stub
		return dao.Count_Year_Deteils(year);
	}
	
	
}
