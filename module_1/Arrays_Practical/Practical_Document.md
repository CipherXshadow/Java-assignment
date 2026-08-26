PAGE 18

QUESTION 18
Write a program to find the largest and smallest numbers in an array.

AIM
To find the maximum and minimum elements in an array by traversing through it.

PROGRAM
```java
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter the size of the array: 5
Enter 5 elements:
12
5
45
2
19
Largest number: 45
Smallest number: 2
```

EXPLANATION
The program initializes `max` and `min` with the first element of the array. It then uses a loop to compare each subsequent element. If an element is greater than `max`, `max` is updated. If it is smaller than `min`, `min` is updated.

***

PAGE 19

QUESTION 19
Write a program to check if a given number is odd or even.

AIM
To determine whether an integer input by the user is even or odd using the modulus operator.

PROGRAM
```java
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter a number: 14
14 is an even number.
```

EXPLANATION
The modulus operator `%` returns the remainder of a division operation. If a number divided by 2 gives a remainder of 0, the number is categorized as even. Otherwise, it is categorized as odd.

***

PAGE 20

QUESTION 20
Write a program to find the largest of three numbers entered by the user.

AIM
To evaluate three user-provided integers and find the greatest among them using basic conditional statements.

PROGRAM
```java
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int n3 = scanner.nextInt();
        
        int largest;
        if (n1 >= n2 && n1 >= n3) {
            largest = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            largest = n2;
        } else {
            largest = n3;
        }
        
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter first number: 45
Enter second number: 78
Enter third number: 12
The largest number is: 78
```

EXPLANATION
Nested logical operators in `if-else` blocks compare the three numbers. First, it checks if the first number is greater than or equal to both the second and third. If true, it is the largest. Otherwise, the same check is performed on the second number. If both fail, the third number is inherently the largest.

***

PAGE 21

QUESTION 21
Write a program to calculate the factorial of a given number using recursion.

AIM
To compute the factorial of a non-negative integer by having a method call itself iteratively until a base condition is met.

PROGRAM
```java
import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(num);
            System.out.println("Factorial of " + num + " is " + result);
        }
        
        scanner.close();
    }
    
    // Recursive method to calculate factorial
    public static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        return n * factorial(n - 1);
    }
}
```

OUTPUT
```
Enter a non-negative number: 5
Factorial of 5 is 120
```

EXPLANATION
Recursion occurs when a method calls itself. In this program, the `factorial()` method has a base case for `n = 0` or `n = 1` which simply returns 1. For any other number, it recursively calls `factorial(n - 1)` and multiplies the result by `n`.

***

PAGE 22

QUESTION 22
Write a program to check if a given string or number is a palindrome.

AIM
To verify if an input sequence of characters or numbers reads exactly the same backward as it does forward.

PROGRAM
```java
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String original = scanner.next();
        
        String reversed = "";
        
        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter a string or number: radar
radar is a palindrome.
```

EXPLANATION
A palindrome is a word or number that is the same even when its characters are reversed. The program reads the input as a string, loops through it starting from the last character down to the first, and builds a reversed string. It then uses `.equals()` to compare the original and reversed strings.

***

PAGE 23

QUESTION 23
Write a program to generate the first n terms of the Fibonacci series.

AIM
To print the first `n` terms of the Fibonacci sequence where each term is the sum of the two preceding ones.

PROGRAM
```java
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int first = 0, second = 1;
            System.out.println("First " + n + " terms of Fibonacci series:");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int nextTerm = first + second;
                first = second;
                second = nextTerm;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter the number of terms: 7
First 7 terms of Fibonacci series:
0 1 1 2 3 5 8 
```

EXPLANATION
The sequence begins with 0 and 1. To calculate the next term, the logic adds the previous two terms. A loop runs `n` times to compute and print each term, shifting the variables `first` and `second` forward after each iteration.

***

PAGE 24

QUESTION 24
Write a program to check whether a given number is prime.

AIM
To check if a number is divisible only by 1 and itself using a simple loop structure.

PROGRAM
```java
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter a number: 29
29 is a prime number.
```

EXPLANATION
A prime number is a number strictly greater than 1 that has no positive divisors other than 1 and itself. The program uses a `for` loop to try dividing the input number by integers from 2 up to half of the number. If any division results in a remainder of 0, the number is not prime.

***

PAGE 25

QUESTION 25
Write a program to find the sum of all elements in an array.

AIM
To calculate and display the total sum of all the integer elements present in an array.

PROGRAM
```java
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        
        System.out.println("The sum of all elements in the array is: " + sum);
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter the size of the array: 4
Enter 4 elements:
10
20
30
40
The sum of all elements in the array is: 100
```

