package com.nilesh.dayOne;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDaylyFortune() {
		return fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 minutes on batting practice";
	}




}
