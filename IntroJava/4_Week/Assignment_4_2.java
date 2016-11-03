/*
 * Corey Gross
 * Pattern Printing
 * March 14th, 2016
 * Bellevue University
 * Assignment_4_2.java
*/

public class Assignment_4_2 {

    public static void main (String[] args) {
    
        System.out.println(); // Buffer for CLI
  
        int max;
        int current;

        // Pattern 1 (1 - 1 2 3 4 5 6)
        System.out.println("  Pattern #1:\n");
        
        for (max = 1; max <= 6; max ++) {
        
            System.out.print("  "); // Buffer for CLI
            
            for (current = 1; current <= max; current++) {
            
                System.out.print(current + " ");
            
            }
        
            System.out.print("\n\n"); // Carriage return

        }
       
        System.out.println(); // Space between Patterns

        // Pattern 2 (1 2 3 4 5 6 - 1)
        System.out.println("  Pattern #2:\n");
        
        for (max = 6; max >= 1; max--) {
            
            System.out.print("  "); // Buffer for CLI
            
            for (int spaces = 0; spaces <= 5 - max; spaces++) {
            
                System.out.print("  "); // Spaces for alignment
            
            }

            for (current = 1; current <= max; current++) {
            
                System.out.print(current + " ");
            
            }

            System.out.print("\n\n"); // Carriage return

        }

        System.out.println(); // Buffer for CLI

    }

}
