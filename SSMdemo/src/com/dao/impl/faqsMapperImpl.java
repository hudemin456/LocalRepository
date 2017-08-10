package com.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dao.faqsMapper;
import com.pojo.faqs;
@Repository("fdao")
public class faqsMapperImpl  extends SqlSessionDaoSupport implements faqsMapper{
@Resource(name="sqlSessionTemplate")
				public void setsqlSessionTemplate(SqlSessionTemplate sst){
					super.setSqlSessionTemplate(sst);
}
	public List<faqs> findAll(int page) {
		return getSqlSession().getMapper(faqsMapper.class).findAll(page);
	}

	public int countFaqs() {
		return getSqlSession().getMapper(faqsMapper.class).countFaqs();
	}

	public int insertFaqs(faqs f) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(faqsMapper.class).insertFaqs(f);
	}

	public int deleteFaqs(int fid) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(faqsMapper.class).deleteFaqs(fid);
	}

	public int updateFaqs(faqs f) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(faqsMapper.class).updateFaqs(f);
	}

	public faqs findById(int fid) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(faqsMapper.class).findById(fid);
	}

}
