package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Series extends Hotstar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seriesId;
	private int noOfEpisodes;
	private String seriesName;
	
	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Series(String userName, int noOfEpisodes, String seriesName) {
		super(userName);
		this.noOfEpisodes = noOfEpisodes;
		this.seriesName = seriesName;
	}

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}

	public int getNoOfEpisodes() {
		return noOfEpisodes;
	}

	public void setNoOfEpisodes(int noOfEpisodes) {
		this.noOfEpisodes = noOfEpisodes;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	@Override
	public String toString() {
		return "Series [seriesId=" + seriesId + ", noOfEpisodes=" + noOfEpisodes + ", seriesName=" + seriesName + "]";
	}

	

}
