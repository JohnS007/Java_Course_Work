package com.project.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
//	@Autowired
//	public BadmintonCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	public BadmintonCoach() {
		System.out.println(">> Inside No-arg constructor for badminton coach");
	}
	
//	@Autowired
//	public void customMethodForDependencyInjection(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//		System.out.println(">> Inside customMethodForDependencyInjection() for badminton coach");
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand and smash today!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
