package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	@Id
	 private Integer accountNo;
	 private String accountholdername;
	 private String address;
	 private String email;
	 private Integer balance;
	 private String mobile;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(Integer accountNo, String accountholdername, String address, String email, Integer balance,
			String mobile) {
		super();
		this.accountNo = accountNo;
		this.accountholdername = accountholdername;
		this.address = address;
		this.email = email;
		this.balance = balance;
		this.mobile = mobile;
	}
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountholdername=" + accountholdername + ", address=" + address
				+ ", email=" + email + ", balance=" + balance + ", mobile=" + mobile + "]";
	}
	 
	 

}
