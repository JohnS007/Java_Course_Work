package com.project.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class TennisCoach implements Coach {

	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	
	@Value("${email}")
	public String email;
	
	
	@Value("${team}")
	public String team;
	
	
	
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public TennisCoach() {
		System.out.println("TennisCoach: Inside the default constructor for TennisCoach");
	}
	
	
	//add custom init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach: Inside doMyStartupStuff()");
	}
	
	
	//add custom destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">>TennisCoach: Inside doMyCleanUpStuff()");
	}

}
