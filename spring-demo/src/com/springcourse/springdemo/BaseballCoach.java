package com.springcourse.springdemo;

public class BaseballCoach implements Coach {
	
	//use a private field for fortuneService
	private FortuneService fortuneService;
	
	
	BaseballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get daily fortune!
		return fortuneService.getFortune();
	}

}
