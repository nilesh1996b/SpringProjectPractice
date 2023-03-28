package com.masai.usecase;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.EMUtil.EMUtil;
import com.masai.model.Movie;

public class GetMovieEqualToX {
	
	public static void main(String[] args) {
		
		int x = 2;
		
		EntityManager em = EMUtil.conn();
		
		String jpql = "from Movie where movieId = '"+x+"'";
		
		TypedQuery<Movie> q = em.createQuery(jpql,Movie.class);
		
		Movie movie = q.getSingleResult();
		
		if(movie==null)
		{
			System.out.println("There is no Movie with X");
		}else {
			System.out.println(movie.toString());
		}
		
	}
	
	

}
