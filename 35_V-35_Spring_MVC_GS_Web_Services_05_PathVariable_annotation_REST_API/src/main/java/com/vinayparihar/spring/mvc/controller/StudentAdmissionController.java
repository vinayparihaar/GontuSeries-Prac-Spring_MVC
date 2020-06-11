/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VinayParihar
 * @date May 25, 2020 @time 11:21:07 PM
 */

@Controller
public class StudentAdmissionController {

	@ModelAttribute
	public void addCommonObjects(Model model) {
		model.addAttribute("headerMessage", "Parihar Institute of Science & Technology");
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		/* webDataBinder.setDisallowedFields("studentMobile"); */
		/* webDataBinder.setDisallowedFields(new String[] { "studentMobile" }); */

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		webDataBinder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, false));

		webDataBinder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());

	}

	@RequestMapping(value = "/admissionform.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {

		String exceptionOccured = "ARITHMETIC_EXCEPTION";
		if (exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {

			throw new NullPointerException("Null Pointer Exception");

		} else if (exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")) {

			throw new IOException("IO Exception");

		} else if (exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")) {

			throw new ArithmeticException("Arithmetic Exception");

		}

		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("AdmissionForm");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		return modelAndView;
	}

	/*
	 * @RequestMapping(value = "/submitAdmissionForm.html", method =
	 * RequestMethod.POST) public ModelAndView
	 * submitAdmissionForm(@RequestParam("studentName") String studentName,
	 * 
	 * @RequestParam("studentHobby") String studentHobby) {
	 * 
	 * Student student = new Student(); student.setStudentName(studentName);
	 * student.setStudentHobby(studentHobby);
	 * 
	 * ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
	 * modelAndView.addObject("headerMessage",
	 * "Parihar Institute of Science & Technology");
	 * modelAndView.addObject("student", student); return modelAndView; }
	 */

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

	@ResponseBody
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ArrayList<Student> getStudentsList() {

		Student student1 = new Student();
		student1.setStudentName("Aadhya Parihar");

		Student student2 = new Student();
		student2.setStudentName("Vicky Parihar");

		Student student3 = new Student();
		student3.setStudentName("Laxmi Parihar");

		Student student4 = new Student();
		student4.setStudentName("Susheela Parihar");

		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(student1);
		listOfStudents.add(student2);
		listOfStudents.add(student3);
		listOfStudents.add(student4);

		return listOfStudents;

	}

	@ResponseBody
	@RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("name") String studentName) {
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("Music");
		return student;

	}

}
