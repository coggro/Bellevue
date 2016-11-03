/*
 * Corey Gross
 * Odd Number Sum/Avg
 * March 14th, 2016
 * Bellevue University
 * Assignment_4_3.java
*/

public class Assignment_4_3 {

    public static void main (String[] args) {
    
        System.out.println(); // Buffer for CLI
        
        int numOfOdds = 0;
        int sumOfOdds = 0;

        for (int i = 1; i <= 15; i += 2) {
            
            sumOfOdds += i;
            numOfOdds++;

        }

        System.out.println("  The sum of the numbers is " + sumOfOdds + ".");
        System.out.println("  The average of the numbers is " + (sumOfOdds/numOfOdds) + ".");

        System.out.println(); // Buffer for CLI
    
    }

}
