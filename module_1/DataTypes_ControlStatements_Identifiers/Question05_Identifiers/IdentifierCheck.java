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
