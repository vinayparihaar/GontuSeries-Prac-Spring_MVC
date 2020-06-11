/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VinayParihar
 * @date May 25, 2020 @time 2:11:06 PM
 */

@Controller
public class HelloController {
	
	@RequestMapping("/helloworld")
	public ModelAndView helloWorld() {
		
		ModelAndView modelAndView = new ModelAndView("HelloWorld");
		modelAndView.addObject("messageHelloWorld",
				"Hello World!!! Welcome to Annotation based controller webapplication");
		return modelAndView;
	}

	@RequestMapping("/hellouniverse")
	public ModelAndView helloUniverse() {
		
		ModelAndView modelAndView = new ModelAndView("HelloUniverse");
		modelAndView.addObject("messageHelloUniverse",
				"Hello Universe!!! Welcome to Annotation based controller webapplication");
		return modelAndView;
	}

}
