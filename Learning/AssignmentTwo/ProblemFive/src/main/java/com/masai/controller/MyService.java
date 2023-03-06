package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyService {
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "Welcome to Spring Boot";
		}
	
	@RequestMapping("/employee")
	public Employee employeeDetails()
	{
		Employee details = new Employee(1,"Nilesh","Mumbai",5000);
		
		return details;
	}
	
	@RequestMapping("/employees")
	public List<Employee> generateEmplyeeDetails()
	{
		List<Employee> employee = new ArrayList<>();
		
		employee.add(new Employee(10,"Ram","delhi",7000));
		employee.add(new Employee(11,"Sam","mumbai",8500));
		employee.add(new Employee(12,"Ramesh","pune",6700));
		employee.add(new Employee(13,"Nilesh","chennai",9000));
		employee.add(new Employee(14,"Dinesh","kolkata",8800));
		
		return employee;
	}

}
