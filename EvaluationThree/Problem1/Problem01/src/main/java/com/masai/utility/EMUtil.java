package com.masai.utility;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil{

	private static EntityManagerFactory emf;

	static {
		emf = Persistence.createEntityManagerFactory("mismatch-unit");
	}
	
	public static EntityManager provideEntityManager() {
		EntityManager em = emf.createEntityManager();
		return em;
	}

}
