package com.g5.entities;


import java.time.LocalDate;

public class Feedback {
	
	
	private String feedbackId;
	private Customer customer;
	private String feedback;
	private  int rating;
	private LocalDate submitDate;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(String feedbackId, Customer customer, String feedback, int rating, LocalDate submitDate) {
		super();
		this.feedbackId = feedbackId;
		this.customer = customer;
		this.feedback = feedback;
		this.rating = rating;
		this.submitDate = submitDate;
	}
	/**
	 * @return the feedbackId
	 */
	public String getFeedbackId() {
		return feedbackId;
	}
	/**
	 * @param feedbackId the feedbackId to set
	 */
	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the feedback
	 */
	public String getFeedback() {
		return feedback;
	}
	/**
	 * @param feedback the feedback to set
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the submitDate
	 */
	public LocalDate getSubmitDate() {
		return submitDate;
	}
	/**
	 * @param submitDate the submitDate to set
	 */
	public void setSubmitDate(LocalDate submitDate) {
		this.submitDate = submitDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
		result = prime * result + ((feedbackId == null) ? 0 : feedbackId.hashCode());
		result = prime * result + rating;
		result = prime * result + ((submitDate == null) ? 0 : submitDate.hashCode());
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
		Feedback other = (Feedback) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
			return false;
		if (feedbackId == null) {
			if (other.feedbackId != null)
				return false;
		} else if (!feedbackId.equals(other.feedbackId))
			return false;
		if (rating != other.rating)
			return false;
		if (submitDate == null) {
			if (other.submitDate != null)
				return false;
		} else if (!submitDate.equals(other.submitDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", customer=" + customer + ", feedback=" + feedback + ", rating="
				+ rating + ", submitDate=" + submitDate + "]";
	}
	

}
