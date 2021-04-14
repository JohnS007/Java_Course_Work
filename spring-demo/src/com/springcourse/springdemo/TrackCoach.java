package com.springcourse.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//Custom init-method for bean
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside custom init-method doMyStartupStuff()");
	}
	
	//Custom destroy-method for bean
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside custom init-method doMyCleanupStuff()");
	}

}
