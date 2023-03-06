package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.MasaiDao;
import com.masai.dao.MasaiDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class RegisterEmployee {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter Employee Roll number");
			int roll = sc.nextInt();

			System.out.println("Enter Employee name");
			String name = sc.next();

			System.out.println("Enter Employee age");
			int age = sc.nextInt();			
			
			MasaiDao ob1 = new MasaiDaoImpl();
			
			try {
				String result = ob1.registerEmployee(new Employee(roll,name,age));
				System.out.println(result );
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
