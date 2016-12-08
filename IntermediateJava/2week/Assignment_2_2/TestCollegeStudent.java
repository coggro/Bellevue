/* 
 * Corey Gross
 * 5 December 2016
 * Assignment 2.2
 * 
 * TestCollegeStudent class assignment
 * 
 * This script actually utilizes the CollegeStudent class
 * 
*/ 

import java.util.*;
import javax.swing.*;

public class TestCollegeStudent
{

	public static void main(String[] args)
	{
	
		// Obtain College Student 1 (cs1) information
		String cs1_firstName = JOptionPane.showInputDialog(null, 
			"Student 1: Please enter your first name.");
		String cs1_lastName = JOptionPane.showInputDialog(null, 
			"Student 1: Please enter your last name.");
		int cs1_enrollMonth = Integer.parseInt(JOptionPane.showInputDialog(null, 
			"Student 1: Please enter the number of the month you enrolled. "
			+ "(ex, enter 4 for April)"))-1; // Months are base 0, subtract 1 for accuracy
		int cs1_enrollDay = Integer.parseInt(JOptionPane.showInputDialog(null, 
			"Student 1: Please enter the number of the day you enrolled." 
			+ "(ex, enter 23 for the 23rd)"));
		int cs1_enrollYear = Integer.parseInt(JOptionPane.showInputDialog(null, 
			"Student 1: Please enter the year  you enrolled."));
		
		// Create GregorianCalendar object of enrollment date
		GregorianCalendar cs1_enrollDate = new GregorianCalendar(cs1_enrollYear, 
			cs1_enrollMonth, cs1_enrollDay);
		
		// Get College Student 2 (cs2) information
		String cs2_firstName = JOptionPane.showInputDialog(null, 
			"Student 2: Please enter your first name.");
		String cs2_lastName = JOptionPane.showInputDialog(null, 
			"Student 2: Please enter your last name.");
		int cs2_enrollMonth = Integer.parseInt(JOptionPane.showInputDialog(null, 
			"Student 2: Please enter the number of the month you enrolled. "
			+ "(ex, enter 4 for April)"))-1; // Months are base 0, subtract 1 for accuracy
		int cs2_enrollDay = Integer.parseInt(JOptionPane.showInputDialog(null, 
			"Student 2: Please enter the number of the day you enrolled. "
			+ "(ex, enter 23 for the 23rd)"));
		int cs2_enrollYear = Integer.parseInt(JOptionPane.showInputDialog(null, 
			"Student 2: Please enter the year  you enrolled."));
		
		// Create GregorianCalendar object of enrollment date
		GregorianCalendar cs2_enrollDate = new GregorianCalendar(cs2_enrollYear, 
			cs2_enrollMonth, cs2_enrollDay);

		// Create CollegeStudent objects
		CollegeStudent cs1 = new CollegeStudent(cs1_firstName, cs1_lastName, cs1_enrollDate);
		CollegeStudent cs2 = new CollegeStudent(cs2_firstName, cs2_lastName, cs2_enrollDate);

		// Display College Student info.
		JOptionPane.showMessageDialog(null, "Student First Name: " 
			+ cs1.getFirstName() + "\nStudent Last Name: " 
			+ cs1.getLastName() + "\nStudent Enrollment Date: " 
			+ cs1.getEnrollmentDateString() + "\nStudent Graduation Date: "
			+ cs1.getGraduationDateString());
		JOptionPane.showMessageDialog(null, "Student First Name: " 
			+ cs2.getFirstName() + "\nStudent Last Name: " 
			+ cs2.getLastName() + "\nStudent Enrollment Date: " 
			+ cs2.getEnrollmentDateString() + "\nStudent Graduation Date: "
			+ cs2.getGraduationDateString());
	}

}
