package action;

import java.util.List;

import biz.YearCountresultDetailsbiz;

import com.opensymphony.xwork2.ActionSupport;

import entity.YearCountResult;
import entity.YearCountResultDetails;

public class YearResultDetailsAction extends ActionSupport {

	
	YearCountresultDetailsbiz yearbizDetails;
	
	List<YearCountResultDetails>list;
	
	int id;
	
	double sum;
	
	public String findAll(){
		
		list=yearbizDetails.findAll(id);
		
		return SUCCESS;
		
	}

	public YearCountresultDetailsbiz getYearbizDetails() {
		return yearbizDetails;
	}

	public void setYearbizDetails(YearCountresultDetailsbiz yearbizDetails) {
		this.yearbizDetails = yearbizDetails;
	}



	public List<YearCountResultDetails> getList() {
		return list;
	}

	public void setList(List<YearCountResultDetails> list) {
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	
	
	
}
