package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * CountResult entity. @author MyEclipse Persistence Tools
 */

public class CountResult implements java.io.Serializable {

	// Fields

	private Integer id;
	private double totalAccount;
	private Integer year;
	private Integer month;
	private String positionName;
	private Set countResultDetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public CountResult() {
	}

	/** minimal constructor */
	public CountResult(Integer id, Integer totalAccount, Integer year,
			Integer month, String positionName) {
		this.id = id;
		this.totalAccount = totalAccount;
		this.year = year;
		this.month = month;
		this.positionName = positionName;
	}

	/** full constructor */
	public CountResult(Integer id, Integer totalAccount, Integer year,
			Integer month, String positionName, Set countResultDetailses) {
		this.id = id;
		this.totalAccount = totalAccount;
		this.year = year;
		this.month = month;
		this.positionName = positionName;
		this.countResultDetailses = countResultDetailses;
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

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Set getCountResultDetailses() {
		return this.countResultDetailses;
	}

	public void setCountResultDetailses(Set countResultDetailses) {
		this.countResultDetailses = countResultDetailses;
	}

}