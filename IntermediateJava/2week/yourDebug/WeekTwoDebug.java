/*
 * Andrew Carts, 12/1/2016
 * Assignment 2.3 - Week 2 Debug Problem
 * Purpose: Given a 9-digit or less whole number, this program will find the largest prime factor
 *
 * Note/Hint: This is an interpretation of Project Euler Problem #3 but instead of using and input
 *            number that is of type long, I've limited the input number to be of type int.
 */

import javax.swing.*;

public class WeekTwoDebug {
    public static void main(String[] args) {
        WeekTwoDebug week = new WeekTwoDebug();
        int number = 0;
        int primeFactor = 0;
        String output = "";
        
        // Get the two inputs
        number = (int) Long.parseLong(JOptionPane.showInputDialog(null, "Please enter a whole number that is 9 digits or less."));
       
        // Find the largest prime factor
        primeFactor = week.maxPrimeFactor(number);
        
        // Display the user provided number and the largest prime factor
        output = "Number given:  " + number + "\nLargest Prime Factor:  " + primeFactor;
        JOptionPane.showMessageDialog(null, output);
    }
    
    //Method to find the largest prime factor of a given number
    public static int maxPrimeFactor(int n) {
        int factor = -1;
        for (int i = 2; i * i <= n; i++) {
            if (n == 1) { break; }
            if (n % i != 0) { continue; }
            factor = i;
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1 ? factor : n;
    }
}
