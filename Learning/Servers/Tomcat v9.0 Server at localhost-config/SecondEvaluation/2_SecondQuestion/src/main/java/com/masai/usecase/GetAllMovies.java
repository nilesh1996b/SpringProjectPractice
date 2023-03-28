package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.EMUtil.EMUtil;
import com.masai.model.Movie;

public class GetAllMovies {
	
	public static void main(String[] args) {
		EntityManager em = EMUtil.conn();
		
		String jpql = "from Movie";
		
		TypedQuery<Movie> q = em.createQuery(jpql,Movie.class);
		
		List<Movie>movies = q.getResultList();
		
		movies.forEach(System.out::println);
		
	}

}
