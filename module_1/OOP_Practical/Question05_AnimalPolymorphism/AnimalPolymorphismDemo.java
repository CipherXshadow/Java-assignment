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
