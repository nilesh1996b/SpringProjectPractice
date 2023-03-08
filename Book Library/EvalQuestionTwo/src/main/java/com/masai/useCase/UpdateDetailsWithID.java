package com.masai.useCase;

import java.util.Scanner;

import com.masai.dao.CourierDAO;
import com.masai.dao.CourierDAOImpl;
import com.masai.entities.Shipments;

public class UpdateDetailsWithID {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your ID");
		int id = sc.nextInt();
		
		System.out.println("Enter Your CGPA");
		int cgpa = sc.nextInt();
		
		CourierDAO ob = new CourierDAOImpl();
		
		String result = ob.updateStudentCGPA(id, cgpa);
		
		System.out.println(result);

	}

}
