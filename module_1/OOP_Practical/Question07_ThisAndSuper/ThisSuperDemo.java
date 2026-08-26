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
