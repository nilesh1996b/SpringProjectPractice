package com.masai.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Account;
import com.masai.service.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	private AccountService aService;
	
	@PostMapping("/Accounts")
	public ResponseEntity<Account> registerAccountHandler(@RequestBody Account account)
	{
		Account registerdAccount = aService.openAccount(account);
		
		return new ResponseEntity<Account>(registerdAccount, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/accounts/{accno}")
	public ResponseEntity<Account> deleteAccountByaccnoHandler(@PathVariable("accno") Integer accno)
	{
		Account deletedAccount = aService.closeAccount(accno);
		
		return new ResponseEntity<Account>(deletedAccount,HttpStatus.OK);
	}
	

	
	@PutMapping("/accounts/{accno}")
	public ResponseEntity<Account> depositAccountbalanceByaccnoHandler(@PathVariable("accno")Integer accno,@RequestParam("gbalance")Integer gbalance)
	{
		Account updatedAccount = aService.depositAmount(accno, gbalance);
		
		return new ResponseEntity<Account>(updatedAccount,HttpStatus.ACCEPTED);
	}
	@PutMapping("/account/{accno}")
	public ResponseEntity<Account> withdrawAccountbalanceByaccnoHandler(@PathVariable("accno")Integer accno,@RequestParam("gbalance")Integer gbalance)
	{
		Account updatedAccount = aService.withdrawAmount(accno, gbalance);
		
		return new ResponseEntity<Account>(updatedAccount,HttpStatus.ACCEPTED);
	}
	
}
