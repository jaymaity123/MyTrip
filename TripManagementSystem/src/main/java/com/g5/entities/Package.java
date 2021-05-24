package com.g5.entities;


public class Package {
	
	private int packageId;
	private String packageName;
	private String packageDescription;
	private String packageType;
	private double packageCost;
	private Route route;
	private Hotel hotel;
	
	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Package(int packageId, String packageName, String packageDescription, String packageType, double packageCost,
			Route route, Hotel hotel) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.route = route;
		this.hotel = hotel;
	}

	/**
	 * @return the packageId
	 */
	public int getPackageId() {
		return packageId;
	}

	/**
	 * @param packageId the packageId to set
	 */
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * @return the packageDescription
	 */
	public String getPackageDescription() {
		return packageDescription;
	}

	/**
	 * @param packageDescription the packageDescription to set
	 */
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}

	/**
	 * @return the packageType
	 */
	public String getPackageType() {
		return packageType;
	}

	/**
	 * @param packageType the packageType to set
	 */
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	/**
	 * @return the packageCost
	 */
	public double getPackageCost() {
		return packageCost;
	}

	/**
	 * @param packageCost the packageCost to set
	 */
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}

	/**
	 * @return the route
	 */
	public Route getRoute() {
		return route;
	}

	/**
	 * @param route the route to set
	 */
	public void setRoute(Route route) {
		this.route = route;
	}

	/**
	 * @return the hotel
	 */
	public Hotel getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(packageCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((packageDescription == null) ? 0 : packageDescription.hashCode());
		result = prime * result + packageId;
		result = prime * result + ((packageName == null) ? 0 : packageName.hashCode());
		result = prime * result + ((packageType == null) ? 0 : packageType.hashCode());
		result = prime * result + ((route == null) ? 0 : route.hashCode());
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
		Package other = (Package) obj;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
		if (Double.doubleToLongBits(packageCost) != Double.doubleToLongBits(other.packageCost))
			return false;
		if (packageDescription == null) {
			if (other.packageDescription != null)
				return false;
		} else if (!packageDescription.equals(other.packageDescription))
			return false;
		if (packageId != other.packageId)
			return false;
		if (packageName == null) {
			if (other.packageName != null)
				return false;
		} else if (!packageName.equals(other.packageName))
			return false;
		if (packageType == null) {
			if (other.packageType != null)
				return false;
		} else if (!packageType.equals(other.packageType))
			return false;
		if (route == null) {
			if (other.route != null)
				return false;
		} else if (!route.equals(other.route))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", packageType=" + packageType + ", packageCost=" + packageCost + ", route="
				+ route + ", hotel=" + hotel + "]";
	}
	
	

}
