/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

/**
 * @author VinayParihar
 * @date May 27, 2020 @time 3:43:50 PM
 */
public @interface IsValidHobby {
	
	String listOfValidHobbies() default "Music|Football|Cricket|Hockey";

	String message() default "Please provide a valid Hobby;"
			+ "accepted hobbies are - Music, Cricket, FootBall and Hockey (choose anyone).";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
