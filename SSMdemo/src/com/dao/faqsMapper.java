package com.dao;

import java.util.List;

import com.pojo.faqs;

public interface faqsMapper {
				
				public List<faqs> findAll(int page);
				public int countFaqs();
				public int insertFaqs(faqs f);
				public int deleteFaqs(int fid);
				public int updateFaqs(faqs f);
				public faqs findById(int fid);
}
