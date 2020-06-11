/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

/**
 * @author VinayParihar
 * @date May 26, 2020 @time 5:00:23 PM
 */
public class Address {

	private String addLineOne;
	private String addLineTwo;
	private String city;
	private String state;
	private int zipcode;
	private String country;

	public Address() {

	}

	public Address(String addLineOne, String addLineTwo, String city, String state, int zipcode, String country) {
		super();
		this.addLineOne = addLineOne;
		this.addLineTwo = addLineTwo;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}

	public String getAddLineOne() {
		return addLineOne;
	}

	public void setAddLineOne(String addLineOne) {
		this.addLineOne = addLineOne;
	}

	public String getAddLineTwo() {
		return addLineTwo;
	}

	public void setAddLineTwo(String addLineTwo) {
		this.addLineTwo = addLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
