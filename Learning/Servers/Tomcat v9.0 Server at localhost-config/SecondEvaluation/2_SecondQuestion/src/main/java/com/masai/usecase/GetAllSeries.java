package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.EMUtil.EMUtil;
import com.masai.model.Movie;
import com.masai.model.Series;

public class GetAllSeries {
	
	public static void main(String[] args) {
		EntityManager em = EMUtil.conn();
		
		String jpql = "from Series";
		
		TypedQuery<Series> q = em.createQuery(jpql,Series.class);
		
		List<Series> series = q.getResultList();
		
		series.forEach(System.out::println);
		
	}

}
