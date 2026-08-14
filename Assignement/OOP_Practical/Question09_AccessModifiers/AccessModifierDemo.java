public class AccessModifierDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        account.accountHolder = "Priya"; // accessible (public)
        account.branchCode = 101;        // accessible (default)
        // account.balance = 1000.0;     // gives error because private
        
        account.deposit(500.0);
        account.displayAccountInfo();
    }
}

class BankAccount {
    public String accountHolder;    
    private double balance;         
    int branchCode;                 
    protected String accountType;   

    public BankAccount() {
        this.balance = 0.0;
        this.accountType = "Savings";
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void displayAccountInfo() {
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: $" + balance); 
    }
}
