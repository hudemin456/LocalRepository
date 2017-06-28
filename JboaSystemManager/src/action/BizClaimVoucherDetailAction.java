package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.BizClaimVoucherdao;
import entity.BizClaimVoucher;
import entity.BizClaimVoucherDetail;

import biz.BizClaimVoucherDetailbiz;
import biz.BizClaimVoucherbiz;
import biz.impl.BizClaimVoucherbizimpl;

public class BizClaimVoucherDetailAction extends ActionSupport {

	BizClaimVoucherDetailbiz claimvoucherdetailbiz;
	
	
	BizClaimVoucher b1;
	
	private BizClaimVoucherDetail b;
	
	private List<BizClaimVoucherDetail> list;
	
	private int id;
	
	private String item[];
	
	private double money[];
	
	private String des[];
	
	private double totalAccount;
	
	private String status;
	
	public String details(){
		
		list=claimvoucherdetailbiz.findByid(id);
		
		
		return SUCCESS;
		
	}
	
	public String Details_delete(){
		
		claimvoucherdetailbiz.del(id);
		
		return SUCCESS;
		
	}
	
	public String Details_submit(){
		
		claimvoucherdetailbiz.del(id);
		
		ActionContext.getContext().getSession().put("key",b1);
		
		int i=0;
		
		for (String s : item) {
			BizClaimVoucherDetail b=new BizClaimVoucherDetail();
			
			b.setAccount(money[i]);
			
			b.setDes(des[i]);
			
			b.setItem(s);
			
			b.setBizClaimVoucher(new BizClaimVoucher(id));
			
			claimvoucherdetailbiz.save(b);
			
			i++;
		}
		
		return SUCCESS;
	}

	public BizClaimVoucherDetailbiz getClaimvoucherdetailbiz() {
		return claimvoucherdetailbiz;
	}

	public void setClaimvoucherdetailbiz(
			BizClaimVoucherDetailbiz claimvoucherdetailbiz) {
		this.claimvoucherdetailbiz = claimvoucherdetailbiz;
	}

	public BizClaimVoucherDetail getB() {
		return b;
	}

	public void setB(BizClaimVoucherDetail b) {
		this.b = b;
	}

	public List<BizClaimVoucherDetail> getList() {
		return list;
	}

	public void setList(List<BizClaimVoucherDetail> list) {
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getItem() {
		return item;
	}

	public void setItem(String[] item) {
		this.item = item;
	}

	public double[] getMoney() {
		return money;
	}

	public void setMoney(double[] money) {
		this.money = money;
	}

	public String[] getDes() {
		return des;
	}

	public void setDes(String[] des) {
		this.des = des;
	}

	public double getTotalAccount() {
		return totalAccount;
	}

	public void setTotalAccount(double totalAccount) {
		this.totalAccount = totalAccount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BizClaimVoucher getB1() {
		return b1;
	}

	public void setB1(BizClaimVoucher b1) {
		this.b1 = b1;
	}




	
	
}
