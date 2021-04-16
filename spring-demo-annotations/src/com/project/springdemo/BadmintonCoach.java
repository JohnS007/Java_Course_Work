package com.project.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public BadmintonCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand and smash today!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
