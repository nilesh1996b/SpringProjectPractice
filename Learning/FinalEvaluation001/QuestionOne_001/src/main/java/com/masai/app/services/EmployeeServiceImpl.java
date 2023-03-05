package com.masai.app.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.Exception.EmployeeException;
import com.masai.app.model.Address;
import com.masai.app.model.Employee;
import com.masai.app.model.EmployeeDTO;
import com.masai.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository eRepo;

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		Employee emp = eRepo.save(employee);
		
		if(emp != null)
		{
		return emp;
		}else throw new EmployeeException("Employee Not Added");
	}
	
//	------------------------------------------

	@Override
	public Employee getEmployeeById(Integer employeeId) throws EmployeeException {
		 Optional<Employee> opt = eRepo.findById(employeeId);
		 
		 if(opt.isPresent())
		 {
		 Employee emp = opt.get();
		 return emp;
	     }else throw new EmployeeException("There is no employee with emp id " + employeeId);
	}
//---------------------------------------------------
	
	
	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		Employee emp = eRepo.findByEmail(email);
		if(emp!=null)
		{
			if(password == emp.getPassword())
			{
			return emp;
			}else throw new EmployeeException("Incorrect Password");
		}else throw new EmployeeException("Your Email is Incorrect");

	}
	
//	--------------------------------------------------------------------

	@Override
	public Employee updateEmployeePassword(String email, String oldPassword, String newPassword)throws EmployeeException {
		Employee emp = eRepo.findByEmail(email);
		if(emp!=null)
		{
			if(oldPassword == emp.getPassword())
			{
				emp.setPassword(newPassword);				
				return eRepo.save(emp);
				
			}else throw new EmployeeException("Incorrect Password");
		}else throw new EmployeeException("Your Email is Incorrect");
	}

//	---------------------------------------------------
	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		List<Employee> employee = eRepo.findAll();
		if(employee.isEmpty()) throw new EmployeeException("There is no employee");
		else return employee;
	}
	
//	-----------------------------------------------------------

	@Override
	public Employee deleteEmployeeById(Integer employeeId) throws EmployeeException {
		Optional<Employee> opt = eRepo.findById(employeeId);
		if(opt.isPresent())
		{
			Employee emp = opt.get();
			eRepo.delete(emp);
			return emp;
		}else throw new EmployeeException("There is no employee with id " + employeeId);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		Optional<Employee> opt = eRepo.findById(employee.getEmployeeId());
		if(opt.isPresent())
		{	
			
			Employee emp = eRepo.save(employee);
			return emp;
		}else throw new EmployeeException("Details not Updated");
	}

	// -----------------------------
	
	@Override
	public List<EmployeeDTO> getNameAddressAgeOfAllEmployees() throws EmployeeException {
		List<EmployeeDTO> data = eRepo.getNameAddressAgeOfAllEmployees();
		
		if(data != null)
		{
			return data;
		}else
			throw new EmployeeException("There is no Employee");
	}
	
	
	@Override
	public List<Employee> getEmployeesBetweenAge(Integer start_age, Integer end_age) throws EmployeeException {
		List<Employee> list = eRepo.getEmployeeBetweenAge(start_age, end_age);
		
		if(list != null)
		{
			return list;
		}else
			throw new EmployeeException("There is no Employee between age " + start_age + " and " + end_age);
	}

	@Override
	public Employee updateEmployeeAddress(Integer employeeId, Address address) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(Address address) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}
	
	








}
