package com.masai.dao;

import com.masai.entities.Shipments;

public interface CourierDAO {
	
	Shipments getInfoById(int id);
	String createShipment(Shipments shipments);
	String deleteShipmentById(int id);
	String updateDetails(int id,String content, float weight,String recipientAddress);

}
