package com.masai.usecase;

import java.util.Date;

import com.masai.dao.ServiceDao;
import com.masai.dao.ServiceDaoImpl;

public class PrintItemListIfGreaterThanInputDate {
	
	public static void main(String[] args) {
		
		ServiceDao sr = new ServiceDaoImpl();
		
		sr.getItems(new Date("2011-10-21"));
		
	}

}
