package entity;

/**
 * CountResultDetails entity. @author MyEclipse Persistence Tools
 */

public class CountResultDetails implements java.io.Serializable {

	// Fields

	private Integer id;
	private CountResult countResult;
	private String name;
	private Integer money;
	private Integer year;
	private Integer month;
	private String positionName;

	// Constructors

	/** default constructor */
	public CountResultDetails() {
	}

	/** full constructor */
	public CountResultDetails(Integer id, CountResult countResult, String name,
			Integer money, Integer year, Integer month, String positionName) {
		this.id = id;
		this.countResult = countResult;
		this.name = name;
		this.money = money;
		this.year = year;
		this.month = month;
		this.positionName = positionName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CountResult getCountResult() {
		return this.countResult;
	}

	public void setCountResult(CountResult countResult) {
		this.countResult = countResult;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
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

}