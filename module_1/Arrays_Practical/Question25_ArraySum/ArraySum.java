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
