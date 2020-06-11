/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author VinayParihar
 * @date May 28, 2020 @time 11:28:52 PM
 */
@ControllerAdvice
public class GlobalExceptionHandlerMethods {

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception nullPointerException) {
		//logging Null Pointer Exception.
		System.out.println("Null Pointer Exception occured. " + nullPointerException);
		return "NullPointerException";
	}

	@ExceptionHandler(value = IOException.class)
	public String iOException(Exception iOException) {
		//logging IO Exception.
		System.out.println("IO Exception occured. " + iOException);
		return "IOException";
	}

	@ExceptionHandler(value = Exception.class)
	public String exception(Exception exception) {
		//logging Default Exception.
		System.out.println("Exception occured. " + exception);
		return "Exception";
	}

}
