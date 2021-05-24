package com.g5.entities;


public class Customer extends User {

	private String customerName;
	private String address;
	private String mobileNo;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String address, String mobileNo, String email) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", address=" + address + ", mobileNo=" + mobileNo + ", email="
				+ email + "]";
	}
	
	
	
	
}
