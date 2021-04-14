package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		
		//Set up the new context for baecn
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same memory location: " + result);
		
		System.out.println("Memory Location for theCoach: "+ theCoach);
		
		System.out.println("Memory Location for alphaCoach: " + alphaCoach);
		
		context.close();
	}
}	
