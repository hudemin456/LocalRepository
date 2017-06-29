package action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.BizClaimVoucher;
import entity.BizClaimVoucherDetail;
import entity.SysEmployee;

import biz.BizClaimVoucherbiz;


public class BizClaimVoucherAction extends ActionSupport {

	BizClaimVoucherbiz claimvoucherbiz;
	
	private List<BizClaimVoucher> list;
	
	private String item[];
	
	private double money[];
	
	private String des[];
	
	private BizClaimVoucher b;
	
	private int id;
	
	private String name;
	
	private double totalAccount;
	
	private String event;
	
	private Set<BizClaimVoucherDetail> set;
	
	private String status;
	
	private String comm;
	
	public String findAll(){
		
		list =claimvoucherbiz.find_BizClaimVoucher(0);
	
		return SUCCESS;
	}
	
	public String findById(){

		BizClaimVoucher bb=(BizClaimVoucher) ActionContext.getContext().getSession().get("key");
		
		if(bb!=null)claimvoucherbiz.update(bb);
		
		

		name=(String) ActionContext.getContext().getSession().get("name");
		
		list =claimvoucherbiz.find_BizClaimVoucher(name);
		
		return SUCCESS;
	}
	
	public String Boss_findAll(){
		
		int index=(Integer) ActionContext.getContext().getSession().get("position");
		
		list =claimvoucherbiz.find_BizClaimVoucher(index);
	
		return SUCCESS;
		
	}
	
	public String details(){
		
		b=claimvoucherbiz.details(id);
		
		set=b.getBizClaimVoucherDetails();
		
		ActionContext.getContext().getSession().put("b",b);

		ActionContext.getContext().getSession().put("set",set);
		
		if(status.length()>2){
			return "update";
		}else{	
		return SUCCESS;
		}
	}
	
	public String submit(){
		
		claimvoucherbiz.submit(id);
		
		return SUCCESS;
		
	}
	
	public String Manager_Details(){
		
		b=claimvoucherbiz.details(id);
		
		set=b.getBizClaimVoucherDetails();
		
		ActionContext.getContext().getSession().put("b",b);

		ActionContext.getContext().getSession().put("set",set);
		
		return SUCCESS;
		
	}
	
	
	public String add(){
		
		b=new BizClaimVoucher();
		
		b.setEvent(event);
		
		b.setTotalAccount(totalAccount);
		
		Set<BizClaimVoucherDetail> detail=new HashSet<BizClaimVoucherDetail>();
		
		int i =0;
		
		for (String  s : item) {
			
			BizClaimVoucherDetail d=new BizClaimVoucherDetail();
			
			d.setAccount(money[i]);
			
			d.setDes(des[i]);
			
			d.setItem(item[i]);
			
			detail.add(d);
			
			i++;
		}
		
		b.setStatus("ÒÑÌá½»");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date time=null;
		
		try {
			
			time=sdf.parse(sdf.format(new Date()));
			
			b.setModifyTime(time);
			
			b.setCreateTime(time);
			
			b.setSysEmployeeByNextDealSn(new SysEmployee("2"));
			
			b.setSysEmployeeByCreateSn(new SysEmployee((String) ActionContext.getContext().getSession().get("name")));
			
			b.setBizClaimVoucherDetails(detail);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		if(claimvoucherbiz.save(b)>0)
			return SUCCESS;
		else
			return "error";
		
	}
	
	public String go_back(){
		
		claimvoucherbiz.go_back(id);
		
		int index=(Integer) ActionContext.getContext().getSession().get("position");
		
		if(index>0){
			return "boss";
		}else{
			return SUCCESS;
		}
		
	}
	
	public String pass(){
		
		
		ActionContext.getContext().getSession().put("comm",comm);

		ActionContext.getContext().getSession().put("bid",b.getId());

		
		claimvoucherbiz.pass(b.getId());
		
		int index=(Integer) ActionContext.getContext().getSession().get("position");
		
		if(index>0){
			return "boss";
		}else{
			return SUCCESS;
		}
	}
	
	public String delete(){
		
		if(claimvoucherbiz.del(id)>0)
			return SUCCESS;
		else 
			return "error";
		
	}
	
public String update(){
		
		if(claimvoucherbiz.update(b)>0)
			return SUCCESS;
		else 
			return "error";

	}


	public BizClaimVoucher getB() {
		return b;
	}

	public void setB(BizClaimVoucher b) {
		this.b = b;
	}

	public List<BizClaimVoucher> getList() {
		return list;
	}

	public void setList(List<BizClaimVoucher> list) {
		this.list = list;
	}

	public BizClaimVoucherbiz getClaimvoucherbiz() {
		return claimvoucherbiz;
	}

	public void setClaimvoucherbiz(BizClaimVoucherbiz claimvoucherbiz) {
		this.claimvoucherbiz = claimvoucherbiz;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Set<BizClaimVoucherDetail> getSet() {
		return set;
	}

	public void setSet(Set<BizClaimVoucherDetail> set) {
		this.set = set;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}


	
	
}