EXPLANATION
The logic initializes a sum variable to 0. It iterates over the array using a `for` loop, accumulating each element into the sum variable. Finally, it outputs the accumulated sum.

***

PAGE 26

QUESTION 26
Implement a program to reverse the elements of an array.

AIM
To physically invert the order of elements inside an array using a swapping technique.

PROGRAM
```java
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Reversing logic using swapping
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
        
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter the size of array: 5
Enter 5 elements:
1 2 3 4 5
Original array:
1 2 3 4 5 
Reversed array:
5 4 3 2 1 
```

EXPLANATION
To reverse the array efficiently, the program iterates up to the midpoint of the array. In each iteration, it swaps the element at index `i` with the element at index `size - 1 - i`. A temporary variable is used to hold the value during swapping.

***

PAGE 27

QUESTION 27
Write a Java program to perform matrix addition and multiplication.

AIM
To apply 2D array operations by performing both addition and multiplication on two mathematical matrices.

PROGRAM
```java
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = 2, cols = 2;
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        
        System.out.println("Enter elements for 2x2 First Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements for 2x2 Second Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Matrix Addition
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Matrix Multiplication
        int[][] productMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                productMatrix[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(productMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter elements for 2x2 First Matrix:
1 2
3 4
Enter elements for 2x2 Second Matrix:
5 6
7 8
Matrix Addition Result:
6       8
10      12
Matrix Multiplication Result:
19      22
43      50
```

EXPLANATION
Matrix addition simply adds the corresponding elements of two matrices of the same dimensions using nested loops. Matrix multiplication, however, requires three nested loops to multiply rows of the first matrix with columns of the second matrix, accumulating the products to form the output element.

***

PAGE 28

QUESTION 28
Create a program to sort an array using the bubble sort algorithm.

AIM
To manually implement the Bubble Sort algorithm to organize an array's elements in ascending order.

PROGRAM
```java
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Array before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Array after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter the number of elements: 5
Enter 5 elements:
64 34 25 12 22
Array before sorting:
64 34 25 12 22 
Array after sorting:
12 22 25 34 64 
```

EXPLANATION
Bubble sort works by repeatedly stepping through the list, comparing adjacent elements, and swapping them if they are in the wrong order. This passing is repeated until the array is fully sorted. After each outer loop pass, the largest remaining element successfully "bubbles" to its correct position at the end.

***

PAGE 29

QUESTION 29
Write a program to demonstrate a 2D array and print its elements.

AIM
To create a two-dimensional array, accept input from the user, and format the output as a tabular grid.

PROGRAM
```java
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter number of rows: 2
Enter number of columns: 3
Enter the elements of the 2D array:
1 2 3
4 5 6
The 2D array is:
1       2       3
4       5       6
```

EXPLANATION
A 2D array is essentially an array of arrays representing rows and columns. Nested loops are used; the outer loop traverses the rows, and the inner loop traverses the columns for data entry and printing. Tabs (`\t`) ensure a uniform matrix-like display.

***

PAGE 30

QUESTION 30
Write a program to search for an element in a sorted array using the binary search algorithm.

AIM
To efficiently find the position of a target element in a pre-sorted array using the Binary Search technique.

PROGRAM
```java
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements (must be in sorted order):");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        
        int low = 0;
        int high = size - 1;
        boolean found = false;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == target) {
                System.out.println("Element " + target + " found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " was not found in the array.");
        }
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter the size of the sorted array: 5
Enter 5 elements (must be in sorted order):
10 20 30 40 50
Enter the element to search: 40
Element 40 found at index 3
```

EXPLANATION
Binary search splits the sorted array in half repeatedly. It maintains `low` and `high` bounds. If the middle element is less than the target, the target must be in the upper half, so `low` moves up. If greater, `high` moves down. The process significantly reduces search time compared to linear search.

***

PAGE 31

QUESTION 31
Write a program to remove duplicate elements from an array.

AIM
To extract only the unique values from a user-provided array and store them without duplicates.

PROGRAM
```java
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Array to store unique elements
        int[] temp = new int[size];
        int uniqueCount = 0;
        
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            // Check if arr[i] is already in temp array
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
```

OUTPUT
```
Enter the size of array: 6
Enter 6 elements:
1 2 2 3 4 1
Original array:
1 2 2 3 4 1 
Array after removing duplicates:
1 2 3 4 
```

EXPLANATION
To filter out copies, the code sets up a secondary array. It looks at every item in the original array and attempts to find it inside the secondary array. If the item doesn't exist there, it is safely appended to the new array, guaranteeing an output consisting purely of distinct elements.
