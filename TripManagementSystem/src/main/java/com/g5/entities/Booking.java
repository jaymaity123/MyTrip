package com.g5.entities;


import java.time.LocalDate;

public class Booking {
	
	private int bookingId;
	private String bookingType;
	private String description;
	private String bookingTitle;
	private  LocalDate bookingDate;
	private Package pack;
	private  int userId;
	private  PaymentDetails  payment;
	private TicketDetails ticket;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int bookingId, String bookingType, String description, String bookingTitle, LocalDate bookingDate,
			Package pack, int userId, PaymentDetails payment, TicketDetails ticket) {
		super();
		this.bookingId = bookingId;
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
		this.pack = pack;
		this.userId = userId;
		this.payment = payment;
		this.ticket = ticket;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBookingTitle() {
		return bookingTitle;
	}
	public void setBookingTitle(String bookingTitle) {
		this.bookingTitle = bookingTitle;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Package getPack() {
		return pack;
	}
	public void setPack(Package pack) {
		this.pack = pack;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public PaymentDetails getPayment() {
		return payment;
	}
	public void setPayment(PaymentDetails payment) {
		this.payment = payment;
	}
	public TicketDetails getTicket() {
		return ticket;
	}
	public void setTicket(TicketDetails ticket) {
		this.ticket = ticket;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
		result = prime * result + bookingId;
		result = prime * result + ((bookingTitle == null) ? 0 : bookingTitle.hashCode());
		result = prime * result + ((bookingType == null) ? 0 : bookingType.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		result = prime * result + ((ticket == null) ? 0 : ticket.hashCode());
		result = prime * result + userId;
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
		Booking other = (Booking) obj;
		if (bookingDate == null) {
			if (other.bookingDate != null)
				return false;
		} else if (!bookingDate.equals(other.bookingDate))
			return false;
		if (bookingId != other.bookingId)
			return false;
		if (bookingTitle == null) {
			if (other.bookingTitle != null)
				return false;
		} else if (!bookingTitle.equals(other.bookingTitle))
			return false;
		if (bookingType == null) {
			if (other.bookingType != null)
				return false;
		} else if (!bookingType.equals(other.bookingType))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (pack == null) {
			if (other.pack != null)
				return false;
		} else if (!pack.equals(other.pack))
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		if (ticket == null) {
			if (other.ticket != null)
				return false;
		} else if (!ticket.equals(other.ticket))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingType=" + bookingType + ", description=" + description
				+ ", bookingTitle=" + bookingTitle + ", bookingDate=" + bookingDate + ", pack=" + pack + ", userId="
				+ userId + ", payment=" + payment + ", ticket=" + ticket + "]";
	}
	
	

}
