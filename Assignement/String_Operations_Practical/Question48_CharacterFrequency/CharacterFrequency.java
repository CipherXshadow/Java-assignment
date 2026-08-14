import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        System.out.print("Enter a character to find its frequency: ");
        char searchChar = scanner.next().charAt(0);
        
        int count = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            // Check if the current character matches the search character
            if (text.charAt(i) == searchChar) {
                count++;
            }
        }
        
        System.out.println("The character '" + searchChar + "' appears " + count + " time(s) in the string.");
        
        scanner.close();
    }
}
