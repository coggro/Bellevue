public class Assignment_5_2 {

    public static void main(String[] args) {
    
        System.out.println(); // Buffer for CLI
        System.out.println("  Number    Sqrt"); // Table setup

        for (int i = 0; i <= 8; i += 2) {
        
            System.out.printf("%2s%1d%9s%5.4f\n", "  ", i, "         ", Math.sqrt(i));
        
        }
    
        for (int i = 10; i <= 20; i += 2) {

            System.out.printf("%2s%2d%8s%5.4f\n", "  ", i, "        ", Math.sqrt(i));
        
        }

        System.out.println(); // Buffer for CLI

    }

}
