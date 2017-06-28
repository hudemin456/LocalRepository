package biz;

import java.util.List;

import entity.BizCheckResult;

public interface BizCheckResultbiz {


	public int save(BizCheckResult b);
	
	public List<BizCheckResult> findAll();
}
