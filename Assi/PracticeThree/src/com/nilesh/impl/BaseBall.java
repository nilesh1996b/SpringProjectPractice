package com.nilesh.impl;

import com.nilesh.service.Coach;
import com.nilesh.service.FortuneService;

public class BaseBall implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailId;
	
	private int score;
	
	public void setScore(int score) {
		this.score = score;
	}

	public void setEmailId(String emailIds) {
		this.emailId = emailIds;
	}

	public BaseBall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setFortuneService(FortuneService fortuneServices) {
		this.fortuneService = fortuneServices;
	}



	@Override
	public String getCoach() {
		return emailId + "Do Batting practice";
	}

	@Override
	public String getYourFortune() {
		return fortuneService.getFortune() +  " your team will score " + score;
	}
	
	public static void startYourProgramm()
	{
		System.out.println("Program has been started");
	}
	public static void programIsClosed()
	{
		System.out.println("Program has been Closed");
	}

}
