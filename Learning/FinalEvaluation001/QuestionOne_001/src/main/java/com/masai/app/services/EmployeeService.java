package com.masai.app.services;

import java.util.List;

import com.masai.app.Exception.EmployeeException;
import com.masai.app.model.Address;
import com.masai.app.model.Employee;
import com.masai.app.model.EmployeeDTO;


public interface EmployeeService {

	public Employee registerEmployee(Employee employee)throws EmployeeException;
	
	public Employee getEmployeeById(Integer employeeId)throws EmployeeException;
	
	public Employee loginEmployee(String email, String password)throws EmployeeException;
	
	public Employee updateEmployeePassword(String email, String oldPassword,String newPassword)throws EmployeeException ; public List<Employee> getAllEmployeeDetails()throws EmployeeException;
	
	public Employee deleteEmployeeById(Integer employeeId)throws EmployeeException;
	

	public Employee updateEmployee(Employee employee)throws EmployeeException;

	public List<Employee> getEmployeesBetweenAge(Integer start_age, Integer end_age)throws EmployeeException;
	
	public List<EmployeeDTO> getNameAddressAgeOfAllEmployees()throws EmployeeException; 
	
	//Not Done
	public Employee updateEmployeeAddress(Integer employeeId, Address address) throws EmployeeException;
	public List<Employee> getEmployeeDetailsByAddress(Address address)throws EmployeeException;
	
}
