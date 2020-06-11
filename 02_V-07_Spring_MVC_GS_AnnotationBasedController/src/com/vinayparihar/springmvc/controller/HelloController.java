/**
 * 
 */
package com.vinayparihar.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VinayParihar
 * @date May 25, 2020 @time 2:11:06 PM
 */
@Controller
public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndView HelloWorld() {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("message", "Hello World!!! Welcome to Annotation based controller webapplication");
		return modelAndView;
	}

}
