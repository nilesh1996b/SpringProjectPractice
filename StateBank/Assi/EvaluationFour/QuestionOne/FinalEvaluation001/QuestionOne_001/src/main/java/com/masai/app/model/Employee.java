package com.masai.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "Employee ID is Mandatory")
	private Integer employeeId; 
	
	@NotNull(message = "Employee name is Mandatory")
	@Size(min = 3,max =10,message = "Name should be minimum 3 and max 10")
	private String employeeName; 
	
	@NotNull(message = "Employee Addresss is Mandatory")
	private Address address;
	
	@Min(value =19, message = "Age should be Greater Than 18")
	@NotNull(message = "Employee age is Mandatory")
	private Integer age;
	
	@NotNull(message = "Employee email is Mandatory")
	@Email(message = "Please pass a valid email")
	private String email; 
	
	@NotNull(message = "Employee mobile is Mandatory")
	@Size(min = 10, max =10,message = "Mobile should be 10 digit")
	@Pattern(regexp = "(\\6|7|8|9)[0-9]{9}")
	private String mobile; 
	
	@NotNull(message = "Employee password is Mandatory")
	@Size(min = 8,max =15,message = "Password should be minimum 3 and max 15")
	private String password;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer employeeId, String employeeName, Address address, Integer age, String email, String mobile,
			String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
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
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address
				+ ", age=" + age + ", email=" + email + ", mobile=" + mobile + ", password=" + password + "]";
	}


	
	
}
