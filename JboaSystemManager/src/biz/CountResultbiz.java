package biz;

import java.util.List;

import entity.CountResult;

public interface CountResultbiz {
	
	public int save(CountResult c);
	
	public List<CountResult> findAll();
	
	
}
