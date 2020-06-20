package myinternship.admin.vo;

import java.util.Date;

public class RegisterTenant {

	public RegisterTenant() {
		// TODO Auto-generated constructor stub
	}
	Integer tenantId;
	String 	name;
	Long 	mobile;
	String 	address;
	Long 	parentno;
	Long 	aadhar;
	Integer payment;
	Date 	admissiondate;
	String tenantStatus;
	/**
	 * @return the tenantId
	 */
	public Integer getTenantId() {
		return tenantId;
	}
	/**
	 * @param tenantId the tenantId to set
	 */
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the mobile
	 */
	public Long getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the parentno
	 */
	public Long getParentno() {
		return parentno;
	}
	/**
	 * @param parentno the parentno to set
	 */
	public void setParentno(Long parentno) {
		this.parentno = parentno;
	}
	/**
	 * @return the aadhar
	 */
	public Long getAadhar() {
		return aadhar;
	}
	/**
	 * @param aadhar the aadhar to set
	 */
	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}
	/**
	 * @return the payment
	 */
	public Integer getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(Integer payment) {
		this.payment = payment;
	}
	/**
	 * @return the admissiondate
	 */
	public Date getAdmissiondate() {
		return admissiondate;
	}
	/**
	 * @param admissiondate the admissiondate to set
	 */
	public void setAdmissiondate(Date admissiondate) {
		this.admissiondate = admissiondate;
	}
	/**
	 * @return the tenantStatus
	 */
	/**
	 * @return the tenantStatus
	 */
	public String getTenantStatus() {
		return tenantStatus;
	}
	/**
	 * @param tenantStatus the tenantStatus to set
	 */
	public void setTenantStatus(String tenantStatus) {
		this.tenantStatus = tenantStatus;
	}
	 
	
	
}
