import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer (e.g., 5): ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer (e.g., 3): ");
        int b = scanner.nextInt();
        
        System.out.println("\n--- Bitwise Operations ---");
        System.out.println("a & b (AND) = " + (a & b));
        System.out.println("a | b (OR)  = " + (a | b));
        System.out.println("a ^ b (XOR) = " + (a ^ b));
        System.out.println("~a (NOT a)  = " + (~a));
        
        System.out.println("\n--- Shift Operations ---");
        System.out.println("a << 1 (Left Shift by 1) = " + (a << 1));
        System.out.println("a >> 1 (Right Shift by 1) = " + (a >> 1));
        
        scanner.close();
    }
}
