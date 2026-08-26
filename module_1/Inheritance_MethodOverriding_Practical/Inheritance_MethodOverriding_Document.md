PAGE 42

QUESTION 42
Write a program to demonstrate multilevel inheritance in Java.

AIM
To demonstrate multilevel inheritance by creating a class hierarchy where a class inherits from a parent, which in turn inherits from a grandparent.

PROGRAM
```java
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
```

OUTPUT
```
--- Multilevel Inheritance Demonstration ---
This is a Person.
This Person is an Employee.
This Employee is a Manager.
```

EXPLANATION
Multilevel inheritance occurs when a derived class is created from another derived class. In this program, `Manager` is derived from `Employee`, and `Employee` is derived from `Person`. Thus, the `Manager` class inherits properties and methods from both its immediate parent (`Employee`) and its grandparent (`Person`).

---

PAGE 43

QUESTION 43
Create a program to show method overriding and the use of super to call the parent class method.

AIM
To override a parent method in a child class and use the `super` keyword to execute the parent's implementation before adding new behavior.

PROGRAM
```java
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
```

OUTPUT
```
--- Method Overriding with super ---
This is a generic Bank Account.
Specifically, this is a Savings Account.
```

EXPLANATION
Method overriding occurs when a subclass provides a specific implementation for a method already defined in its parent class. The `super` keyword is used inside the overridden method to refer to the parent class's version of the method, allowing the subclass to extend the functionality rather than completely replacing it.

---

PAGE 44

QUESTION 44
Implement an abstract class and override its methods in a subclass.

AIM
To define an abstract class with an abstract method and provide its concrete implementation in a subclass.

PROGRAM
```java
// Abstract class
abstract class Shape {
    // Concrete method in abstract class
    void showShape() {
        System.out.println("I am a geometric shape.");
    }
    
    // Abstract method without a body
    abstract void calculateArea();
}

// Subclass extending the abstract class
class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    // Overriding and implementing the abstract method
    @Override
    void calculateArea() {
        double area = 3.14159 * radius * radius;
        System.out.println("Area of Circle with radius " + radius + " is: " + area);
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("--- Abstract Class Demonstration ---");
        
        // Note: Cannot instantiate Shape directly like 'new Shape();' 
        // because it is abstract.
        
        // Creating an object of the subclass
        Circle myCircle = new Circle(5.0);
        
        // Calling the concrete method inherited from the abstract class
        myCircle.showShape();
        
        // Calling the implemented abstract method
        myCircle.calculateArea();
    }
}
```

OUTPUT
```
--- Abstract Class Demonstration ---
I am a geometric shape.
Area of Circle with radius 5.0 is: 78.53975
```

EXPLANATION
An abstract class cannot be instantiated directly (you cannot create objects of it using `new`). It serves as a blueprint for subclasses. It can contain abstract methods (methods without a body) which the subclasses are forced to implement. This ensures all subclasses share a common interface while providing their own specific logic.

---

PAGE 45

QUESTION 45
Write a program to demonstrate final classes and methods.

AIM
To demonstrate that a `final` class cannot be inherited and a `final` method cannot be overridden by subclasses.

PROGRAM
```java
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
```

OUTPUT
```
--- Final Class Demonstration ---
Security system is active.

--- Final Method Demonstration ---
Engine started using standard procedure.
Car goes beep beep!
```

EXPLANATION
The `final` keyword restricts modification. When a class is marked as `final`, no other class can inherit from it, which is useful for security and design lockdown. When a method is marked as `final`, a child class inherits it but cannot override (change) its implementation, ensuring the original behavior remains untouched.

---

PAGE 46

QUESTION 46
Create a program to show run-time polymorphism using dynamic method dispatch.

AIM
To demonstrate dynamic method dispatch where a parent reference variable determines which overridden method to call based on the actual runtime object.

PROGRAM
```java
// Parent class
class Animal {
    void sound() {
        System.out.println("Generic animal makes a sound.");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        System.out.println("--- Runtime Polymorphism (Dynamic Method Dispatch) ---\n");
        
        // Parent class reference variable
        Animal myAnimal;
        
        // Reference points to a Dog object
        myAnimal = new Dog();
        System.out.print("Calling sound() when referring to Dog: ");
        myAnimal.sound();
        
        // The same reference now points to a Cat object
        myAnimal = new Cat();
        System.out.print("Calling sound() when referring to Cat: ");
        myAnimal.sound();
    }
}
```

OUTPUT
```
--- Runtime Polymorphism (Dynamic Method Dispatch) ---

Calling sound() when referring to Dog: Dog says: Woof Woof!
Calling sound() when referring to Cat: Cat says: Meow Meow!
```

EXPLANATION
Run-time polymorphism (dynamic method dispatch) allows a parent class reference to point to a child class object. When an overridden method (`sound()`) is called through the parent reference, Java determines which version of the method to execute at runtime, based on the actual object type (`Dog` or `Cat`), not the reference type (`Animal`).
