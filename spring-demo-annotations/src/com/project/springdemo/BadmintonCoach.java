package com.project.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand and smash today!";
	}

}
