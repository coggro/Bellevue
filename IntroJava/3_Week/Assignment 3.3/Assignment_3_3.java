/*
 * Corey Gross
 * Order 3 integers lowest to highest.
 * February 29th, 2016
 * Bellevue University
 * Assignment_3_3.java
 * 
 * 
*/

import java.util.*;

public class Assignment_3_3 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println(); // Buffer for CLI

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int swap = 0;

        System.out.print("  Enter integer 1: ");
        num1 = sc.nextInt();
        sc.nextLine(); // Purge input

        System.out.print("  Enter integer 2: ");
        num2 = sc.nextInt();
        sc.nextLine(); // Purge input
        if (num1 > num2) { // If the new number is the lowest, we put it in
            swap = num2;   // the swap slot, shuffle num1 to num2, and put 
            num2 = num1;   // the new number in front.
            num1 = swap;
        }

        System.out.print("  Enter integer 3: ");
        num3 = sc.nextInt();
        sc.nextLine(); // Purge input
        if (num3 < num1) { // If the new number is the lowest, we put it in
            swap = num3;   // the swap slot, shuffle the other numbers
            num3 = num2;   // down the line, and put the new number in
            num2 = num1;   // front.
            num1 = swap;
        } else if (num3 < num2) {
            swap = num3;   // If the new number belongs in the middle, we do
            num3 = num2;   // the same thing, but without moving num1
            num2 = swap;   // because we tested above and know it's lower.
        }

        System.out.println("  The integers, arranged from lowest to"
            + " highest, are " + num1 + ", " + num2 + ", and " + num3
            + ".");

        System.out.println(); // Buffer for CLI
    
    }

}
