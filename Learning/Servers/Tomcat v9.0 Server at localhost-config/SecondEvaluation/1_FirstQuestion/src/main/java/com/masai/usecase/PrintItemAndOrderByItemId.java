package com.masai.usecase;

import com.masai.dao.ServiceDao;
import com.masai.dao.ServiceDaoImpl;
import com.masai.exception.ItemNotFoundException;

public class PrintItemAndOrderByItemId {
	
	public static void main(String[] args) {
		
		ServiceDao sr = new ServiceDaoImpl();
		
		try {
			sr.getItem(1);
		} catch (ItemNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
