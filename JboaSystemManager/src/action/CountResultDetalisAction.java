package action;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import util.ToExcelDao;

import biz.CountResultDetailsbiz;

import com.opensymphony.xwork2.ActionSupport;

import entity.CountResultDetails;

public class CountResultDetalisAction extends ActionSupport {
	
	private CountResultDetailsbiz monthDetailsbiz;
	
	private List<CountResultDetails>Details_list;
	
	int id;
	
	double sum;

	public String findAll(){
		
		Details_list=monthDetailsbiz.findAll(id);
		
		return SUCCESS;
		
	}
	
	public String excel() throws IOException{
		OutputStream os=ServletActionContext.getResponse().getOutputStream();
		ServletActionContext.getResponse().setContentType("application/vnd.ms-excel");
		ToExcelDao ss=new ToExcelDao();
		List<CountResultDetails> list=monthDetailsbiz.findAll(id);
		if(list!=null){
		ss.printToExcel(list,os);
		 System.setOut(new PrintStream(os));
		os.flush();
		os.close();
		return null;
		}	
		return "success";
		}


	public CountResultDetailsbiz getMonthDetailsbiz() {
		return monthDetailsbiz;
	}

	public void setMonthDetailsbiz(CountResultDetailsbiz monthDetailsbiz) {
		this.monthDetailsbiz = monthDetailsbiz;
	}



	public List<CountResultDetails> getDetails_list() {
		return Details_list;
	}

	public void setDetails_list(List<CountResultDetails> details_list) {
		Details_list = details_list;
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
