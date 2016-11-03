/* Corey Gross
 * Converting Fahrenheit to Celsius
 * 2-22-2016
 * Bellevue University
 * Assignment_2_2.java
 * 
*/

import java.util.Scanner;

public class Assignment_2_2 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(); // Buffer between CLI output
        System.out.print("  Enter the temperature in degrees Fahrenheit: ");
        double degreesFahrenheit = sc.nextDouble();
        sc.nextLine(); // Purge other input
        System.out.println("  " + degreesFahrenheit 
            + " degrees Fahrenheit is equivalent to " + ((5.0 / 9.0) 
            * (degreesFahrenheit - 32)) + " degrees Celsius");
        System.out.println(); // Buffer between CLI output
        
    }

}
