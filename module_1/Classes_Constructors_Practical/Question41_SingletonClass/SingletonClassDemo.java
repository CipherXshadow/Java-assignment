// A Singleton class ensures that only one instance of the class is created.
class DatabaseConnection {
    // 1. Create a private static instance of the class
    private static DatabaseConnection instance;
    
    // 2. Make the constructor private so no one can instantiate it from outside
    private DatabaseConnection() {
        System.out.println("Database Connection established.");
    }
    
    // 3. Provide a public static method to get the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            // Create the object only if it hasn't been created yet
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public void showMessage() {
        System.out.println("You are using the single instance of DatabaseConnection.");
    }
}

public class SingletonClassDemo {
    public static void main(String[] args) {
        // DatabaseConnection db = new DatabaseConnection(); 
        // The above line will cause an error because the constructor is private
        
        System.out.println("Requesting connection 1...");
        // Get the only object available
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        conn1.showMessage();
        
        System.out.println("\nRequesting connection 2...");
        // Try getting it again
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        
        System.out.println("\n--- Checking Instances ---");
        // Check if both references point to the same memory location
        if (conn1 == conn2) {
            System.out.println("Both conn1 and conn2 point to the exact same object.");
        }
    }
}
