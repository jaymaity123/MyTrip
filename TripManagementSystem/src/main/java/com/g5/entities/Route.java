package com.g5.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Route {
	
	
	private String routeId;
	private String  routeFrom;
	private String  routeTo;
	private  List<Bus> buses;
	private  LocalDateTime  departureTime;
	private  LocalDateTime   arrivalTime;
	private  LocalDate   doj;
	private String pickupPoint;
	private  double fare;
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Route(String routeId, String routeFrom, String routeTo, List<Bus> buses, LocalDateTime departureTime,
			LocalDateTime arrivalTime, LocalDate doj, String pickupPoint, double fare) {
		super();
		this.routeId = routeId;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.buses = buses;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.doj = doj;
		this.pickupPoint = pickupPoint;
		this.fare = fare;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((buses == null) ? 0 : buses.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((doj == null) ? 0 : doj.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((pickupPoint == null) ? 0 : pickupPoint.hashCode());
		result = prime * result + ((routeFrom == null) ? 0 : routeFrom.hashCode());
		result = prime * result + ((routeId == null) ? 0 : routeId.hashCode());
		result = prime * result + ((routeTo == null) ? 0 : routeTo.hashCode());
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
		Route other = (Route) obj;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (buses == null) {
			if (other.buses != null)
				return false;
		} else if (!buses.equals(other.buses))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (doj == null) {
			if (other.doj != null)
				return false;
		} else if (!doj.equals(other.doj))
			return false;
		if (Double.doubleToLongBits(fare) != Double.doubleToLongBits(other.fare))
			return false;
		if (pickupPoint == null) {
			if (other.pickupPoint != null)
				return false;
		} else if (!pickupPoint.equals(other.pickupPoint))
			return false;
		if (routeFrom == null) {
			if (other.routeFrom != null)
				return false;
		} else if (!routeFrom.equals(other.routeFrom))
			return false;
		if (routeId == null) {
			if (other.routeId != null)
				return false;
		} else if (!routeId.equals(other.routeId))
			return false;
		if (routeTo == null) {
			if (other.routeTo != null)
				return false;
		} else if (!routeTo.equals(other.routeTo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", buses=" + buses
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", doj=" + doj
				+ ", pickupPoint=" + pickupPoint + ", fare=" + fare + "]";
	}
	
	

}
