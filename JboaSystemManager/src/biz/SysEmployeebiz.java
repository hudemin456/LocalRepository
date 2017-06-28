package biz;

import java.util.List;

import entity.SysEmployee;

public interface SysEmployeebiz {

	public SysEmployee login(String name,String pwd);
	
	public List<SysEmployee> find_employee();

	public SysEmployee find_Manager();
}
