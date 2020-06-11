/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.util.Map;

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
	public ModelAndView helloWorld1(@PathVariable Map<String, String> pathVar) {

		String username = pathVar.get("username");
		String country = pathVar.get("country");

		ModelAndView modelAndView = new ModelAndView("HelloWorldPage");
		modelAndView.addObject("messageHelloWorld", "Hello World!!" + " I am " + username + " from " + country);
		return modelAndView;
	}

}
