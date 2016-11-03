/* 
 * Corey Gross
 * String Reversal Test
 * April 18. 2016
 * Bellevue University
 * MyStringTest.java
*/

import java.util.*;

public class MyStringTest {

    public static void main(String[] args) {
        
        System.out.println(); // Buffer for CLI
        System.out.print("  Enter a string to be reversed: ");
        Scanner sc = new Scanner(System.in);
        String testString = sc.nextLine();
        
        System.out.print("  Here is the reversed string:   ");
        for (int i = testString.length()-1; i >= 0; i--) {
        
            System.out.print(testString.charAt(i));
        
        }
        
        System.out.println(); // Buffer for CLI
        System.out.println(); // Buffer for CLI
    }

}
