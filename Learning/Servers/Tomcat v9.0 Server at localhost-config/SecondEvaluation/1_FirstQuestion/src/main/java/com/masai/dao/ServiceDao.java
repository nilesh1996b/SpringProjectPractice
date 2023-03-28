package com.masai.dao;

import java.util.Date;
import java.util.List;

import com.masai.exception.ItemNotFoundException;
import com.masai.exception.OrderNotFoundException;
import com.masai.model.Item;
import com.masai.model.Order;

public interface ServiceDao {
	
	public void createItem(Item item, Order order);
	public void createItems(List<Item> items, Order order);
	
	public void getItem(int itemId) throws ItemNotFoundException;
	public void getOrder(int orderId) throws OrderNotFoundException;
	
	public void getItems(Date inputDate);
}
