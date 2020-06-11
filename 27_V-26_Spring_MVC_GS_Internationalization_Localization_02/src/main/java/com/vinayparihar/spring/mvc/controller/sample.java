/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.util.Calendar;

/**
 * @author VinayParihar
 * @date May 28, 2020 @time 8:18:53 PM
 */
public class sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long i =999999999;
		long result =0;
		long start = Calendar.getInstance().getTimeInMillis();
		result=i*(i+1)/2;
		/*
		 * for (long j = 0; j <=i; j++) { result = result+j; }
		 * System.out.println(result);
		 */
		long end =Calendar.getInstance().getTimeInMillis();;
		System.out.println("===========================================");
		System.out.println(end-start);
	}

}
