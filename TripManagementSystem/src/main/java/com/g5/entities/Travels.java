package com.g5.entities;

public class Travels {
	
	private int travelsId;
	private String travelsName;
	private String  agentName;
	private String  address;
	private String  contact;
	public Travels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Travels(int travelsId, String travelsName, String agentName, String address, String contact) {
		super();
		this.travelsId = travelsId;
		this.travelsName = travelsName;
		this.agentName = agentName;
		this.address = address;
		this.contact = contact;
	}
	/**
	 * @return the travelsId
	 */
	public int getTravelsId() {
		return travelsId;
	}
	/**
	 * @param travelsId the travelsId to set
	 */
	public void setTravelsId(int travelsId) {
		this.travelsId = travelsId;
	}
	/**
	 * @return the travelsName
	 */
	public String getTravelsName() {
		return travelsName;
	}
	/**
	 * @param travelsName the travelsName to set
	 */
	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
	}
	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}
	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
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
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((agentName == null) ? 0 : agentName.hashCode());
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + travelsId;
		result = prime * result + ((travelsName == null) ? 0 : travelsName.hashCode());
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
		Travels other = (Travels) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (agentName == null) {
			if (other.agentName != null)
				return false;
		} else if (!agentName.equals(other.agentName))
			return false;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (travelsId != other.travelsId)
			return false;
		if (travelsName == null) {
			if (other.travelsName != null)
				return false;
		} else if (!travelsName.equals(other.travelsName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Travels [travelsId=" + travelsId + ", travelsName=" + travelsName + ", agentName=" + agentName
				+ ", address=" + address + ", contact=" + contact + "]";
	}
	
	
	
	
	
	
 
}
