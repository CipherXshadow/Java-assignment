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
