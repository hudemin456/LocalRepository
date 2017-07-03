package biz;

import java.util.List;

import entity.CountResultDetails;

public interface CountResultDetailsbiz {

	public List<CountResultDetails> findAll(int id);
	
	public int save(CountResultDetails c);
}
