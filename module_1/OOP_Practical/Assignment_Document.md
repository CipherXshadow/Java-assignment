# Java OOP Practical Assignment

## QUESTION 1
Write a program to demonstrate encapsulation in Java.
- Create a class with private data members.
- Use public getter and setter methods.
- Create a main class to demonstrate the encapsulated data.

### CONCEPT / AIM
This program shows encapsulation. We make variables private so they can't be changed directly, and we use public getter and setter methods to access them safely.

### JAVA PROGRAM
```java
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rahul");
        student.setAge(20);
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
```

### SAMPLE OUTPUT
```
Student Name: Rahul
Student Age: 20
```

### EXPLANATION
The `Student` class keeps `name` and `age` private, meaning they cannot be accessed directly from outside the class. The `EncapsulationDemo` class interacts with these variables using public methods like `setName()` and `getAge()`. The `setAge()` method also includes a simple check to make sure the age is valid.

---

## QUESTION 2
Create a program showing the use of inheritance and polymorphism.
- Use a parent class and child class.
- Demonstrate runtime polymorphism using method overriding.

### CONCEPT / AIM
This shows inheritance (where one class gets properties from another) and runtime polymorphism (overriding methods in the child class).

### JAVA PROGRAM
```java
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
```

### SAMPLE OUTPUT
```
Employee Name: Amit
Base Salary: $50000.0
-----------------
Manager Name: Neha
Salary: $80000.0
Bonus: $15000.0
Total Compensation: $95000.0
```

### EXPLANATION
The `Manager` class inherits from `Employee`. The `displayDetails()` method is overridden in the `Manager` class. Even though `emp2` is an `Employee` reference, it points to a `Manager` object, so it runs the `Manager`'s version of the method.

---

## QUESTION 3
Explain and implement the concept of abstraction in Java using interfaces.
- Create an interface.
- Implement the interface in a class.
- Demonstrate the interface through a main method.

### CONCEPT / AIM
This shows abstraction using interfaces. We define what the methods should look like in the interface, and write the actual code inside the classes that implement it.

### JAVA PROGRAM
```java
public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        myCar.startEngine();
        myBike.startEngine();
    }
}

interface Vehicle {
    void startEngine();
}

class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }
}

class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started with a button press.");
    }
}
```

### SAMPLE OUTPUT
```
Car engine started with a key.
Bike engine started with a button press.
```

### EXPLANATION
The `Vehicle` interface defines a method `startEngine()` without any body. The `Car` and `Bike` classes implement this interface and write their own logic for starting the engine.

---

## QUESTION 4
Write a program to demonstrate method overloading and method overriding.
- Demonstrate method overloading using different parameters.
- Demonstrate method overriding using parent and child classes.
- Keep both concepts clearly distinguishable.

