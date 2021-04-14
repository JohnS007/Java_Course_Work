package com.springcourse.springdemo;

public class CricketCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	//add new fields team and email
	
	private String team;
	private String emailAddress;
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("CricketCoach: Inside setter method for team");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("CricketCoach: Inside setter method for emailAddress");
	}

	public CricketCoach() {
		super();
		System.out.println("CricketCoach: In no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: Using setter method: setFortuneService() to inject dependencies");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice leg spin for 2 hrs today!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
