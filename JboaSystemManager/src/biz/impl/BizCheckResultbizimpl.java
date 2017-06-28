package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.BizCheckResultbiz;
import dao.BizCheckResultdao;
import entity.BizCheckResult;

@Service("checkresultbiz")
public class BizCheckResultbizimpl implements BizCheckResultbiz {

	@Autowired
	
	BizCheckResultdao dao;

	public BizCheckResultdao getDao() {
		return dao;
	}

	public void setDao(BizCheckResultdao dao) {
		this.dao = dao;
	}

	public int save(BizCheckResult b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}

	public List<BizCheckResult> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	
	
}
