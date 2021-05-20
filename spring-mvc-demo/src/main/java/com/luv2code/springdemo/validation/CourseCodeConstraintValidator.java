package com.luv2code.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
			implements ConstraintValidator<CourseCode, String> {

	//Declare the coursePrefix to be used to validate input given to annotated field
	private String coursePrefix;
	
	//Method of ConstraintValidator interface, used to initialize the value of coursePrefix
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	//Method of ConstraintValidator interface, used to perform actual business validation on
	// the given field
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = theCode == null ? true : theCode.startsWith(coursePrefix);
		
		return result;
	}

}
