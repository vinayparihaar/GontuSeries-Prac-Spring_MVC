/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VinayParihar
 * @date May 25, 2020 @time 2:11:06 PM
 */

@Controller

public class HelloController {

	@RequestMapping("/helloworld/{username}/{country}")
	public ModelAndView helloWorld(@PathVariable("username") String username,@PathVariable("country") String country) {

		ModelAndView modelAndView = new ModelAndView("HelloWorldPage");
		modelAndView.addObject("messageHelloWorld", "Hello World!!!"+" I am "+username+ " from "+country);
		return modelAndView;
	}

}
