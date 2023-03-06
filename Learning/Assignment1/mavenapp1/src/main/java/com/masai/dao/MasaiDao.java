package com.masai.dao;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface MasaiDao {

	public String registerEmployee(Employee employee)throws EmployeeException;
	public Employee getEmployeeById(int empId)throws EmployeeException;
	
}
