// Parent class
class BankAccount {
    void displayAccountType() {
        System.out.println("This is a generic Bank Account.");
    }
}

// Child class overriding the parent method
class SavingsAccount extends BankAccount {
    @Override
    void displayAccountType() {
        // Calling the parent class method using super
        super.displayAccountType();
        
        // Adding child-specific behavior
        System.out.println("Specifically, this is a Savings Account.");
    }
}

public class MethodOverridingSuper {
    public static void main(String[] args) {
        System.out.println("--- Method Overriding with super ---");
        
        // Creating an object of the child class
        SavingsAccount myAccount = new SavingsAccount();
        
        // Calling the overridden method
        // It will execute the parent's version first (via super), then its own
        myAccount.displayAccountType();
    }
}
