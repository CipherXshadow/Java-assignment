import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();
        
        // if-else statement
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
        
        // switch statement
        System.out.print("Enter a number (1-3) to select a prize: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Prize: A Notebook");
                break;
            case 2:
                System.out.println("Prize: A Pen");
                break;
            case 3:
                System.out.println("Prize: A Keychain");
                break;
            default:
                System.out.println("Invalid choice, no prize!");
        }
        
        // for loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        
        scanner.close();
    }
}
