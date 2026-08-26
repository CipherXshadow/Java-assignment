PAGE 37

QUESTION 37
Write a program to create a class with multiple constructors (constructor overloading).

AIM
To demonstrate constructor overloading by creating a class with multiple constructors that take different numbers or types of parameters.

PROGRAM
```java
public class ConstructorOverloading {
    String name;
    int age;

    // Default constructor
    public ConstructorOverloading() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called.");
    }

    // Constructor with one parameter
    public ConstructorOverloading(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Constructor with one parameter called.");
    }

    // Constructor with two parameters
    public ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with two parameters called.");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorOverloading obj1 = new ConstructorOverloading();
        obj1.display();
        System.out.println();

        ConstructorOverloading obj2 = new ConstructorOverloading("Alice");
        obj2.display();
        System.out.println();

        ConstructorOverloading obj3 = new ConstructorOverloading("Bob", 20);
        obj3.display();
    }
}
```

OUTPUT
```
Default constructor called.
Name: Unknown, Age: 0

Constructor with one parameter called.
Name: Alice, Age: 0

Constructor with two parameters called.
Name: Bob, Age: 20
```

EXPLANATION
Constructor overloading allows a class to have more than one constructor with different parameter lists. When an object is created, Java automatically calls the constructor that matches the number and types of arguments passed, providing flexibility in object initialization.

---

PAGE 38

QUESTION 38
Implement a program to demonstrate the use of a copy constructor in Java.

AIM
To implement a copy constructor that initializes a new object using the values of an existing object of the same class.

PROGRAM
```java
class Student {
    String name;
    int rollNo;

    // Parameterized constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Copy constructor (takes an object of the same class)
    public Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        // Create original object using parameterized constructor
        Student student1 = new Student("John", 101);
        System.out.println("Original Student:");
        student1.display();

        // Create a copy of student1 using copy constructor
        Student student2 = new Student(student1);
        System.out.println("\nCopied Student:");
        student2.display();
    }
}
```

OUTPUT
```
Original Student:
Name: John, Roll No: 101

Copied Student:
Name: John, Roll No: 101
```

EXPLANATION
A copy constructor is a special type of parameterized constructor that accepts an object of the same class as its argument. It is used to create a new object with the exact same data values as the passed object, effectively creating a separate copy in memory.

---

PAGE 39

QUESTION 39
Create a program that initializes class fields using a parameterized constructor.

AIM
To initialize class attributes with specific values at the time of object creation using a parameterized constructor.

PROGRAM
```java
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
```

OUTPUT
```
Creating Employee objects...

Employee 1 Details:
Employee ID: 1001
Name       : David
Salary     : $45000.5

Employee 2 Details:
Employee ID: 1002
Name       : Emma
Salary     : $52000.75
```

EXPLANATION
A parameterized constructor accepts values as arguments when an object is instantiated. These arguments are then used to assign initial values to the class fields (instance variables). This ensures that every object starts with a valid state defined by the programmer.

---

PAGE 40

QUESTION 40
Write a program to demonstrate the use of static and non-static methods.

AIM
To highlight the differences in calling and using static methods versus non-static (instance) methods.

PROGRAM
```java
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
```

OUTPUT
```
--- Calling Static Method ---
This is a static method.
Static variable value: 10

--- Calling Non-Static Method ---
This is a non-static method.
Instance variable value: 5
Static variable accessed here: 10
```

EXPLANATION
Static methods belong to the class rather than any specific object, meaning they can be called directly using the class name (e.g., `ClassName.methodName()`). Non-static methods belong to instances of the class, meaning an object must be created before the method can be invoked. Static methods cannot access instance variables directly.

---

PAGE 41

QUESTION 41
Implement a singleton class in Java.

AIM
To create a Singleton class that restricts object creation, ensuring only a single instance of the class exists throughout the program.

PROGRAM
```java
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
```

OUTPUT
```
Requesting connection 1...
Database Connection established.
You are using the single instance of DatabaseConnection.

Requesting connection 2...

--- Checking Instances ---
Both conn1 and conn2 point to the exact same object.
```

EXPLANATION
A Singleton class ensures that a class has only one instance and provides a global point of access to it. This is achieved by creating a private constructor so objects cannot be created externally, and offering a public static `getInstance()` method that returns the same, single static instance every time it is called.
