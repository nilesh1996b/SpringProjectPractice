package com.masai.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.EMUtil.EMUtil;
import com.masai.exception.ItemNotFoundException;
import com.masai.exception.OrderNotFoundException;
import com.masai.model.Item;
import com.masai.model.Order;

public class ServiceDaoImpl implements ServiceDao {

	@Override
	public void createItem(Item item, Order order) {
		EntityManager em = EMUtil.conn();
		
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("New Order Has been Added");
		
	}

	@Override
	public void createItems(List<Item> items, Order order) {
		EntityManager em = EMUtil.conn();
		
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("New Item Has been Added");
		
	}

	@Override
	public void getItem(int itemId) throws ItemNotFoundException {
		EntityManager em = EMUtil.conn();
		Item item = em.find(Item.class, itemId);
		
		if(item==null) throw new ItemNotFoundException("There is no Item with item id : " + itemId);
		System.out.println("Item id " + item.getItemId());
		System.out.println("Item Name " + item.getName());
		System.out.println("Item created Date " + item.getCreatedAt());
		System.out.println("Item Estimated Delivery Date " + item.getEstimatedDeliveryDate());
		System.out.println("Order Details " + item.getOrder().toString());
			
	}

	@Override
	public void getOrder(int orderId) throws OrderNotFoundException {
		EntityManager em = EMUtil.conn();
		Order order = em.find(Order.class, orderId);
		
		if(order==null) throw new OrderNotFoundException("There is no Order with order id : " + orderId);
		
		System.out.println(order.toString());
	}

	@Override
	public void getItems(Date inputDate) {
		EntityManager em = EMUtil.conn();
		String jpql = "from Item where EstimatedDeliveryDate > '"+inputDate+"'";
		
		TypedQuery<Item> q = em.createQuery(jpql,Item.class);
		
		List<Item> items = q.getResultList();
		
		items.forEach(System.out::println);
		
	}



}
