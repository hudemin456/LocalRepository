package biz;

import java.util.List;


import entity.YearCountResult;

public interface YearCountResultbiz {
	public int save(YearCountResult y);
	
	public List<YearCountResult> findAll();
}
