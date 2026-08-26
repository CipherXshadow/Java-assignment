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
