package com.masai.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Shipments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shipmentId;
	private String packageNumber;
	private String content;
	private float weight;
	private String senderAddress;
	private String recipientAddress;
	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date timeStamp;

	public Shipments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shipments(int shipmentId, String packageNumber, String content, float weight, String senderAddress,
			String recipientAddress, Date timeStamp) {
		super();
		this.shipmentId = shipmentId;
		this.packageNumber = packageNumber;
		this.content = content;
		this.weight = weight;
		this.senderAddress = senderAddress;
		this.recipientAddress = recipientAddress;
		this.timeStamp = timeStamp;
	}

	public int getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getPackageNumber() {
		return packageNumber;
	}

	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getRecipientAddress() {
		return recipientAddress;
	}

	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Shipments [shipmentId=" + shipmentId + ", packageNumber=" + packageNumber + ", content=" + content
				+ ", weight=" + weight + ", senderAddress=" + senderAddress + ", recipientAddress=" + recipientAddress
				+ ", timeStamp=" + timeStamp + "]";
	}
	

}
