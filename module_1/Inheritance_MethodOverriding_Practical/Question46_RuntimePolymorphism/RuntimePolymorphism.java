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
