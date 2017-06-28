package entity;

import java.util.Date;

/**
 * BizLeave entity. @author MyEclipse Persistence Tools
 */

public class BizLeave implements java.io.Serializable {

	// Fields

	private Long id;
	private SysEmployee sysEmployeeByEmployeeSn;
	private SysEmployee sysEmployeeByNextDealSn;
	private Date startime;
	private Date endtime;
	private Double leaveday;
	private String leavetype;
	private String reason;
	private String approveOpinion;
	private String status;

	// Constructors

	/** default constructor */
	public BizLeave() {
	}

	/** minimal constructor */
	public BizLeave(Long id) {
		this.id = id;
	}

	/** full constructor */
	public BizLeave(Long id, SysEmployee sysEmployeeByEmployeeSn,
			SysEmployee sysEmployeeByNextDealSn, Date startime, Date endtime,
			Double leaveday, String leavetype, String reason,
			String approveOpinion, String status) {
		this.id = id;
		this.sysEmployeeByEmployeeSn = sysEmployeeByEmployeeSn;
		this.sysEmployeeByNextDealSn = sysEmployeeByNextDealSn;
		this.startime = startime;
		this.endtime = endtime;
		this.leaveday = leaveday;
		this.leavetype = leavetype;
		this.reason = reason;
		this.approveOpinion = approveOpinion;
		this.status = status;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SysEmployee getSysEmployeeByEmployeeSn() {
		return this.sysEmployeeByEmployeeSn;
	}

	public void setSysEmployeeByEmployeeSn(SysEmployee sysEmployeeByEmployeeSn) {
		this.sysEmployeeByEmployeeSn = sysEmployeeByEmployeeSn;
	}

	public SysEmployee getSysEmployeeByNextDealSn() {
		return this.sysEmployeeByNextDealSn;
	}

	public void setSysEmployeeByNextDealSn(SysEmployee sysEmployeeByNextDealSn) {
		this.sysEmployeeByNextDealSn = sysEmployeeByNextDealSn;
	}

	public Date getStartime() {
		return this.startime;
	}

	public void setStartime(Date startime) {
		this.startime = startime;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Double getLeaveday() {
		return this.leaveday;
	}

	public void setLeaveday(Double leaveday) {
		this.leaveday = leaveday;
	}

	public String getLeavetype() {
		return this.leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getApproveOpinion() {
		return this.approveOpinion;
	}

	public void setApproveOpinion(String approveOpinion) {
		this.approveOpinion = approveOpinion;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}