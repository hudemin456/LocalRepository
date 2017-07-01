package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.YearCountResultdao;

import entity.YearCountResult;
import biz.YearCountResultbiz;
@Service("yearbiz")
public class YearCountResultbizimpl implements YearCountResultbiz {

	@Autowired
	
	YearCountResultdao dao;
	
	public int save(YearCountResult y) {
		// TODO Auto-generated method stub
		return dao.save(y);
	}

	public List<YearCountResult> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public YearCountResultdao getDao() {
		return dao;
	}

	public void setDao(YearCountResultdao dao) {
		this.dao = dao;
	}

	
	
}
