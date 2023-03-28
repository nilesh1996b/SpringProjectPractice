package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.masai.model.Movie;
import com.masai.model.Series;

public class InsertDetails {
	
	public static void main(String[] args) {
		String result = "Not Inserted";
		EntityManager em = EMUtil.conn();
		
		Series sr1 =  new Series("U1",7,"S1");
		Series sr2 =  new Series("U2",8,"S2");
		Series sr3 =  new Series("U3",5,"S3");
		Series sr4 =  new Series("U4",10,"S4");
		
		Movie m1 = new Movie("U1","M1","G1");
		Movie m2 = new Movie("U1","M1","G1");
		Movie m3 = new Movie("U1","M1","G1");
		Movie m4 = new Movie("U1","M1","G1");
		
		em.getTransaction().begin();
		em.persist(sr1);
		em.persist(sr2);
		em.persist(sr3);
		em.persist(sr4);
		
		em.persist(m1);
		em.persist(m2);
		em.persist(m3);
		em.persist(m4);
		
		result = "Inserted";
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println(result);
	}

}