### CONCEPT / AIM
This shows the difference between method overloading (same method name, different parameters in the same class) and overriding (child class changing the parent's method).

### JAVA PROGRAM
```java
public class OverloadingOverridingDemo {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        // testing overloading
        System.out.println("Sum of 2 integers: " + math.add(10, 20));
        System.out.println("Sum of 3 integers: " + math.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + math.add(15.5, 20.5));
        
        System.out.println("-----------------");
        
        // testing overriding
        Shape shape = new Circle();
        shape.draw();
    }
}

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
```

### SAMPLE OUTPUT
```
Sum of 2 integers: 30
Sum of 3 integers: 60
Sum of 2 doubles: 36.0
-----------------
Drawing a circle.
```

### EXPLANATION
In `MathOperations`, the `add()` method is overloaded because we use different parameter types. In the `Shape` class, the `draw()` method is overridden in the `Circle` subclass with the exact same method signature.

---

## QUESTION 5
Create a class hierarchy for animals that demonstrates polymorphism.
- Create a suitable parent class such as Animal.
- Create multiple child classes such as Dog, Cat, etc.
- Override a common method such as sound().
- Demonstrate polymorphism using parent-class references.

### CONCEPT / AIM
This program shows how polymorphism works with an Animal class hierarchy. Different animal objects respond differently to the same method call.

### JAVA PROGRAM
```java
public class AnimalPolymorphismDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();
        
        myDog.sound();
        myCat.sound();
        myCow.sound();
    }
}

class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog says: Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat says: Meow");
    }
}

class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Cow says: Moo");
    }
}
```

### SAMPLE OUTPUT
```
Dog says: Woof Woof
Cat says: Meow
Cow says: Moo
```

### EXPLANATION
`Dog`, `Cat`, and `Cow` all inherit from `Animal` and override the `sound()` method. When we call `sound()` using an `Animal` reference, the child class method runs. This is polymorphism.

---

## QUESTION 6
Develop a program to implement multiple inheritance using interfaces.
- Create two interfaces.
- Create one class implementing both interfaces.
- Demonstrate that Java achieves multiple inheritance through interfaces.

### CONCEPT / AIM
Since Java doesn't allow multiple inheritance with classes, we use interfaces instead to show how a class can inherit from more than one source.

### JAVA PROGRAM
```java
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        
        myPhone.makeCall("+123456789");
        myPhone.takePicture();
    }
}

interface Phone {
    void makeCall(String number);
}

interface Camera {
    void takePicture();
}

class SmartPhone implements Phone, Camera {
    @Override
    public void makeCall(String number) {
        System.out.println("Dialing " + number + "...");
    }

    @Override
    public void takePicture() {
        System.out.println("Capturing photo with flash...");
    }
}
```

### SAMPLE OUTPUT
```
Dialing +123456789...
Capturing photo with flash...
```

### EXPLANATION
Java classes cannot extend more than one class to avoid confusion. But the `SmartPhone` class can implement both `Phone` and `Camera` interfaces since interfaces only have method definitions.

---

## QUESTION 7
Write a Java program to showcase the use of this and super keywords.
- Use this to refer to the current object's instance variables or constructor.
- Use super to access a parent class variable, method, or constructor.
- Keep the example simple and easy to understand.

### CONCEPT / AIM
This example shows the `this` keyword referring to the current object, and the `super` keyword being used to call the parent class.

### JAVA PROGRAM
```java
public class ThisSuperDemo {
    public static void main(String[] args) {
        Child childObj = new Child(100, 200);
        childObj.displayValues();
    }
}

class Parent {
    int value;

    public Parent(int value) {
        this.value = value;
    }
}

class Child extends Parent {
    int value;

    public Child(int parentValue, int childValue) {
        super(parentValue); // calling parent constructor
        this.value = childValue; // setting current object variable
    }

    public void displayValues() {
        System.out.println("Child value: " + this.value);
        System.out.println("Parent value: " + super.value);
    }
}
```

### SAMPLE OUTPUT
```
Child value: 200
Parent value: 100
```

### EXPLANATION
Inside `Child`, `super(parentValue)` calls the `Parent` constructor. We also use `this.value` to set the child's instance variable, and `super.value` to get the parent's instance variable since they both have the same name.

---

## QUESTION 8
Demonstrate the concept of constructors in OOP with a program.
- Demonstrate a default/no-argument constructor.
- Demonstrate a parameterized constructor.
- Show how objects are initialized using constructors.

### CONCEPT / AIM
To show object initialization using a default constructor and a parameterized constructor.

### JAVA PROGRAM
```java
public class ConstructorDemo {
    public static void main(String[] args) {
        // default constructor
        Book book1 = new Book();
        book1.displayInfo();
        
        System.out.println("-----------------");
        
        // parameterized constructor
        Book book2 = new Book("Java Programming", "John Doe");
        book2.displayInfo();
    }
}

class Book {
    String title;
    String author;

    public Book() {
        title = "Unknown Title";
        author = "Unknown Author";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
```

### SAMPLE OUTPUT
```
Title: Unknown Title
Author: Unknown Author
-----------------
Title: Java Programming
Author: John Doe
```

### EXPLANATION
The `Book` class has two constructors. The first one is a default constructor that sets unknown strings. The second is parameterized, which takes specific values when creating the object.

---

## QUESTION 9
Explain and implement the concept of access modifiers in Java.
- Demonstrate public, private, protected, and default access where practical.
- Use appropriate classes/packages if necessary.
- Keep the example understandable for a beginner.

### CONCEPT / AIM
This program shows Java's four access modifiers to demonstrate how data access is restricted.

### JAVA PROGRAM
```java
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
```

### SAMPLE OUTPUT
```
Deposited: $500.0
Holder: Priya
Balance: $500.0
```

### EXPLANATION
The `BankAccount` class demonstrates the modifiers. `accountHolder` is public and accessible anywhere. `balance` is private, so it can only be changed securely using methods like `deposit()`. `branchCode` uses default access and `accountType` uses protected.

---

## QUESTION 10
Show an example of the final keyword for variables, methods, and classes.
- Demonstrate a final variable.
- Demonstrate a final method.
- Demonstrate a final class.
- Do NOT intentionally include code that causes compilation errors. Explain in comments or text what final prevents.

### CONCEPT / AIM
To demonstrate the `final` keyword which prevents variable changing, method overriding, and class inheritance.

### JAVA PROGRAM
```java
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
```

### SAMPLE OUTPUT
```
Max Users allowed: 100
System authenticated securely.
```

### EXPLANATION
The `MAX_USERS` variable is marked final, making it a constant. The `displayConfig()` method is final, so no child class can override it. `SecureSystem` is a final class, so no other class can inherit from it.

---

## QUESTION 11
Write a program that uses Java's StringBuilder for efficient string operations.
- Demonstrate append(), insert(), delete(), and reverse() or other useful StringBuilder operations.
- Show the resulting output.
- Keep the program simple.

### CONCEPT / AIM
This demonstrates StringBuilder which allows you to modify strings without creating new objects every time like normal strings do.

### JAVA PROGRAM
```java
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original: " + sb);
        
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);
        
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
```

### SAMPLE OUTPUT
```
Original: Hello
After append: Hello World
After insert: Hello Java World
After delete: Hello World
After reverse: dlroW olleH
```

### EXPLANATION
`StringBuilder` manipulates a character array directly. Methods like `append()`, `insert()`, `delete()`, and `reverse()` modify the sequence without creating new objects, saving memory.

---

## QUESTION 12
Write a program to demonstrate the immutability of the String class.
- Create a String object.
- Perform an apparent modification such as concatenation.
- Demonstrate that the original String object remains unchanged and a new String is created.
- Explain why String is immutable.

### CONCEPT / AIM
To prove that standard String objects can't be changed after creation, and any modification just returns a new String object.

### JAVA PROGRAM
```java
public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String originalString = "Java";
        System.out.println("Original String: " + originalString);
        
        // try to change the string
        originalString.concat(" Programming");
        
        // it doesn't change
        System.out.println("After concat (original): " + originalString);
        
        // store it in new string
        String modifiedString = originalString.concat(" Programming");
        System.out.println("Modified String: " + modifiedString);
        
        System.out.println("Are they the same object? " + (originalString == modifiedString));
    }
}
```

### SAMPLE OUTPUT
```
Original String: Java
After concat (original): Java
Modified String: Java Programming
Are they the same object? false
```

### EXPLANATION
In Java, `String` is strictly immutable. This means it cannot be changed once created. When we call `originalString.concat()`, it creates a new memory block holding "Java Programming" but leaves the original "Java" string alone.
