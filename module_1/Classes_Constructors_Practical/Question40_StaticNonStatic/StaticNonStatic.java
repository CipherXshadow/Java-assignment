public class StaticNonStatic {
    
    // Static variable (shared among all instances)
    static int staticCount = 0;
    
    // Non-static (instance) variable
    int instanceCount = 0;
    
    // Static method
    public static void displayStatic() {
        System.out.println("This is a static method.");
        System.out.println("Static variable value: " + staticCount);
        // Note: Cannot access instanceCount directly in a static method
    }
    
    // Non-static method
    public void displayNonStatic() {
        System.out.println("This is a non-static method.");
        System.out.println("Instance variable value: " + instanceCount);
        // Non-static methods can access static variables
        System.out.println("Static variable accessed here: " + staticCount);
    }

    public static void main(String[] args) {
        // Static variables and methods can be accessed using Class Name (without an object)
        StaticNonStatic.staticCount = 10;
        System.out.println("--- Calling Static Method ---");
        StaticNonStatic.displayStatic();
        
        // Non-static variables and methods require creating an object
        System.out.println("\n--- Calling Non-Static Method ---");
        StaticNonStatic obj = new StaticNonStatic();
        obj.instanceCount = 5;
        obj.displayNonStatic();
    }
}
