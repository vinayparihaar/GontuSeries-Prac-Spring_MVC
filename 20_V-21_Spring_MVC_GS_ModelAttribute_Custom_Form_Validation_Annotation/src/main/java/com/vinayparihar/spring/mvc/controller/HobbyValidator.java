/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author VinayParihar
 * @date May 27, 2020 @time 3:53:40 PM
 */
public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	
	@Override
	public void initialize(IsValidHobby constraintAnnotation) {
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext context) {
		if(studentHobby==null) {
		return false;
		}
		 if(studentHobby.matches("Music|Football|Cricket|Hockey")) {
			 return true;
		 }
			 else
			 {
				 return false;
			 }
		 }
	}


