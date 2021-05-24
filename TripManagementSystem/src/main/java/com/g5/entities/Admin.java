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
	
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
	
	

}
