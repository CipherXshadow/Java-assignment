import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int first = 0, second = 1;
            System.out.println("First " + n + " terms of Fibonacci series:");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int nextTerm = first + second;
                first = second;
                second = nextTerm;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
