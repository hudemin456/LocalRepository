package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.faqs;
import com.service.faqsService;

@Controller
public class faqsController {
			@Resource(name="fser")
			faqsService fser;

			public faqsService getFser() {
				return fser;
			}

			public void setFser(faqsService fser) {
				this.fser = fser;
			}
			@RequestMapping("insertFaqs")
			public String insertFaqs(faqs f){
					fser.insertFaqs(f);
				return "findAll";
			}
			@RequestMapping("deleteFaqs")
			public String deleteFaqs(int fid){
				fser.deleteFaqs(fid);
				return "findAll";
			}
			@RequestMapping("findAll")
			public String findAll(Integer page,HttpServletRequest request){
				int count=0;
				int countpage=0;
				if(page==null)
				{
					page=1;
				}
					count=fser.countFaqs();
					if(count%3==0){
						countpage=count/3;
					}else{
						countpage=count/3+1;
					}
					if(page<1){
						page=1;
					}else if(page>countpage){
						page=countpage;
					}
				List<faqs> list = fser.findAll((page-1)*3);
				request.getSession().setAttribute("all", list);
				request.getSession().setAttribute("page", page);
				request.getSession().setAttribute("countpage", countpage);
				return "index.jsp";
			}
}
