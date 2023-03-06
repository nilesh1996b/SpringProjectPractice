package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.util.GetConnection;

public class MasaiDaoImpl implements MasaiDao {
	
	

	@Override
	public String registerEmployee(Employee employee) throws EmployeeException {
		
		String message = "Not Registered";
		
		try(Connection conn = GetConnection.connectSQL())
		{
			PreparedStatement ps = conn.prepareStatement("insert into studentlist values(?,?,?)");

			int roll = employee.getRoll() ;
			ps.setInt(1, roll);
			
			String name = employee.getName();
			ps.setString(2, name);
			
			int age = employee.getAge();
			ps.setInt(3, age);

					
			int x = ps.executeUpdate();
			if(x>0) {
			message = "Worker registration Done";
			}
		}catch(SQLException e)
		{
			
		}
		
		return message;
		
	}

	
	
	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee details = null;
		try(Connection conn = GetConnection.connectSQL())
		{
			PreparedStatement ps = conn.prepareStatement("select * from studentlist where roll = ?");
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				int i = rs.getInt("roll");
				String n = rs.getString("name");
				int a = rs.getInt("age");
				
				details = new Employee(i,n,a);
				
			}else
				throw new EmployeeException("Worker does not exist with empID " + empId);

		}catch(SQLException e)
		{
			throw new EmployeeException(e.getMessage());
		}
		
		return details;	
	}

	
	
}
