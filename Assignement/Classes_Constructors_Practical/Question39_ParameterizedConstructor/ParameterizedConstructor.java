class Employee {
    int empId;
    String empName;
    double salary;

    // Parameterized constructor to initialize class fields
    public Employee(int id, String name, double salary) {
        this.empId = id;
        this.empName = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name       : " + empName);
        System.out.println("Salary     : $" + salary);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        System.out.println("Creating Employee objects...");
        
        // Initializing objects using the parameterized constructor
        Employee emp1 = new Employee(1001, "David", 45000.50);
        Employee emp2 = new Employee(1002, "Emma", 52000.75);
        
        System.out.println("\nEmployee 1 Details:");
        emp1.displayDetails();
        
        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
    }
}
