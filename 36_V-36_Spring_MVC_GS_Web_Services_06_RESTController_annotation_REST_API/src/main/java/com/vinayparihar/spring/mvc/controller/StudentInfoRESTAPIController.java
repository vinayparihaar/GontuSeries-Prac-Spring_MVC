/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author VinayParihar
 * @date May 30, 2020 @time 3:53:39 PM
 */

@Controller
public class StudentInfoRESTAPIController {

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
