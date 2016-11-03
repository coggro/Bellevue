/*
 * Corey Gross
 * Array of Random Numbers
 * April 4th, 2016
 * Bellevue University
 * Assignment_7_2.java
*/

import java.util.*;

public class Assignment_7_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(); //Buffer for CLI
        
        // Queries the user for the length of the array
        System.out.print("  Enter the integer number of random numbers "
            + "you'd like: ");
        int intArrayLength = sc.nextInt();
        // Creates an empty array named intArray with the chosen length
        // stored in intArrayLength.
        int [] intArray = new int [intArrayLength];
    
        /* Iterates over the array and adds a random number between
         * 1 and 6 to each spot in the array. "We use intArrayLength - 1"
         * because the array uses 0-based indexing, so the first element
         * is at position 0 rather than 1, so the last element will be
        */ at the number of elements in the list minus one.
        for (int i = 0; i <= (intArrayLength - 1); i++) {
    
            intArray[i] = (int)Math.floor((Math.random() * 6) + 1);
    
        }

        /* Prints out a string representation of the array using the
         * toString method of the Arrays class, which converts the
        */
        System.out.println("  " + Arrays.toString(intArray));

        System.out.println(); //Buffer for CLI
    
    }

}
