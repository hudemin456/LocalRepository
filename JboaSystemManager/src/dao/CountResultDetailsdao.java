package dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.CountResultDetails;

@Transactional(propagation=Propagation.REQUIRED)
public interface CountResultDetailsdao {

	public List<CountResultDetails> findAll(int id);
	
	public int save(CountResultDetails c);
}
