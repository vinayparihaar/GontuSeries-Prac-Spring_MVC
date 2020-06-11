/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

/**
 * @author VinayParihar
 * @date May 26, 2020 @time 11:52:11 AM
 */
public class Student {

	private String studentName;
	/*
	 * @Size(min = 2,max = 30, message =
	 * "*Student Hobby must be between 2 to 30 characters.")
	 */
	/*
	 * @Size(min = 2,max = 30, message =
	 * "*Student Hobby must be between {min} to {max} characters.")
	 */
	@Size(min = 2, max = 30)
	private String studentHobby;
	private Long studentMobile;
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
