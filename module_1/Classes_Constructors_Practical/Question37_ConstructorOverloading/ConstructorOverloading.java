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
