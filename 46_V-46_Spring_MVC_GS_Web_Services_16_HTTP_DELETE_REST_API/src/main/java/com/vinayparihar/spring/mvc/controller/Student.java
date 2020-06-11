/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author VinayParihar
 * @date May 26, 2020 @time 11:52:11 AM
 */

//REST Annotation
//To Customize the order of fields getting displayed.
@JsonPropertyOrder({ "studentName", "dob", "studentMobile", "studentSkills", "studentHobby", "studentAddress" })
//REST Annotation
//To mark a property or list of properties to be ignored.
@JsonIgnoreProperties({ "dob", "studentAddress" })
//REST Annotation
//To exclude properties having null/empty or default values.
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {
	// REST Annotation
	// To Customize the variable or property name which is getting displayed
	@JsonProperty("Student_Name")
	@Pattern(regexp = "[^0-9]*")
	private String studentName;

	/*
	 * @Size(min = 2,max = 30, message =
	 * "*Student Hobby must be between 2 to 30 characters.")
	 * 
	 */

	/*
	 * @Size(min = 2,max = 30, message =
	 * "*Student Hobby must be between {min} to {max} characters.")
	 * 
	 */
	@Size(min = 2, max = 30)
	/* @IsValidHobby */
	@IsValidHobby(listOfValidHobbies = "Music|Football|Cricket|Hockey")
	private String studentHobby;

	/*
	 * @Max – validates that the annotated property has a value no larger than
	 * thevalue attribute
	 * 
	 */
	@Max(1010)
	private Long studentMobile;

	/*
	 * @PastOrPresent – validate that a date value is in the past including the
	 * present; can be applied to date types including those added in Java 8
	 */

	/* @PastOrPresent */

	/*
	 * @Past - validate that a date value is in the past can be applied to date
	 * types including those added in Java 8
	 */
	@Past
	private Date dob;
	private ArrayList<String> studentSkills;
	private Address studentAddress;

	public Student() {

	}

	public Student(String studentName, String studentHobby, Long studentMobile, Date dob,
			ArrayList<String> studentSkills, Address studentAddress) {
		super();
		this.studentName = studentName;
		this.studentHobby = studentHobby;
		this.studentMobile = studentMobile;
		this.dob = dob;
		this.studentSkills = studentSkills;
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

}
