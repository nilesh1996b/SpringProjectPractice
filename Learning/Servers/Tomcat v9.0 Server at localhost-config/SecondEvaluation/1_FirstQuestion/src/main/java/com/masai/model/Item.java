package com.masai.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String name;
	private Date estimatedDeliveryDate;

	@Temporal(TemporalType.TIMESTAMP) 
	private Date createdAt;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id")
	private Order order;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String name, Date estimatedDeliveryDate, Date createdAt, Order order) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.estimatedDeliveryDate = estimatedDeliveryDate;
		this.createdAt = createdAt;
		this.order = order;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", estimatedDeliveryDate=" + estimatedDeliveryDate
				+ ", createdAt=" + createdAt + ", order=" + order + "]";
	}
	
}
