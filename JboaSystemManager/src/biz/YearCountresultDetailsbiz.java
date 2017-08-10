package biz;

import java.util.List;

import entity.YearCountResultDetails;

public interface YearCountresultDetailsbiz {

	public int save(YearCountResultDetails y);
	
	public List<YearCountResultDetails>findAll(int id);
	
	
	
}
