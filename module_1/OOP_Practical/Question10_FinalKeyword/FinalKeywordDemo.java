public class FinalKeywordDemo {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.displayConfig();
        
        // config.MAX_USERS = 200; // error: can't change final variable
        
        SecureSystem system = new SecureSystem();
        system.authenticate();
    }
}

class Configuration {
    final int MAX_USERS = 100;
    
    public final void displayConfig() {
        System.out.println("Max Users allowed: " + MAX_USERS);
    }
}

final class SecureSystem {
    public void authenticate() {
        System.out.println("System authenticated securely.");
    }
}

// class HackerSystem extends SecureSystem {} // error: can't inherit from final class
