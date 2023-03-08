package com.bankUtilities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
@Id
private int id;
private	String	email;
private	String address;
private double	balance;
private String create_date;

public Account() {
	super();
	// TODO Auto-generated constructor stub
}

public Account(int id, String email, String address, double balance, String create_date) {
	super();
	this.id = id;
	this.email = email;
	this.address = address;
	this.balance = balance;
	this.create_date = create_date;
}

public Account(String email, String address, double balance, String create_date) {
	super();
	this.email = email;
	this.address = address;
	this.balance = balance;
	this.create_date = create_date;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public String getDate() {
	return create_date;
}

public void setDate(String create_date) {
	this.create_date = create_date;
}

@Override
public String toString() {
	return "Account [id=" + id + ", email=" + email + ", address=" + address + ", balance=" + balance + ", date=" + create_date
			+ "]";
}



}
