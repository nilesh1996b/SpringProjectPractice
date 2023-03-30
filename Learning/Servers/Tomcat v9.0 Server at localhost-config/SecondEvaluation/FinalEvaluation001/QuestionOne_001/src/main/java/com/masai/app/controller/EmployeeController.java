package com.masai.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Employee;
import com.masai.app.model.EmployeeDTO;
import com.masai.app.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> registerEmp(@RequestBody Employee employee)
	{
		Employee addedEmployee = eService.registerEmployee(employee);
		
		return new ResponseEntity<>(addedEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("id") Integer employeeId)
	{
		Employee getEmployee = eService.getEmployeeById(employeeId);
		
		return new ResponseEntity<>(getEmployee, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/login/{email}/{password}")
	public ResponseEntity<Employee> loginByEmailAndPassword(@PathVariable("email") String email, @PathVariable("password") String password)
	{
		Employee getLogin = eService.loginEmployee(email, password);
		
		return new ResponseEntity<>(getLogin, HttpStatus.ACCEPTED);
	}
	
	@PatchMapping("/login/{email}/{oldPassword}/{newPassword}")
	public ResponseEntity<Employee> updatePassword(@PathVariable("email") String email, @PathVariable("oldPassword") String oldPassword, @PathVariable("newPassword") String newPassword)
	{
		Employee passwordUpdated = eService.updateEmployeePassword(email, oldPassword, newPassword);
		
		return new ResponseEntity<>(passwordUpdated, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/allEmployee")
	public ResponseEntity<List<Employee>> getAllEmp()
	{
		List<Employee> getEmployee = eService.getAllEmployeeDetails();
		
		return new ResponseEntity<>(getEmployee, HttpStatus.OK);
	}
	
	@DeleteMapping("/employee/{empId}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("empId") Integer employeeId)
	{
		Employee emp = eService.deleteEmployeeById(employeeId);
		
		return new ResponseEntity<>(emp, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee)
	{
		Employee empUpdated = eService.updateEmployee(employee);
		
		return new ResponseEntity<>(empUpdated, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getAllAddressAge")
	public ResponseEntity<List<EmployeeDTO>> getAllAddAge()
	{
		List<EmployeeDTO> list = eService.getNameAddressAgeOfAllEmployees();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/getAllempAgeBetween/{startAge}/{endAge}")
	public ResponseEntity<List<Employee>> getEmpBetweenAge(@PathVariable("startAge ") Integer start_age, @PathVariable("endAge ") Integer end_age)
	{
		List<Employee> list = eService.getEmployeesBetweenAge(start_age, end_age);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
