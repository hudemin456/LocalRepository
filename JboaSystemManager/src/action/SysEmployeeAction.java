package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import biz.SysEmployeebiz;
import dao.SysEmployeedao;
import entity.SysEmployee;

public class SysEmployeeAction extends ActionSupport {

	SysEmployeebiz employeebiz;
	
	private String name;
	
	private String pwd;
	
	private List<SysEmployee> list;

	public SysEmployeebiz getEmployeebiz() {
		return employeebiz;
	}

	public void setEmployeebiz(SysEmployeebiz employeebiz) {
		this.employeebiz = employeebiz;
	}
	
	
	public String login(){
		
	

			SysEmployee s= employeebiz.login(name, pwd);
			
			ActionContext.getContext().getSession().put("name",s.getSn());
			
			ActionContext.getContext().getSession().put("name1",s.getName());
			
			ActionContext.getContext().getSession().put("department",s.getSysDepartment().getName());
			
			if(s.getSysPosition().getId()==2){
				return "manager";
			}else if(s.getSysPosition().getId()==3){
				return "money";
			}else if(s.getSysPosition().getId()==4){
				return "boss";
			}else
			{
				return SUCCESS;
			}
	}
	
	public String findfind_employee(){
		
		list=employeebiz.find_employee();
		
		return SUCCESS;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<SysEmployee> getList() {
		return list;
	}

	public void setList(List<SysEmployee> list) {
		this.list = list;
	}
	
	
	
}
