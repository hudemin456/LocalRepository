package biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import biz.SysPositionbiz;
import dao.SysPositiondao;

@Service("positionbiz")

public class SysPositionbizimpl implements SysPositionbiz {

	@Autowired
	
	SysPositiondao dao;
	
	public SysPositiondao getDao() {
		return dao;
	}

	public void setDao(SysPositiondao dao) {
		this.dao = dao;
	}
	
	
}
