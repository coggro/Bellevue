/*
 * Corey Gross
 * Even Number Test
 * February 29th, 2016
 * Bellevue University
 * Assignment_3_2.java
 * 
 * I was going to make it a conditional, but then realized I could just add
 * a Boolean to the string and it would work just fine with less code.
*/

import java.util.*;

public class Assignment_3_2 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println(); // Buffer for CLI
        
        System.out.print("  Enter an integer: ");
        int checkInt = sc.nextInt();
        sc.nextLine(); // Purge input

        boolean checkBool = (checkInt % 2 == 0);

        System.out.println("  Is " + checkInt + " even? " + checkBool);

        System.out.println(); // Buffer for CLI
    
    }

}
