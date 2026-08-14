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
