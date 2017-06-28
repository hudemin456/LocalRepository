package biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import biz.SysDepartmentbiz;
import dao.SysDepartmentdao;

@Service("departmentbiz")
public class SysDepartmentbizimpl implements SysDepartmentbiz{

	@Autowired
	
	SysDepartmentdao dao;

	public SysDepartmentdao getDao() {
		return dao;
	}

	public void setDao(SysDepartmentdao dao) {
		this.dao = dao;
	}
	
	
}
