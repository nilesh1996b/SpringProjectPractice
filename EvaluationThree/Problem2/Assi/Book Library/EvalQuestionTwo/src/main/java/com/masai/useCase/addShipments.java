package com.masai.useCase;

import java.util.Scanner;

import com.masai.dao.CourierDAO;
import com.masai.dao.CourierDAOImpl;
import com.masai.entities.Shipments;

public class addShipments {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CourierDAO ob = new CourierDAOImpl();
		
		Shipments shipments = new Shipments();
		
		System.out.println("Enter Your email");
		String email = sc.next();
		
		System.out.println("Enter Your address");
		String address = sc.next();
		
		System.out.println("Enter Your cgpa");
		int cgpa = sc.nextInt();
		
		shipments.setContent(address);
		shipments.setWeight(cgpa);
		shipments.setCgpa(cgpa);
		
		String result = ob.saveStudent(shipments);
		
		System.out.println(result);
		
	}
}
