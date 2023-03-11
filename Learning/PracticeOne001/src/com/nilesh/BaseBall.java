package com.nilesh;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BaseBall implements Coach {
	
	@Autowired
	@Qualifier("fortuneServiceImpl")
	private FortuneService fortuneService;
	

	@Override
	public String getCoach() {
		return "Do Batting Practice";
	}
	
	@PostConstruct
	public static void startProgram()
	{
		System.out.println("The Game Started");
	}
	
	@PreDestroy
	public static void endProgram()
	{
		System.out.println("Game Ended");
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
