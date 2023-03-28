package com.masai.model;

import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Hotstar {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private int rating;
	
	@Enumerated
	private Subscription subscription;
	
	public Hotstar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hotstar( String userName) {
		super();
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		return "Hotstar [userId=" + userId + ", userName=" + userName + ", rating=" + rating + ", subscription="
				+ subscription + "]";
	}

}
