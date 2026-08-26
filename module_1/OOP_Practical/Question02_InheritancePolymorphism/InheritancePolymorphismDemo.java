public class InheritancePolymorphismDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Amit", 50000);
        Employee emp2 = new Manager("Neha", 80000, 15000);
        
        emp1.displayDetails();
        System.out.println("-----------------");
        emp2.displayDetails();
    }
}

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + salary);
    }
}

class Manager extends Employee {
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Compensation: $" + (salary + bonus));
    }
}
