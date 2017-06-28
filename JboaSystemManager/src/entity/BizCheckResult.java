package entity;

import java.util.Date;

/**
 * BizCheckResult entity. @author MyEclipse Persistence Tools
 */

public class BizCheckResult implements java.io.Serializable {

	// Fields

	private int id;
	private BizClaimVoucher bizClaimVoucher;
	private SysEmployee sysEmployee;
	private Date checkTime;
	private String result;
	private String comm;

	// Constructors

	/** default constructor */
	public BizCheckResult() {
	}

	/** minimal constructor */
	public BizCheckResult(int id) {
		this.id = id;
	}

	/** full constructor */
	public BizCheckResult(int id, BizClaimVoucher bizClaimVoucher,
			SysEmployee sysEmployee, Date checkTime, String result, String comm) {
		this.id = id;
		this.bizClaimVoucher = bizClaimVoucher;
		this.sysEmployee = sysEmployee;
		this.checkTime = checkTime;
		this.result = result;
		this.comm = comm;
	}

	// Property accessors

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BizClaimVoucher getBizClaimVoucher() {
		return this.bizClaimVoucher;
	}

	public void setBizClaimVoucher(BizClaimVoucher bizClaimVoucher) {
		this.bizClaimVoucher = bizClaimVoucher;
	}

	public SysEmployee getSysEmployee() {
		return this.sysEmployee;
	}

	public void setSysEmployee(SysEmployee sysEmployee) {
		this.sysEmployee = sysEmployee;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getComm() {
		return this.comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

}