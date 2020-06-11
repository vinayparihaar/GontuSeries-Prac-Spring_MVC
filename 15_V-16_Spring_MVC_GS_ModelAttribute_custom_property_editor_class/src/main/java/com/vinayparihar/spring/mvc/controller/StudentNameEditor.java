/**
 * 
 */
package com.vinayparihar.spring.mvc.controller;

import java.beans.PropertyEditorSupport;

/**
 * @author VinayParihar
 * @date May 26, 2020 @time 7:31:55 PM
 */
public class StudentNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		if (studentName.contains("Mr.") || studentName.contains("Ms.")) {
			setValue(studentName);
		} else
			setValue("Ms." + studentName);

	}

}
