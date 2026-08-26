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
