/* 
 * Corey Gross
 * 30 November 2016
 * Assignment 1.1
 * 
 * Calculate whole dollar change in largest possible bill
 * denominations
*/

import javax.swing.*;
import java.awt.*;

public class Dollars
{

    public static void main(String[] args)
    {
            JFrame frame; 
            String dollarsInput = new String();
            int dollarsProcessed;

            dollarsInput = JOptionPane.showInputDialog(null, "Please enter an integer value. Example: 654");
            dollarsProcessed = Integer.parseInt(dollarsInput);
            System.out.println("The value entered is: " + dollarsProcessed);
             
            // Creating an output string.
            String changeOutput = new String();
            
            // Processing into bills
            int hundreds = 0;
            int fifties = 0;
            int twenties = 0;
            int tens = 0;
            int fives = 0;
            int ones = 0;

            // Each loop handles a denomination of bills.
            // I considered a more complex way of handling this using
            // a two-dimensional array, but completion of the assignment
            // was more efficient using copy/pasted loops. If denominations
            // or other functions were likely to be added later, I would
            // opt for the DRYer method.
            while (dollarsProcessed >= 100)
            {
            
                hundreds++;
                dollarsProcessed -= 100;
            
            }
    
            while (dollarsProcessed >= 50)
            {
            
                fifties++;
                dollarsProcessed -= 50;
            
            }
            
            while (dollarsProcessed >= 20)
            {
            
                twenties++;
                dollarsProcessed -= 20;
            
            }
            
            while (dollarsProcessed >= 10)
            {
            
                tens++;
                dollarsProcessed -= 10;
            
            }
    
    
            while (dollarsProcessed >= 5)
            {
            
                fives++;
                dollarsProcessed -= 5;
            
            }
    
            // The remaining bills are ones.
            ones = dollarsProcessed;
   
            changeOutput = "$" + dollarsInput + " turns into " + hundreds 
                + " Hundreds, " + fifties + " Fifties, " + twenties 
                + " Twenties, " + tens + " Tens, " + fives 
                + " Fives, and " + ones + " Ones.";
            // Logged to console for debugging, commented out to be
            //      removed from compilation. 
            // System.out.println(changeOutput);
            
            // Shows changeOutput to user in dialog
            JOptionPane.showMessageDialog(null, changeOutput);

    }

}
