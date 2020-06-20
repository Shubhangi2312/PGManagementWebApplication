package myinternship.admin.vo;

public class FeeCollection {

	public FeeCollection() {
		// TODO Auto-generated constructor stub
	}
	
	Integer feeId;
	String month;
	Long year;
	Long amount;
	String remark;
	
	public myinternship.admin.vo.RegisterTenant tenantInfo;

	/**
	 * @return the feeId
	 */
	public Integer getFeeId() {
		return feeId;
	}

	/**
	 * @param feeId the feeId to set
	 */
	public void setFeeId(Integer feeId) {
		this.feeId = feeId;
	}

	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public Long getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Long year) {
		this.year = year;
	}

	/**
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * @return the tenantInfo
	 */
	public myinternship.admin.vo.RegisterTenant getTenantInfo() {
		return tenantInfo;
	}

	/**
	 * @param tenantInfo the tenantInfo to set
	 */
	public void setTenantInfo(myinternship.admin.vo.RegisterTenant tenantInfo) {
		this.tenantInfo = tenantInfo;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
	

}
