package com.bankUseCase;

import java.util.Scanner;

import com.bankDao.StateBankDAO;
import com.bankDao.StateBankDAOImpl;


public class DepositAmount {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account ID");
		int id = sc.nextInt();
		
		System.out.println("Enter Amount for Withdrawal");
		double amount = sc.nextDouble();
		
		StateBankDAO sb = new StateBankDAOImpl();	
		
		String ac = sb.depositInAccount(amount, id);
		
		System.out.println(ac);
		
		
	}

}
