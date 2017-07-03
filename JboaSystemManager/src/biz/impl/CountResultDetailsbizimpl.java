package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CountResultDetailsdao;

import entity.CountResultDetails;
import biz.CountResultDetailsbiz;
@Service("monthDetailsbiz")
public class CountResultDetailsbizimpl  implements CountResultDetailsbiz {

	@Autowired
	CountResultDetailsdao dao;
	
	public List<CountResultDetails> findAll(int id) {
		// TODO Auto-generated method stub
		return dao.findAll(id);
	}

	public int save(CountResultDetails c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}

	public CountResultDetailsdao getDao() {
		return dao;
	}

	public void setDao(CountResultDetailsdao dao) {
		this.dao = dao;
	}
	
	

}
