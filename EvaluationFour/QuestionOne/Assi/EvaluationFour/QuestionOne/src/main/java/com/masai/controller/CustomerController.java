package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Customer;
import com.masai.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService sService;
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> registerCustomerHandler(@RequestBody Customer customer)
	{
		Customer registerdCustomer = sService.registerCustomer(customer);
		
		return new ResponseEntity<Customer>(registerdCustomer, HttpStatus.CREATED);
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomerByIdHandler(@PathVariable("id") Integer customerId)
	{
		Customer customer = sService.getCustomerById(customerId);
		
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomerHandler()
	{
		List<Customer> customer =  sService.getAllCustomerDetails();
		
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
	}
	
	@DeleteMapping("/customers/{id}")
	public ResponseEntity<Customer> deleteStudentByRollHandler(@PathVariable("id") Integer customerId)
	{
		Customer deletedCustomer = sService.deleteCustomerById(customerId);
		
		return new ResponseEntity<Customer>(deletedCustomer,HttpStatus.OK);
	}
	
	@PutMapping("/customers")
	public ResponseEntity<Customer> updateCustomerHandler(@RequestBody Customer customer)
	{
		Customer updatedCustomer = sService.updateCustomer(customer);
		
		return new ResponseEntity<Customer>(updatedCustomer,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/customers/{username}/{oldPassword}/{newPassword}")
	public ResponseEntity<Customer> updateStudentPasswordByRollHandler(@PathVariable("username")String username, @PathVariable("oldPassword") String oldPassword,@PathVariable("newPassword")String newPassword)
	{
		Customer updatedPassword = sService.updateCustomerPassword(username, oldPassword, newPassword);
		
		return new ResponseEntity<Customer>(updatedPassword,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/customers/{email}/{password}")
	public ResponseEntity<Customer> loginWithEmailAndPassword(@PathVariable("email")String email, @PathVariable("password") String password)
	{
		Customer login = sService.loginCustomer(email, password);
		
		return new ResponseEntity<Customer>(login,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getCustomer/{address}")
	
	public ResponseEntity<List<Customer>> getCustomerByAddressHandler(@PathVariable("address")String address)
	{
		List<Customer>list = sService.getCustomerDetailsByAddress(address);
		
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
	}
	
	
	@GetMapping("/getCustomer/{start_age}/{end_age}")
	public ResponseEntity<List<Customer>> getCustomersBetweenAgeHandler(@PathVariable("start_age")Integer start_age,@PathVariable("end_age") Integer end_age)
	{
		List<Customer> details = sService.getCustomersBetweenAge(start_age, end_age);
		
		return new ResponseEntity<List<Customer>>(details,HttpStatus.OK);
	}
	


}
