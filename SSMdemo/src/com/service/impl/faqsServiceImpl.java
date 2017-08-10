package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.faqsMapper;
import com.pojo.faqs;
import com.service.faqsService;
@Service("fser")
public class faqsServiceImpl implements faqsService {
@Resource(name="fdao")
		faqsMapper fdao;
	public faqsMapper getFdao() {
	return fdao;
}

public void setFdao(faqsMapper fdao) {
	this.fdao = fdao;
}

	public List<faqs> findAll(int page) {
		return fdao.findAll(page);
	}

	public int countFaqs() {
		return fdao.countFaqs();
	}

	public int insertFaqs(faqs f) {
		// TODO Auto-generated method stub
		return fdao.insertFaqs(f);
	}

	public int deleteFaqs(int fid) {
		// TODO Auto-generated method stub
		return fdao.deleteFaqs(fid);
	}

	public int updateFaqs(faqs f) {
		// TODO Auto-generated method stub
		return fdao.updateFaqs(f);
	}

	public faqs findById(int fid) {
		// TODO Auto-generated method stub
		return fdao.findById(fid);
	}

}
