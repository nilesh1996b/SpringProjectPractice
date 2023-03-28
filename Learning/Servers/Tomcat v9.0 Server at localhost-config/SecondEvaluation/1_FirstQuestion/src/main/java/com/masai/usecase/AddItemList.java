package com.masai.usecase;

import java.util.Date;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.masai.dao.ServiceDao;
import com.masai.dao.ServiceDaoImpl;
import com.masai.model.Item;
import com.masai.model.Order;

public class AddItemList {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.conn();
		
		Order order = em.find(Order.class, 1);
		
		if(order != null)
		{
			Item items = new Item();
			
			items.setName("N1");
			items.setEstimatedDeliveryDate(new Date());
			items.setCreatedAt(new Date());
			
			order.getItems().add(items);
			
			ServiceDao dao = new  ServiceDaoImpl();
			
			dao.createItem(items, order);
		}else
		{
			System.out.println("There is no order");
		}
		
		

		
		

		

		
		

		
	}

}
