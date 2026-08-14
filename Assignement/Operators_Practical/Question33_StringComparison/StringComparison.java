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
