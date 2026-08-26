import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String original = scanner.nextLine();
        
        String reversed = "";
        
        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        // Check if the original string (ignoring case) matches the reversed string
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("\"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a Palindrome.");
        }
        
        scanner.close();
    }
}
