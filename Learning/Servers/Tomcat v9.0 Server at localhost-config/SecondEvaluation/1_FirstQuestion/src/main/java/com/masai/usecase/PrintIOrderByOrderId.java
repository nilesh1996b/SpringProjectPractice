package com.masai.usecase;

import com.masai.dao.ServiceDao;
import com.masai.dao.ServiceDaoImpl;
import com.masai.exception.ItemNotFoundException;
import com.masai.exception.OrderNotFoundException;

public class PrintIOrderByOrderId {
	
	public static void main(String[] args) {
		
		ServiceDao sr = new ServiceDaoImpl();
		

			try {
				sr.getOrder(1);
			} catch (OrderNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}

			
		
	}

}
