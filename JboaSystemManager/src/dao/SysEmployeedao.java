package dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.SysEmployee;
@Transactional(propagation=Propagation.REQUIRED)
public interface SysEmployeedao {

	public SysEmployee login(String name,String pwd);
	
	public List<SysEmployee> find_employee();
	
	public SysEmployee find_Manager();
}
