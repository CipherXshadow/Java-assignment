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
