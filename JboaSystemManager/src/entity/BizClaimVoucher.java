package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BizClaimVoucher entity. @author MyEclipse Persistence Tools
 */

public class BizClaimVoucher implements java.io.Serializable {

	// Fields

	private int id;
	private SysEmployee sysEmployeeByNextDealSn;
	private SysEmployee sysEmployeeByCreateSn;
	private Date createTime;
	private Date modifyTime;
	private String event;
	private Double totalAccount;
	private String status;
	private Set bizClaimVoucherDetails = new HashSet(0);
	private Set bizCheckResults = new HashSet(0);

	// Constructors

	/** default constructor */
	public BizClaimVoucher() {
	}

	/** minimal constructor */
	public BizClaimVoucher(int id) {
		this.id = id;
	}

	/** full constructor */
	public BizClaimVoucher(int id, SysEmployee sysEmployeeByNextDealSn,
			SysEmployee sysEmployeeByCreateSn, Date createTime,
			Date modifyTime, String event, Double totalAccount, String status,
			Set bizClaimVoucherDetails, Set bizCheckResults) {
		this.id = id;
		this.sysEmployeeByNextDealSn = sysEmployeeByNextDealSn;
		this.sysEmployeeByCreateSn = sysEmployeeByCreateSn;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.event = event;
		this.totalAccount = totalAccount;
		this.status = status;
		this.bizClaimVoucherDetails = bizClaimVoucherDetails;
		this.bizCheckResults = bizCheckResults;
	}

	// Property accessors

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SysEmployee getSysEmployeeByNextDealSn() {
		return this.sysEmployeeByNextDealSn;
	}

	public void setSysEmployeeByNextDealSn(SysEmployee sysEmployeeByNextDealSn) {
		this.sysEmployeeByNextDealSn = sysEmployeeByNextDealSn;
	}

	public SysEmployee getSysEmployeeByCreateSn() {
		return this.sysEmployeeByCreateSn;
	}

	public void setSysEmployeeByCreateSn(SysEmployee sysEmployeeByCreateSn) {
		this.sysEmployeeByCreateSn = sysEmployeeByCreateSn;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Double getTotalAccount() {
		return this.totalAccount;
	}

	public void setTotalAccount(Double totalAccount) {
		this.totalAccount = totalAccount;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getBizClaimVoucherDetails() {
		return this.bizClaimVoucherDetails;
	}

	public void setBizClaimVoucherDetails(Set bizClaimVoucherDetails) {
		this.bizClaimVoucherDetails = bizClaimVoucherDetails;
	}

	public Set getBizCheckResults() {
		return this.bizCheckResults;
	}

	public void setBizCheckResults(Set bizCheckResults) {
		this.bizCheckResults = bizCheckResults;
	}

}