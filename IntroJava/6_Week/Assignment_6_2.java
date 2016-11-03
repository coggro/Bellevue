/*
 * Corey Gross
 * Overloaded Differences
 * March 28th, 2016
 * Bellevue University
 * Assignment_6_2.java
*/

public class Assignment_6_2 {

    public static void main(String[] args) {
    
        System.out.println(); // Buffer for CLI

        System.out.println("  " + diff(6, 1)); // Should return 5
        System.out.println("  " + diff(6.3, 1.5)); // Should return 4.8
        System.out.println("  " + diff(6, 1.5)); // Should return 4.5
        System.out.println("  " + diff(6.3, 1)); // Should return 5.3
    
        System.out.println(); // Buffer for CLI
    
    }

    public static int diff(int a, int b) {
    
        return (int)(Math.max(a, b) - Math.min(a, b));
    
    }

    public static double diff(double a, double b) {
    
        return Math.max(a, b) - Math.min(a, b);
    
    }
    
    public static double diff(int a, double b) {
    
        return Math.max(a, b) - Math.min(a, b);
    
    }
    
    public static double diff(double a, int b) {
    
        return Math.max(a, b) - Math.min(a, b);
    
    }




}
