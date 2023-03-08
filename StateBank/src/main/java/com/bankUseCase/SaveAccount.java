package com.bankUseCase;

import java.util.Scanner;

import com.bankDao.StateBankDAO;
import com.bankDao.StateBankDAOImpl;
import com.bankUtilities.Account;

public class SaveAccount {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Email Address");
		String email = sc.next();
		System.out.println("Enter Address");
		String address = sc.next();
		System.out.println("Enter Balance");
		double balance = sc.nextDouble();
		System.out.println("Enter Date eg - YYYY-MM-DD");
		String date = sc.next();
		
		StateBankDAO sb = new StateBankDAOImpl();
		String confirmation = sb.saveAccount(new Account(email,address,balance,date));
		
		System.out.println(confirmation);
		
		
	}
}
