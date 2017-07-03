package action;

import java.util.List;

import biz.CountResultbiz;

import com.opensymphony.xwork2.ActionSupport;

import entity.CountResult;

public class CountResultAction extends ActionSupport{

	private CountResultbiz monthbiz;
	
	private List<CountResult> list;
	
	private int id;

	public CountResultbiz getMonthbiz() {
		return monthbiz;
	}

	public void setMonthbiz(CountResultbiz monthbiz) {
		this.monthbiz = monthbiz;
	}

	public List<CountResult> getList() {
		return list;
	}

	public void setList(List<CountResult> list) {
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String Count_Month(){
		
		list=monthbiz.findAll();
		
		return SUCCESS;
		
	}
	
	
	
}
