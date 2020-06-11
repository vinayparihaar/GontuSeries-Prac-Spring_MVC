/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VinayParihar
 * @date May 25, 2020 @time 11:21:07 PM
 */

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionform.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String studentName,
			@RequestParam("studentHobby") String studentHobby) {
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("message", "Details Submitted, Name : " + studentName + "  Hobby : " + studentHobby);
		return modelAndView;
	}

	/*
	 * @RequestMapping(value = "/submitAdmissionForm.html", method =
	 * RequestMethod.POST) public ModelAndView submitAdmissionForm(
	 * 
	 * @RequestParam(value = "studentName", defaultValue = "Default Name") String
	 * studentName,
	 * 
	 * @RequestParam(value = "studentHobby", defaultValue = "Default Hobby") String
	 * studentHobby) { ModelAndView modelAndView = new
	 * ModelAndView("AdmissionSuccess"); modelAndView.addObject("message",
	 * "Details Submitted, Name : " + studentName + "  Hobby : " + studentHobby);
	 * return modelAndView; }
	 */

	/*
	 * @RequestMapping(value = "/submitAdmissionForm.html", method =
	 * RequestMethod.POST) public ModelAndView submitAdmissionForm(@RequestParam
	 * Map<String, String> requestParam) {
	 * 
	 * String studentName = requestParam.get("studentName"); String studentHobby =
	 * requestParam.get("studentHobby"); ModelAndView modelAndView = new
	 * ModelAndView("AdmissionSuccess"); modelAndView.addObject("message",
	 * "Details Submitted, Name : " + studentName+"," + "  Hobby : " +
	 * studentHobby); return modelAndView; }
	 */

}
