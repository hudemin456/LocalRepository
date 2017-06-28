package biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.BizLeavebiz;
import dao.BizLeavedao;
@Service("leavebiz")
public class BizLeavebizimpl implements BizLeavebiz {

	@Autowired
	
	BizLeavedao dao;

	public BizLeavedao getDao() {
		return dao;
	}

	public void setDao(BizLeavedao dao) {
		this.dao = dao;
	}
	
	
}
