package entity;

/**
 * BizClaimVoucherDetail entity. @author MyEclipse Persistence Tools
 */

public class BizClaimVoucherDetail implements java.io.Serializable {

	// Fields

	private int id;
	private BizClaimVoucher bizClaimVoucher;
	private String item;
	private Double account;
	private String des;

	// Constructors

	/** default constructor */
	public BizClaimVoucherDetail() {
	}

	/** minimal constructor */
	public BizClaimVoucherDetail(int id) {
		this.id = id;
	}

	/** full constructor */
	public BizClaimVoucherDetail(int id, BizClaimVoucher bizClaimVoucher,
			String item, Double account, String des) {
		this.id = id;
		this.bizClaimVoucher = bizClaimVoucher;
		this.item = item;
		this.account = account;
		this.des = des;
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

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getAccount() {
		return this.account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}