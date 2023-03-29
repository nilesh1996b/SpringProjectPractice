package com.masai.app.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.masai.app.model.Employee;
import com.masai.app.model.EmployeeDTO;




@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public Employee findByEmail(String email);
	
	@Query("from employee where age>:start_age && age<:end_age")
	public List<Employee> getEmployeeBetweenAge(Integer start_age, Integer end_age);
	
	@Query("select new com.masai.app.model.EmployeeDTO(e.addresss, e.age)")
	public List<EmployeeDTO> getNameAddressAgeOfAllEmployees();

}
