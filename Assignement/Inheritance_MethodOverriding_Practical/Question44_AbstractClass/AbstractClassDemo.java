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
