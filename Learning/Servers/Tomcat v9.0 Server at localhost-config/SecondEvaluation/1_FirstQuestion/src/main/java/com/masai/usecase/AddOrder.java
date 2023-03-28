package com.masai.usecase;

import java.util.Date;

import com.masai.dao.ServiceDao;
import com.masai.dao.ServiceDaoImpl;

import com.masai.model.Item;
import com.masai.model.Order;


public class AddOrder {
	
	public static void main(String[] args) {
		
		Order order =  new Order();
		
		
		order.setDeliveryAddress("Mumbai");
		order.setTotalAmount(50000);
		order.setCreatedAt(new Date());
		
		
		Item items = new Item();
		
		items.setName("N1");
		items.setEstimatedDeliveryDate(new Date());
		items.setCreatedAt(new Date());
		
		items.setOrder(order);
		order.getItems().add(items);
		
		ServiceDao dao = new  ServiceDaoImpl();
		
		dao.createItem(items, order);
		
		
	}

}
