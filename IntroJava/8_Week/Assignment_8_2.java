/*
 * Corey Gross
 * Bubble Sort Implementation
 * April 11, 2016 
 * Bellevue University
 * Assignment_8_2.java
*/

import java.util.*;

public class Assignment_8_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(); // Buffer for CLI        
        
        // These two lines determine how many random numbers will be in the
        // array.
        System.out.print("  Enter the integer length of the array: ");
        int length = sc.nextInt();
        // These two lines determine the maximum value in the array.
        System.out.print("  Enter the integer maximum value in the "
            + "array: ");
        int maximum = sc.nextInt();

        // We create an array of int data types of the length the user
        // input
        int[] unsorted = new int[length];
        // We iterate over each space in the array, putting a random int
        // between 1 and the maximum value the user entered.
        for (int i = 0; i <length; i++) {
            
            unsorted[i] = (int) Math.floor(Math.random() * maximum + 1);

        }

        // These lines print a space, a message for the user, and then 
        // the unsorted array.
        System.out.println(); // Buffer        
        System.out.println("  Here is the unsorted array:");
        System.out.println("  " + Arrays.toString(unsorted));
        
        // Here, we call the bubbleSort() function and store the returned,
        // sorted array in a separate array named sorted. We could use the
        // same array and just call it "array", but I felt that "sorted"
        // and "unsorted" illustrated the point more clearly and made the
        // code more readable.
        int[] sorted = bubbleSort(unsorted);

        // Then, we print the sorted array.
        System.out.println(); // Buffer for CLI        
        System.out.println("  Here is the sorted array:");
        System.out.println("  " + Arrays.toString(sorted));
        
        System.out.println(); // Buffer for CLI        
        
    }
    
    // This is the sorting function that implements bubbleSort()
    public static int[] bubbleSort(int[] array) {       
        // We create a swap value that we can temporarily store array
        // elements in so that we can rearrange them without losing them.
        int swap = 0;
        // This is the boolean that determines whether the loop has 
        // completed sorting yet.
        boolean changed;
        
        do {
            
            // We set changed to false, representing the fact that none
            // of the elements has been rearranged
            changed = false;

            // Then, we iterate over the array, checking to see if any
            // elements are greater than the next element.
            for (int i = 0; i < array.length - 1; i++) {
                
                /* If an array element is greater than the next one,
                 * we swap those values by storing the first in swap,
                 * storing the second in the first one's place, and then
                 * restoring the first one into the second place from swap.
                 * Then, we change changed to true so that the algorithm
                */ knows a change has been made.
                if (array[i] > array[i + 1]) {
                    swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                    changed = true;
                }
            
            }

        } while (changed);
        
        // Return the sorted array.
        return array;

    }

}
