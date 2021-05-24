package com.g5.entities;

public class Admin extends User {
	
	
	private String adminName;
	private String email;
	private  String mobile;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String adminName, String email, String mobile) {
		super();
		this.adminName = adminName;
		this.email = email;
		this.mobile = mobile;
	}
	
	
	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}
	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
	
	

}
