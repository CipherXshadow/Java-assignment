// A final class cannot be inherited by any other class
final class SecuritySystem {
    void displayStatus() {
        System.out.println("Security system is active.");
    }
}
// If we tried: class AdvancedSecurity extends SecuritySystem {} 
// It would result in a compilation error.

// A standard class containing a final method
class Vehicle {
    // A final method cannot be overridden by subclasses
    final void startEngine() {
        System.out.println("Engine started using standard procedure.");
    }
    
    void honk() {
        System.out.println("Vehicle honking.");
    }
}

class Car extends Vehicle {
    // If we tried to override startEngine() here: 
    // void startEngine() { System.out.println("Starting custom engine"); }
    // It would result in a compilation error.
    
    // Overriding a non-final method is perfectly fine
    @Override
    void honk() {
        System.out.println("Car goes beep beep!");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        System.out.println("--- Final Class Demonstration ---");
        // We can instantiate and use a final class normally
        SecuritySystem sys = new SecuritySystem();
        sys.displayStatus();
        
        System.out.println("\n--- Final Method Demonstration ---");
        Car myCar = new Car();
        
        // Child class inherits and uses the final method without overriding it
        myCar.startEngine();
        myCar.honk();
    }
}
