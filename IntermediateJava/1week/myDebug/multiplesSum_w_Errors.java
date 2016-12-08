public class multiplesSum {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        JOptionPane.showMessageDialog("  This program will list the "
            + "multiples of two integers up to a goal number and then "
            + "print their sum. For example, multiples of 3 and 5 up to "
            + "10 are 3, 5, 6, i and 9. The sum of these is 23.");
        
        int firstInt = JOptionPane.showInputDialog(null, "Enter the first integer: ");
        int secondInt = JOptionPane.showInputDialog(null, "Enter the second integer: ");
        int goalInt = JOptionPane.showInputDialog(null, "Enter the goal integer: ");
        int multipleSum = 0;

        for(int i = 0; i < goalInt; i++) {
            if ((i % firstInt == 0) || (i % secondInt == 0)) {
                multipleSum += i;
                System.out.println("  " + i);
            }
        }
        
        JOptionPane.showMessageDialog("The sum of all multiples is " 
            + multipleSum + ".");
        
    }

}
