package action;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import biz.BizCheckResultbiz;
import dao.BizCheckResultdao;
import entity.BizCheckResult;
import entity.BizClaimVoucher;
import entity.SysEmployee;

public class BizCheckResultAction extends ActionSupport {

	BizCheckResultbiz checkresultbiz;
	
	public List<BizCheckResult>list;
	
	private BizCheckResult b;

	public BizCheckResultbiz getCheckresultbiz() {
		return checkresultbiz;
	}

	public void setCheckresultbiz(BizCheckResultbiz checkresultbiz) {
		this.checkresultbiz = checkresultbiz;
	}

	public List<BizCheckResult> getList() {
		return list;
	}

	public void setList(List<BizCheckResult> list) {
		this.list = list;
	}
	
	
	
	public BizCheckResult getB() {
		return b;
	}

	public void setB(BizCheckResult b) {
		this.b = b;
	}

	public String save(){
		
		b=new BizCheckResult();
		
		String comm=(String) ActionContext.getContext().getSession().get("comm");
		
		int bid=(Integer) ActionContext.getContext().getSession().get("bid");
		
		String id=(String) ActionContext.getContext().getSession().get("name");
		
		b.setSysEmployee(new SysEmployee(id));
		
		b.setBizClaimVoucher(new BizClaimVoucher(bid));
		
		b.setComm(comm);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date time=null;
		
			try {
				time=sdf.parse(sdf.format(new Date()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		b.setCheckTime(time);
		
		b.setResult("“—Ã·Ωª");
		
		checkresultbiz.save(b);
		
		return SUCCESS;
		
	}
}
