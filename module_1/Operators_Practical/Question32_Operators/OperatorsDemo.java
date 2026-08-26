import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        
        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > 0) && (b > 0) : " + ((a > 0) && (b > 0)));
        System.out.println("(a > 0) || (b > 0) : " + ((a > 0) || (b > 0)));
        System.out.println("!(a == b)          : " + !(a == b));
        
        scanner.close();
    }
}
