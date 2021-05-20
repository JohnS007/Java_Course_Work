package com.luv2code.springdemo.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CourseCodeConstraintValidator.class)

@Retention(RUNTIME) //Retention Policy = Runtime, means that the annotation will
					//be compiled into the bytecode and be available to JVM at Runtime

@Target({ FIELD, METHOD }) //Target means, that where can i use this custom annotation
						   // Be it field, method or anywhere else based on requirement	
public @interface CourseCode {
		
	//define a default course code
	public String value() default "LUV";
	
	//define a default message 
	public String message() default "must start with LUV";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define a default payload
	public Class<? extends Payload>[] payload() default {};
	
}
