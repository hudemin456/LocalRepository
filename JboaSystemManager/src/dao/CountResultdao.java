package dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.CountResult;

@Transactional(propagation=Propagation.REQUIRED)
public interface CountResultdao {
	
	public int save(CountResult c);
	
	public List<CountResult> findAll();
	
	
}
