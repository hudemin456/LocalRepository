package dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.BizCheckResult;

@Transactional(propagation=Propagation.REQUIRED)
public interface BizCheckResultdao {

	public int save(BizCheckResult b);
	
	public List<BizCheckResult> findAll();
}
