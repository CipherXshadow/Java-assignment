PAGE 32

QUESTION 32
Write a program to demonstrate the use of arithmetic, relational, and logical operators.

AIM
To write a Java program demonstrating the use of arithmetic, relational, and logical operators on user-provided input.

PROGRAM
```java
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
```

OUTPUT
```
Enter first integer: 10
Enter second integer: 3

--- Arithmetic Operators ---
a + b = 13
a - b = 7
a * b = 30
a / b = 3
a % b = 1

--- Relational Operators ---
a == b : false
a != b : true
a > b  : true
a < b  : false
a >= b : true
a <= b : false

--- Logical Operators ---
(a > 0) && (b > 0) : true
(a > 0) || (b > 0) : true
!(a == b)          : true
```

EXPLANATION
Arithmetic operators perform basic mathematical calculations like addition and multiplication. Relational operators compare two values and return a boolean result (true or false). Logical operators combine multiple boolean expressions, checking if both are true (AND `&&`), if at least one is true (OR `||`), or reversing the result (NOT `!`).

---

PAGE 33

QUESTION 33
Create a program to show the difference between == and equals() for string comparison.

AIM
To differentiate between reference comparison (`==`) and content comparison (`equals()`) using String objects.

PROGRAM
```java
public class StringComparison {
    public static void main(String[] args) {
        // Creating two different String objects with the same content
        String str1 = new String("Java");
        String str2 = new String("Java");
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        
        System.out.println("\n--- Using == Operator ---");
        // == compares object references (memory locations)
        boolean isSameReference = (str1 == str2);
        System.out.println("str1 == str2 results in: " + isSameReference);
        
        System.out.println("\n--- Using equals() Method ---");
        // equals() compares the actual text content of the strings
        boolean isSameContent = str1.equals(str2);
        System.out.println("str1.equals(str2) results in: " + isSameContent);
    }
}
```

OUTPUT
```
String 1: Java
String 2: Java

--- Using == Operator ---
str1 == str2 results in: false

--- Using equals() Method ---
str1.equals(str2) results in: true
```

EXPLANATION
The `==` operator compares object references, meaning it checks if both variables point to the exact same memory location. Since `str1` and `str2` are created with `new String()`, they are stored at different locations, making `==` false. The `equals()` method checks the actual characters inside the strings, which are the same ("Java"), so it returns true.

---

PAGE 34

QUESTION 34
Write a program to illustrate the use of the ternary operator.

AIM
To use the ternary conditional operator as a shorthand for an if-else statement to check if a number is even or odd.

PROGRAM
```java
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
```

OUTPUT
```
Enter an integer: 15
The number 15 is Odd.
```

EXPLANATION
The ternary operator takes three operands: a condition followed by a question mark (`?`), the value to return if true, followed by a colon (`:`), and the value to return if false. It is a concise way to replace simple if-else blocks. Here, it assigns "Even" if the number is divisible by 2, and "Odd" otherwise.

---

PAGE 35

QUESTION 35
Implement a program to perform bitwise operations in Java.

AIM
To perform bitwise AND, OR, XOR, NOT, and shift operations on integer values.

PROGRAM
```java
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
```

OUTPUT
```
Enter first integer (e.g., 5): 5
Enter second integer (e.g., 3): 3

--- Bitwise Operations ---
a & b (AND) = 1
a | b (OR)  = 7
a ^ b (XOR) = 6
~a (NOT a)  = -6

--- Shift Operations ---
a << 1 (Left Shift by 1) = 10
a >> 1 (Right Shift by 1) = 2
```

EXPLANATION
Bitwise operators work directly on the binary representations of integers. AND (`&`) results in 1 only if both bits are 1. OR (`|`) results in 1 if at least one bit is 1. XOR (`^`) results in 1 if bits are different. NOT (`~`) inverts all bits; it often yields a negative number in Java because integers are signed, and flipping the highest bit changes the sign. Shift operators move binary bits to the left (`<<`) or right (`>>`), effectively multiplying or dividing by 2.

---

PAGE 36

QUESTION 36
Write a program to demonstrate operator precedence in Java.

AIM
To show how Java evaluates expressions based on the order of operator precedence and the use of parentheses.

PROGRAM
```java
public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println("--- Operator Precedence Demonstration ---\n");
        
        // Multiplication has higher precedence than addition
        int result1 = 10 + 5 * 2;
        System.out.println("Expression: 10 + 5 * 2");
        System.out.println("Result    : " + result1);
        System.out.println("Reason    : 5 * 2 is evaluated first, then 10 is added.\n");
        
        // Parentheses change the order of evaluation
        int result2 = (10 + 5) * 2;
        System.out.println("Expression: (10 + 5) * 2");
        System.out.println("Result    : " + result2);
        System.out.println("Reason    : (10 + 5) is evaluated first due to parentheses, then multiplied by 2.\n");
        
        // Division has higher precedence than addition
        int result3 = 20 / 5 + 3;
        System.out.println("Expression: 20 / 5 + 3");
        System.out.println("Result    : " + result3);
        System.out.println("Reason    : 20 / 5 is evaluated first, then 3 is added.\n");
        
        // Parentheses again
        int result4 = 20 / (5 + 3);
        System.out.println("Expression: 20 / (5 + 3)");
        System.out.println("Result    : " + result4);
        System.out.println("Reason    : (5 + 3) is evaluated first, then 20 is divided by 8.\n");
    }
}
```

OUTPUT
```
--- Operator Precedence Demonstration ---

Expression: 10 + 5 * 2
Result    : 20
Reason    : 5 * 2 is evaluated first, then 10 is added.

Expression: (10 + 5) * 2
Result    : 30
Reason    : (10 + 5) is evaluated first due to parentheses, then multiplied by 2.

Expression: 20 / 5 + 3
Result    : 7
Reason    : 20 / 5 is evaluated first, then 3 is added.

Expression: 20 / (5 + 3)
Result    : 2
Reason    : (5 + 3) is evaluated first, then 20 is divided by 8.
```

EXPLANATION
Operator precedence determines the order in which parts of a complex expression are evaluated. In Java, multiplication (`*`) and division (`/`) have higher precedence than addition (`+`) and subtraction (`-`). However, parentheses `()` have the highest precedence, allowing us to override the default order and force addition to happen before multiplication or division.
