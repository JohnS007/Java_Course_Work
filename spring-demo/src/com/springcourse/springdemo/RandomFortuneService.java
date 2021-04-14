package com.springcourse.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	String[] fortunes = new String[3];
	
	@Override
	public String getFortune() {
		
		fortunes[0] = "Today is your Lucky Day!";
		fortunes[1] = "You have to practice hard!";
		fortunes[2] = "Take rest after warm-up today!";
		
		
		Random rand = new Random();
		int index = rand.nextInt(3);
		
		
		
		return fortunes[index];
	}

}
