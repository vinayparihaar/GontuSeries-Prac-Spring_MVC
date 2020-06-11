/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author VinayParihar
 * @date May 27, 2020 @time 6:17:18 PM
 */
public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	//if this method returns true then - application will further handel the request.
	//if this method returns false then - application will not further handel the request.
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		Calendar calendar = Calendar.getInstance();
		//getting the day on which request is made.
		int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
		//1=Sunday, 2=Monday,.....7=Saturday
		if (dayOfWeek == 1) {
			response.getWriter().write("This website is closed on Sunday's;Please try accessing it "
					+ "on any other weekday." + "Sorry for the inconvenience.");
			return false;
		}

		return true;

	}

}
