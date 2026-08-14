import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Split the string based on spaces
        String[] words = sentence.split(" ");
        
        System.out.println("\nWords in the sentence:");
        // Print each word on a new line
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        
        scanner.close();
    }
}
