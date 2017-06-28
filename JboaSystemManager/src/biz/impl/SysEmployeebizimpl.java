package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import biz.SysEmployeebiz;
import dao.SysEmployeedao;
import entity.SysEmployee;

@Service("employeebiz")
public class SysEmployeebizimpl implements SysEmployeebiz {

	@Autowired
	
	SysEmployeedao dao;
	
	public SysEmployeedao getDao() {
		return dao;
	}

	public void setDao(SysEmployeedao dao) {
		this.dao = dao;
	}

	public SysEmployee login(String name, String pwd) {
		// TODO Auto-generated method stub
		return dao.login(name, pwd);
	}

	public List<SysEmployee> find_employee() {
		// TODO Auto-generated method stub
		return dao.find_employee();
	}

	public SysEmployee find_Manager() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
