package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.masai.model.Customer;


@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

	public List<Customer> findByAddress(String address);	
	public Customer findByCustomerName(String username);	
	public Customer findByCustomerEmail(String email);	

		
	@Query("select * from Customer where age>?1 AND age<?2")
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age);
	


	
	
}
