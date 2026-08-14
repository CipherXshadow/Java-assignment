public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String originalString = "Java";
        System.out.println("Original String: " + originalString);
        
        // try to change the string
        originalString.concat(" Programming");
        
        // it doesn't change
        System.out.println("After concat (original): " + originalString);
        
        // store it in new string
        String modifiedString = originalString.concat(" Programming");
        System.out.println("Modified String: " + modifiedString);
        
        System.out.println("Are they the same object? " + (originalString == modifiedString));
    }
}
