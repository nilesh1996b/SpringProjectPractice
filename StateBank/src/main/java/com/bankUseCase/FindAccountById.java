package com.bankUseCase;

import java.util.Scanner;

import com.bankDao.StateBankDAO;
import com.bankDao.StateBankDAOImpl;
import com.bankUtilities.Account;

public class FindAccountById {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		

		
		StateBankDAO sb = new StateBankDAOImpl();	
		
		Account ac = sb.findAccountById(id);
		
		if(ac!=null)
			{
			System.out.println(ac);
			}
		else{
			System.out.println("No Account with the ID - " + id);
		};

	}

}
