package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
import com.masai.repository.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao sdao;

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException{
		
		Customer saved = sdao.save(customer);
		
		if(saved==null)
			 throw new CustomerException("There is some error");
		
		return saved;
	}

	@Override
	public Customer getCustomerById(Integer customerId)throws CustomerException {
		
		
		return sdao.
				findById(customerId).
				orElseThrow(()->new CustomerException("Customer does not exist with Id " + customerId));
		
	}

	@Override
	public List<Customer> getAllCustomerDetails()throws CustomerException {
		List<Customer> customers = sdao.findAll();
		
		if(customers.size()==0)
		{
			throw new CustomerException("No Customer found");
		}else
			
		
		return customers;
	}

	@Override
	public Customer deleteCustomerById(Integer customerId)throws CustomerException {
		
		Optional<Customer> opt = sdao.findById(customerId);
		
		if(opt.isPresent()) {
			Customer existingCustomer = opt.get();
			sdao.delete(existingCustomer);
			return existingCustomer;
		}
		else
		{
			throw new CustomerException("Customer does not exist with ID : " + customerId);
		}

	}

	@Override
	public Customer updateCustomer(Customer customer)throws CustomerException {
		Optional<Customer> opt = sdao.findById(customer.getCustomerId());
		
		if(opt.isPresent()) {
			
			//this save method perform 2 operation 1. save 2 update
			Customer updatedCustomer = sdao.save(customer);
			return updatedCustomer;
		}
		else
		{
			throw new CustomerException("Customer does not exist");
		}
	}

	@Override
	public Customer updateCustomerPassword(String username, String oldPassword,String newPassword)throws CustomerException {
		Customer existingCustomer = sdao.findByCustomerName(username);
				
		if(existingCustomer != null)
		{
			if(existingCustomer.getPassword()==oldPassword)
			{
				existingCustomer.setPassword(newPassword);
				return sdao.save(existingCustomer);
			}else {
				throw new CustomerException("Incorrect Password");
			}
		}else {
			throw new CustomerException("Incorrect Username");
		}		
		
	}
	
	@Override
	public Customer loginCustomer(String email, String password)throws CustomerException {
		Customer existingCustomer = sdao.findByCustomerEmail(email);
		
		if(existingCustomer != null)
		{
			if(existingCustomer.getPassword()==password)
			{
				return existingCustomer;
			}else {
				throw new CustomerException("Incorrect Password");
			}
		}else {
			throw new CustomerException("Incorrect Email");
		}		
		
	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address)throws CustomerException {
		List<Customer> customers = sdao.findByAddress(address);
		
		if(customers.isEmpty())
			throw new CustomerException("No Customer found with Address");
		
		return customers;
	}


	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age)throws CustomerException {
		List<Customer> list = sdao.getCustomersBetweenAge(start_age, end_age);
		
		if(list.isEmpty())
			throw new CustomerException("Customer not found between : " + start_age +" and "+ end_age );
		else
			return list;
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}





}
