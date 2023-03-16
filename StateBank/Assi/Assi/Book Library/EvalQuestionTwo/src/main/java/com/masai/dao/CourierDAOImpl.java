package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.masai.entities.Shipments;

public class CourierDAOImpl implements CourierDAO {



	@Override
	public Shipments getInfoById(int id) {
		EntityManager em = EMUtil.provideEntityManager();
		
		Shipments shipments = em.find(Shipments.class, id);
		
		
		return shipments;
	}

	@Override
	public String createShipment(Shipments shipments) {
		String message = "Shipment Not Registered";
		
		EntityManager em = EMUtil.provideEntityManager();
		
		shipments.setContent(shipments.getContent());
		shipments.setPackageNumber(shipments.getPackageNumber());
		shipments.setRecipientAddress(shipments.getRecipientAddress());
		shipments.setSenderAddress(shipments.getSenderAddress());
		shipments.setWeight(shipments.getWeight());
		shipments.setTimeStamp(shipments.getTimeStamp());
		
		em.getTransaction().begin();
		em.persist(shipments);
		em.getTransaction().commit();
		
		if(shipments != null)
		{
			message = "Shipment Registered";
		}
		
		return message;
	}

	@Override
	public String deleteShipmentById(int id) {
		String message = "There is no Shipment with id : " + id;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Shipments shipments = em.find(Shipments.class, id);
		
		if(shipments != null)
		{
		em.getTransaction().begin();
		em.remove(shipments);
		message = "Shipment Deleted";
		em.getTransaction().commit();
		em.close();
		}
		
		return message;
	}

	@Override
	public String updateDetails(int id, String content, float weight, String recipientAddress) {
		String message = "There is no Student with id : " + id;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Shipments shipments = em.find(Shipments.class, id);
		
		if(shipments != null)
		{
		em.getTransaction().begin();
		shipments.setContent(content);
		shipments.setWeight(weight);
		shipments.setRecipientAddress(recipientAddress);
		em.persist(shipments);
		message = "Student Updated";
		em.getTransaction().commit();
		em.close();
		}
		return message;
	}

}
