package biz.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CountResultdao;

import entity.CountResult;
import biz.CountResultbiz;
@Service("monthbiz")
public class CountResultbizimpl implements CountResultbiz {
	
	@Autowired
	CountResultdao dao;
	
	public int save(CountResult c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}

	public List<CountResult> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public CountResultdao getDao() {
		return dao;
	}

	public void setDao(CountResultdao dao) {
		this.dao = dao;
	}
	
	

}
