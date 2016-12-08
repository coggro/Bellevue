import java.util.*;

public class multiplesSum {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println(); // Buffer for CLI
        System.out.println("  This program will list the multiples of" 
            + " two integers up to a goal number and\n  then print their " 
            + "sum. For example, multiples of 3 and 5 up to 10 are 3, 5, "
            + "6,\n  and 9. The sum of these is 23.");
        System.out.println(); // Buffer for readability
        System.out.print("  Enter the first integer: ");
        int firstInt = sc.nextInt();
        sc.nextLine(); // Purges input
        System.out.print("  Enter the second integer: ");
        int secondInt = sc.nextInt();
        sc.nextLine(); // Purges input
        System.out.print("  Enter the goal integer: ");
        int goalInt = sc.nextInt();
        sc.nextLine(); // Purges input
        
        int multipleSum = 0;

        for(int i = 0; i < goalInt; i++) {
            if ((i % firstInt == 0) || (i % secondInt == 0)) {
                multipleSum += i;
                System.out.println("  " + i);
            }
        }
        
        System.out.println("  The sum of all multiples is " + multipleSum 
            + ".");
        
        System.out.println(); // Buffer for CLI
    
    }

}
