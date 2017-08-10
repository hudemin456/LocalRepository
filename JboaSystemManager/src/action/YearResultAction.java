package action;

import java.util.List;

import biz.YearCountResultbiz;

import com.opensymphony.xwork2.ActionSupport;

import entity.YearCountResult;

public class YearResultAction extends ActionSupport {

	
	List<YearCountResult>list;
	
	int id;
	
	
	YearCountResultbiz yearbiz;
	
	public String findAll(){
		
		list=yearbiz.findAll();
		
		return SUCCESS;
		
	}

	public List<YearCountResult> getList() {
		return list;
	}

	public void setList(List<YearCountResult> list) {
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public YearCountResultbiz getYearbiz() {
		return yearbiz;
	}

	public void setYearbiz(YearCountResultbiz yearbiz) {
		this.yearbiz = yearbiz;
	}
	
	
	
}
