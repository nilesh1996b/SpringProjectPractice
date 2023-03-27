package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.repository.AccountDao;


public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao sdao;


	@Override
	public Account openAccount(Account acc) throws AccountException {
		
		Account openAcc = sdao.save(acc);
		return openAcc;
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		Optional<Account> opt = sdao.findById(accno);
		
		if(opt.isPresent()) {
			Account existingAccount = opt.get();
			sdao.delete(existingAccount);
			return existingAccount;
		}
		else
		{
			throw new AccountException("Account does not exist with Account number : " + accno);
		}

	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		Account existingAccount = sdao.findById(accno).orElseThrow(()->new AccountException("Account does not exist with Account Number : " + accno));
		
		existingAccount.setBalance(existingAccount.getBalance()+ amount);
		
		return sdao.save(existingAccount);
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) throws AccountException, InsufficientFundException {
		Account existingAccount = sdao.findById(accno).orElseThrow(()->new AccountException("Account does not exist with Account Number : " + accno));
		
		
		if(existingAccount.getBalance()>=amount) {
		existingAccount.setBalance(existingAccount.getBalance()- amount);
		return sdao.save(existingAccount);
		}else
		{
			throw new AccountException("Insuficient Balance");
		}
		
		
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		// TODO Auto-generated method stub
		return null;
	}

}
