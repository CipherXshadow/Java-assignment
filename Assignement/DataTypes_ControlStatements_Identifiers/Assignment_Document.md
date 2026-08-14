# PAGE 1

## Question 1
Write a program to declare variables of all primitive data types in Java and print their default values.

**AIM**
To declare instance variables of all primitive data types in Java and print their default values to understand memory initialization.

**PROGRAM**
```java
public class PrimitiveDataTypes {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        PrimitiveDataTypes obj = new PrimitiveDataTypes();
        System.out.println("Default values of primitive data types in Java:");
        System.out.println("byte: " + obj.b);
        System.out.println("short: " + obj.s);
        System.out.println("int: " + obj.i);
        System.out.println("long: " + obj.l);
        System.out.println("float: " + obj.f);
        System.out.println("double: " + obj.d);
        System.out.println("char: [" + obj.c + "] (appears blank)");
        System.out.println("boolean: " + obj.bool);
    }
}
```

**OUTPUT**
```text
Default values of primitive data types in Java:
byte: 0
short: 0
int: 0
long: 0
float: 0.0
double: 0.0
char: [ ] (appears blank)
boolean: false
```

**EXPLANATION**
In Java, primitive data types are the most basic data types. When they are declared as instance variables (fields inside a class, but outside any method), Java automatically assigns them default values if they are not explicitly initialized. Local variables (inside a method) do not receive default values and must be initialized before use. 

---

# PAGE 2

## Question 2
Implement a program to demonstrate the use of if-else, switch, and for loops.

**AIM**
To demonstrate decision-making and iteration using `if-else`, `switch`, and `for` control statements in a single Java program.

**PROGRAM**
```java
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
```

**OUTPUT**
```text
Enter your marks (0-100): 85
Result: Pass
Enter a number (1-3) to select a prize: 2
Prize: A Pen
Counting from 1 to 5:
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
```

**EXPLANATION**
Control statements change the flow of execution in a program. The `if-else` statement is used for checking conditions, the `switch` statement is a cleaner alternative to multiple if-else blocks for checking specific values, and the `for` loop is used to execute a block of code repeatedly for a known number of times.

---

# PAGE 3

## Question 3
Write a program to check if a number is prime using a while loop.

**AIM**
To determine whether a user-entered number is a prime number or not using a `while` loop for iteration.

**PROGRAM**
```java
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        int divisor = 2;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            // while loop
            while (divisor <= number / 2) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
}
```

**OUTPUT**
```text
Enter a number to check if it is prime: 17
17 is a prime number.
```

**EXPLANATION**
A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. A `while` loop iterates as long as the condition remains true. Here, the loop repeatedly checks if the number is divisible by any integer starting from 2 up to half of the number. If a divisor is found, it's not a prime number.

---

# PAGE 4

## Question 4
Create a program to calculate the factorial of a number using recursion.

**AIM**
To calculate the factorial of a given number by creating a recursive method that calls itself.

**PROGRAM**
```java
import java.util.Scanner;

public class FactorialRecursion {
    
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(num);
            System.out.println("The factorial of " + num + " is " + result);
        }
        
        scanner.close();
    }
}
```

**OUTPUT**
```text
Enter a number to find its factorial: 5
The factorial of 5 is 120
```

**EXPLANATION**
Recursion is a programming technique where a method calls itself to solve a smaller instance of the same problem. Every recursive method must have a base case (a stopping condition, like `n == 0` or `n == 1` returning 1) and a recursive case that brings the problem closer to the base case (like `n * factorial(n - 1)`).

---

# PAGE 5

## Question 5
Write a program to identify valid and invalid identifiers in Java.

**AIM**
To check whether various strings represent valid Java identifiers or invalid ones based on Java naming rules and reserved keywords.

**PROGRAM**
```java
public class IdentifierCheck {
    
    public static boolean isValidIdentifier(String identifier) {
        if (identifier == null || identifier.isEmpty()) {
            return false;
        }
        
        // Check if the first character is valid
        if (!Character.isJavaIdentifierStart(identifier.charAt(0))) {
            return false;
        }
        
        // Check remaining characters
        for (int i = 1; i < identifier.length(); i++) {
            if (!Character.isJavaIdentifierPart(identifier.charAt(i))) {
                return false;
            }
        }
        
        // Array of common Java keywords
        String[] keywords = {"class", "int", "void", "public", "static", "if", "else", "while", "for"};
        for (String keyword : keywords) {
            if (identifier.equals(keyword)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String[] identifiers = {
            "studentName", "marks", "_count", "$salary", "totalMarks", // Valid
            "2student", "student-name", "class", "total marks", "int"   // Invalid
        };
        
        System.out.println("Checking Java Identifiers:\n");
        for (String id : identifiers) {
            if (isValidIdentifier(id)) {
                System.out.println(id + " -> Valid");
            } else {
                System.out.println(id + " -> Invalid");
            }
        }
    }
}
```

**OUTPUT**
```text
Checking Java Identifiers:

studentName -> Valid
marks -> Valid
_count -> Valid
$salary -> Valid
totalMarks -> Valid
2student -> Invalid
student-name -> Invalid
class -> Invalid
total marks -> Invalid
int -> Invalid
```

**EXPLANATION**
An identifier is a name given to a variable, method, or class in Java. It must start with a letter, an underscore `_`, or a dollar sign `$`. Subsequent characters can also include digits. 
- `2student` is invalid because it starts with a number.
- `student-name` is invalid because it contains a hyphen `-` (special characters are not allowed).
- `total marks` is invalid because it contains a space.
- `class` and `int` are invalid because they are reserved Java keywords.
The `Character` class methods `isJavaIdentifierStart` and `isJavaIdentifierPart` help systematically check these rules.
