package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * YearCountResult entity. @author MyEclipse Persistence Tools
 */

public class YearCountResult implements java.io.Serializable {

	// Fields

	private Integer id;
	private double totalAccount;
	private Integer year;
	private String positionName;
	private Set yearCountResultDetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public YearCountResult() {
	}

	/** minimal constructor */
	public YearCountResult(Integer id, double totalAccount, Integer year,
			String positionName) {
		this.id = id;
		this.totalAccount = totalAccount;
		this.year = year;
		this.positionName = positionName;
	}

	/** full constructor */
	public YearCountResult(Integer id, Integer totalAccount, Integer year,
			String positionName, Set yearCountResultDetailses) {
		this.id = id;
		this.totalAccount = totalAccount;
		this.year = year;
		this.positionName = positionName;
		this.yearCountResultDetailses = yearCountResultDetailses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getTotalAccount() {
		return this.totalAccount;
	}

	public void setTotalAccount(double totalAccount) {
		this.totalAccount = totalAccount;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Set getYearCountResultDetailses() {
		return this.yearCountResultDetailses;
	}

	public void setYearCountResultDetailses(Set yearCountResultDetailses) {
		this.yearCountResultDetailses = yearCountResultDetailses;
	}

}