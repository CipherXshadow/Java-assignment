import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Using ternary operator to check if the number is even or odd
        // Syntax: condition ? valueIfTrue : valueIfFalse
        String result = (number % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("The number " + number + " is " + result + ".");
        
        scanner.close();
    }
}
