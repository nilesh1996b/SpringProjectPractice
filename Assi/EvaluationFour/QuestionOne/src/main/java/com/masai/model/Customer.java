package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
	
	@NotNull(message = "Customer ID is Mandatory")
	@Id
	private Integer customerId;
	
	@NotNull(message = "Customer Name is Mandatory")
	@Size(min = 3,max =10,message = "Name should be minimum 3 and max 10")
	private String customerName;

	@NotNull(message = "Customer Address is Mandatory")
	@Size(min = 3,max =15,message = "Name should be minimum 3 and max 15")
	private String address;
	
	@NotNull(message = "Customer Age is Mandatory")
	@Min(value =19, message = "Age should be Greater Than 18")
	private Integer age;
	
	@NotNull(message = "Customer Email is Mandatory")
	@Email(message = "Please pass a valid email")
	private String email;
	
	@NotNull(message = "Customer Mobile is Mandatory")
	@Size(min = 10, max =10,message = "Mobile should be 10 digit")
	@Pattern(regexp = "(\\6|7|8|9)[0-9]{9}")
	private String mobile;
	
	@NotNull(message = "Password is Mandatory")
	@Size(min = 8,max =15,message = "Password should be minimum 3 and max 15")
	private String password;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, String customerName, String address, Integer age, String email, String mobile,
			String password) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", age=" + age + ", email=" + email + ", mobile=" + mobile + ", password=" + password + "]";
	}
	
	


}
