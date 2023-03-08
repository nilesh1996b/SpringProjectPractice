package com.bankUseCase;

import java.util.Scanner;

import com.bankDao.StateBankDAO;
import com.bankDao.StateBankDAOImpl;


public class DeleteAccount {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id to delete Account");
		int id = sc.nextInt();
		
		StateBankDAO sb = new StateBankDAOImpl();			
		String ac = sb.deleteAccountById(id);
		
		System.out.println(ac);

	}

}
