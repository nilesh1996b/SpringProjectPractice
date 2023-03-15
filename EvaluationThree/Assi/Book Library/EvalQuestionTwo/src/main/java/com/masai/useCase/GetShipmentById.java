package com.masai.useCase;

import java.util.Scanner;

import com.masai.dao.CourierDAO;
import com.masai.dao.CourierDAOImpl;
import com.masai.entities.Shipments;

public class GetShipmentById {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your ID");
		int id = sc.nextInt();
		
		CourierDAO ob = new CourierDAOImpl();
		
		Shipments shipments = ob.getInfoById(id);
		if(shipments != null)
		{
			System.out.println(shipments);
		}else
		{
			System.out.println("There is no shipments by ID : " + id);
		}

	}

}
