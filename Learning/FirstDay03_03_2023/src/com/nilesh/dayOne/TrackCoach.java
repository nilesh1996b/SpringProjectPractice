package com.nilesh.dayOne;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	

//	public TrackCoach() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDaylyFortune() {
		return "Just do it :- " +  fortuneService.getFortune();
	}

}
