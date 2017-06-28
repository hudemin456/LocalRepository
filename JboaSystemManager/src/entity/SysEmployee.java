package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * SysEmployee entity. @author MyEclipse Persistence Tools
 */

public class SysEmployee implements java.io.Serializable {

	// Fields

	private String sn;
	private SysPosition sysPosition;
	private SysDepartment sysDepartment;
	private String name;
	private String password;
	private String status;
	private Set bizClaimVouchersForNextDealSn = new HashSet(0);
	private Set bizClaimVouchersForCreateSn = new HashSet(0);
	private Set bizLeavesForNextDealSn = new HashSet(0);
	private Set bizLeavesForEmployeeSn = new HashSet(0);
	private Set bizCheckResults = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysEmployee() {
	}

	/** minimal constructor */
	public SysEmployee(String sn) {
		this.sn = sn;
	}

	/** full constructor */
	public SysEmployee(String sn, SysPosition sysPosition,
			SysDepartment sysDepartment, String name, String password,
			String status, Set bizClaimVouchersForNextDealSn,
			Set bizClaimVouchersForCreateSn, Set bizLeavesForNextDealSn,
			Set bizLeavesForEmployeeSn, Set bizCheckResults) {
		this.sn = sn;
		this.sysPosition = sysPosition;
		this.sysDepartment = sysDepartment;
		this.name = name;
		this.password = password;
		this.status = status;
		this.bizClaimVouchersForNextDealSn = bizClaimVouchersForNextDealSn;
		this.bizClaimVouchersForCreateSn = bizClaimVouchersForCreateSn;
		this.bizLeavesForNextDealSn = bizLeavesForNextDealSn;
		this.bizLeavesForEmployeeSn = bizLeavesForEmployeeSn;
		this.bizCheckResults = bizCheckResults;
	}

	// Property accessors

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public SysPosition getSysPosition() {
		return this.sysPosition;
	}

	public void setSysPosition(SysPosition sysPosition) {
		this.sysPosition = sysPosition;
	}

	public SysDepartment getSysDepartment() {
		return this.sysDepartment;
	}

	public void setSysDepartment(SysDepartment sysDepartment) {
		this.sysDepartment = sysDepartment;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getBizClaimVouchersForNextDealSn() {
		return this.bizClaimVouchersForNextDealSn;
	}

	public void setBizClaimVouchersForNextDealSn(
			Set bizClaimVouchersForNextDealSn) {
		this.bizClaimVouchersForNextDealSn = bizClaimVouchersForNextDealSn;
	}

	public Set getBizClaimVouchersForCreateSn() {
		return this.bizClaimVouchersForCreateSn;
	}

	public void setBizClaimVouchersForCreateSn(Set bizClaimVouchersForCreateSn) {
		this.bizClaimVouchersForCreateSn = bizClaimVouchersForCreateSn;
	}

	public Set getBizLeavesForNextDealSn() {
		return this.bizLeavesForNextDealSn;
	}

	public void setBizLeavesForNextDealSn(Set bizLeavesForNextDealSn) {
		this.bizLeavesForNextDealSn = bizLeavesForNextDealSn;
	}

	public Set getBizLeavesForEmployeeSn() {
		return this.bizLeavesForEmployeeSn;
	}

	public void setBizLeavesForEmployeeSn(Set bizLeavesForEmployeeSn) {
		this.bizLeavesForEmployeeSn = bizLeavesForEmployeeSn;
	}

	public Set getBizCheckResults() {
		return this.bizCheckResults;
	}

	public void setBizCheckResults(Set bizCheckResults) {
		this.bizCheckResults = bizCheckResults;
	}

}