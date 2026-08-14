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
