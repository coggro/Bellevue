/*
 * Corey Gross
 * 4 December 2016
 * Assignment 2.2
 * 
 * CollegeStudent class assignment
 *
 * Creates the CollegeStudent class to be utilized elsewhere
 * 
*/

import java.util.*;
import java.text.*;

public class CollegeStudent
{
	private String firstName;
	private String lastName;
	private GregorianCalendar enrollmentDate;
	private GregorianCalendar graduationDate;

    // Constructor
	public CollegeStudent(String firstName, String lastName, GregorianCalendar enrollmentDate)
	{

		this.firstName = firstName;
		this.lastName = lastName;
        // This actually will point to the provided enrollmentDate object
		this.enrollmentDate = enrollmentDate;
        // Clones the enrollmentDate object so I'm not overwriting it
        // to change the graduation date.
		this.graduationDate = (GregorianCalendar) enrollmentDate.clone();
        // Add four years to the calendar object.
        this.graduationDate.add(this.graduationDate.YEAR, 4);
	}	
	
    // Getters and Setters from here down...
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	public GregorianCalendar getEnrollmentDate() {
		return this.enrollmentDate;
	}
	
    // Formats a String object from the date.
	public String getEnrollmentDateString() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.format(this.enrollmentDate.getTime());

	}

	public void setEnrollmentDate(GregorianCalendar date) {
		this.enrollmentDate = date;
	}

	public GregorianCalendar getGraduationDate() {
		return this.graduationDate;
	}
	
    // Formats a String object from the date.
	public String getGraduationDateString() {
	
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.format(this.graduationDate.getTime());
	
	}

	public void setGraduationDate(GregorianCalendar date) {
		this.graduationDate = date;
	}

}
