package com.masai.app.model;

import javax.validation.constraints.Min;

public class Address {
	
	@Min(value =6, message = "pincode Should be 6 digit")
	private String pincode;
	private String state;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String pincode, String state, String city) {
		super();
		this.pincode = pincode;
		this.state = state;
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", state=" + state + ", city=" + city + "]";
	}
	
	
}
