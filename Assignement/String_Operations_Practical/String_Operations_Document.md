PAGE 47

QUESTION 47
Write a program to reverse a string without using built-in methods.

AIM
To write a program that reverses a given string manually by iterating through its characters from the end to the beginning.

PROGRAM
```java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();
        
        String reversed = "";
        
        // Loop through the string from the end to the beginning
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter a string to reverse: Programming
Original String: Programming
Reversed String: gnimmargorP
```

EXPLANATION
Instead of relying on built-in methods like `StringBuilder.reverse()`, this program reads each character of the string one by one starting from the last index (`original.length() - 1`) down to `0`. It appends each character to a new string variable, effectively building the reversed string manually.

---

PAGE 48

QUESTION 48
Implement a program to count the frequency of characters in a string.

AIM
To calculate how many times a specific character appears within a given string.

PROGRAM
```java
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
```

OUTPUT
```
Enter a string: Hello World
Enter a character to find its frequency: l
The character 'l' appears 3 time(s) in the string.
```

EXPLANATION
The program uses a `for` loop to traverse the string from the first character to the last. During each iteration, it uses the `charAt(i)` method to get the character at the current position. If that character matches the one the user is searching for, a counter variable is incremented.

---

PAGE 49

QUESTION 49
Write a program to demonstrate the immutability of the String class.

AIM
To show that once a `String` object is created, its contents cannot be changed in memory.

PROGRAM
```java
public class StringImmutability {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating String Immutability ---");
        
        // Create an initial string
        String original = "Hello";
        System.out.println("Original String: " + original);
        
        // Try to modify the string by concatenating
        original.concat(" World");
        
        // The original string remains unchanged
        System.out.println("After original.concat(\" World\"): " + original);
        System.out.println("Reason: Strings are immutable. The concat() method creates a new string but doesn't change the original one in memory.");
        
        // To keep the change, we must assign the new string to a reference
        String modified = original.concat(" World");
        System.out.println("\nAssigned to a new variable (modified): " + modified);
        
        // Or reassign to the original reference variable
        original = original.concat(" Java");
        System.out.println("Reassigned to original reference: " + original);
    }
}
```

OUTPUT
```
--- Demonstrating String Immutability ---
Original String: Hello
After original.concat(" World"): Hello
Reason: Strings are immutable. The concat() method creates a new string but doesn't change the original one in memory.

Assigned to a new variable (modified): Hello World
Reassigned to original reference: Hello Java
```

EXPLANATION
Strings in Java are "immutable," meaning their data cannot be modified after they are created. When we call `original.concat(" World")`, Java creates a brand new string "Hello World" in memory, but the `original` variable still points to the unchanged "Hello". To capture the change, the result must be explicitly assigned to a variable.

---

PAGE 50

QUESTION 50
Create a program to check if a given string is a palindrome.

AIM
To determine if a string reads the exact same forwards and backwards.

PROGRAM
```java
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
```

OUTPUT
```
Enter a string to check if it's a palindrome: Radar
"Radar" is a Palindrome.
```

EXPLANATION
A palindrome is a word that is spelled the same backwards as it is forwards (like "radar" or "madam"). The program reverses the user's input string manually and then uses the `equalsIgnoreCase()` method to compare the original string with the reversed one, ignoring any capitalization differences.

---

PAGE 51

QUESTION 51
Implement a program to split a string into words and print each word on a new line.

AIM
To use the `split()` method to break a full sentence into individual words based on spaces.

PROGRAM
```java
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
```

OUTPUT
```
Enter a sentence: Java is a popular programming language
Words in the sentence:
Java
is
a
popular
programming
language
```

EXPLANATION
The `split(" ")` method divides the string into multiple smaller strings (tokens) wherever it finds a space character. It returns an array containing these broken-down words. A simple `for` loop is then used to iterate through the array and print each individual word on its own line.
