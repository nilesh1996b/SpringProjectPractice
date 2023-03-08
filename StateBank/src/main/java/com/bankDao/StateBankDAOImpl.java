package com.bankDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bankUtilities.Account;

public class StateBankDAOImpl implements StateBankDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
	EntityManager em = emf.createEntityManager();


	public Account findAccountById(int id) {

		Account account = em.find(Account.class, id);
		
		if(account != null) {
			return account;
		}
		
		return null;
	}

	public String saveAccount(Account account) {
		
		String message = "Not Registered";
		
		em.getTransaction().begin();
		em.persist(account); 
		em.getTransaction().commit();
		message = "Account Registered";
		em.close();
		
		return message;
	}

	public String deleteAccountById(int id) {
		String message = "There is no Account with id " + id;
		
		Account account = em.find(Account.class,id);
		
		if(account != null)
		{
			em.getTransaction().begin();
			em.remove(account);
			em.getTransaction().commit();
			
			message = "Account Removed";
		}		
		em.close();
			
		
		return message;
	}

	public String withdrawFromAccount(double amount, int accountId) {
		
		String message = null;
		
		Account account = em.find(Account.class, accountId);		
		if(account == null)
		{
			message = "There is Account with id " + accountId;
		}
		else
		{
			
			em.getTransaction().begin();
			if(account.getBalance()>=amount){
			account.setBalance(account.getBalance()-amount);
			
			em.getTransaction().commit();
			message = "Withdrawl is Done";
			}else {
				message = "Balance is Insufficient";
			}
			
			
		}
		
		em.close();
		return message;
	}

	public String depositInAccount(double amount, int accountId) {
		String message = null;
		
		Account account = em.find(Account.class, accountId);		
		if(account == null)
		{
			message = "There is Account with id " + accountId;
		}
		else
		{
			
			em.getTransaction().begin();
			account.setBalance(account.getBalance()+amount);
			
			em.getTransaction().commit();
			
			message = "Diposit is Done";
		}
		
		em.close();
		return message;
	}

}
