package dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.YearCountResult;

@Transactional(propagation=Propagation.REQUIRED)
public interface YearCountResultdao {
	public int save(YearCountResult y);
	
	public List<YearCountResult> findAll();
}
