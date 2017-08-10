package dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.YearCountResultDetails;


@Transactional(propagation=Propagation.REQUIRED)
public interface YearCountresultDetailsdao {

	public int save(YearCountResultDetails y);
	
	public List<YearCountResultDetails>findAll(int id);
	
	
	
}
