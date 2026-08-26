// Grandparent Class
class Person {
    void showPerson() {
        System.out.println("This is a Person.");
    }
}

// Parent Class (inherits from Person)
class Employee extends Person {
    void showEmployee() {
        System.out.println("This Person is an Employee.");
    }
}

// Child Class (inherits from Employee)
class Manager extends Employee {
    void showManager() {
        System.out.println("This Employee is a Manager.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("--- Multilevel Inheritance Demonstration ---");
        
        // Creating an object of the lowest-level child class
        Manager mgr = new Manager();
        
        // Accessing methods from all levels of the hierarchy
        mgr.showPerson();   // Inherited from Person (Grandparent)
        mgr.showEmployee(); // Inherited from Employee (Parent)
        mgr.showManager();  // Own method (Child)
    }
}
