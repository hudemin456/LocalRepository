package entity;

/**
 * YearCountResultDetails entity. @author MyEclipse Persistence Tools
 */

public class YearCountResultDetails implements java.io.Serializable {

	// Fields

	private Integer id;
	private YearCountResult yearCountResult;
	private Integer money;
	private Integer name;
	private Integer year;
	private String positionName;

	// Constructors

	/** default constructor */
	public YearCountResultDetails() {
	}

	/** full constructor */
	public YearCountResultDetails(Integer id, YearCountResult yearCountResult,
			Integer money, Integer name, Integer year, String positionName) {
		this.id = id;
		this.yearCountResult = yearCountResult;
		this.money = money;
		this.name = name;
		this.year = year;
		this.positionName = positionName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public YearCountResult getYearCountResult() {
		return this.yearCountResult;
	}

	public void setYearCountResult(YearCountResult yearCountResult) {
		this.yearCountResult = yearCountResult;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Integer getName() {
		return this.name;
	}

	public void setName(Integer name) {
		this.name = name;
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

}