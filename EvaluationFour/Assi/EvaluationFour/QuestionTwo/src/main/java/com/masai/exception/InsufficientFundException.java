package com.masai.exception;

public class InsufficientFundException extends RuntimeException {
	
	public InsufficientFundException()
	{
		
	}
	
	public InsufficientFundException(String message)
	{
		super(message);
	}

}
