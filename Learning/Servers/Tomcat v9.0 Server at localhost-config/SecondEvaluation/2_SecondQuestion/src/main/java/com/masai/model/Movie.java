package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie extends Hotstar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private String genre;

	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Movie(String userName, String movieName, String genre) {
		super(userName);

		this.movieName = movieName;
		this.genre = genre;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}



	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + "]";
	}
	
	



}
