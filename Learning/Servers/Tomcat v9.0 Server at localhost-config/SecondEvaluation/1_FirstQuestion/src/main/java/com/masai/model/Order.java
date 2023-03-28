package com.masai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;
	private String deliveryAddress;
	private double totalAmount;
	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date createdAt;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "order")
	private List<Item> items = new ArrayList<>();

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int order_id, String deliveryAddress, double totalAmount, Date createdAt,
			List<Item> items) {
		super();
		this.order_id = order_id;
		this.deliveryAddress = deliveryAddress;
		this.totalAmount = totalAmount;
		this.createdAt = createdAt;
		this.items = items;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", deliveryAddress=" + deliveryAddress + ", totalAmount=" + totalAmount
				+ ", createdAt=" + createdAt + ", items=" + items + "]";
	}

}
