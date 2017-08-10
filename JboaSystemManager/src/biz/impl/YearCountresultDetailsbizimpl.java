package biz.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import biz.YearCountresultDetailsbiz;

import dao.YearCountresultDetailsdao;
import entity.YearCountResultDetails;
@Service("yearbizDetails")
public class YearCountresultDetailsbizimpl  implements YearCountresultDetailsbiz {

	@Autowired
	
	YearCountresultDetailsdao dao;

	public YearCountresultDetailsdao getDao() {
		return dao;
	}

	public void setDao(YearCountresultDetailsdao dao) {
		this.dao = dao;
	}

	public int save(YearCountResultDetails y) {

		return dao.save(y);
	}

	public List<YearCountResultDetails> findAll(int id) {
		
		return dao.findAll(id);
	}



	
	
	
}
