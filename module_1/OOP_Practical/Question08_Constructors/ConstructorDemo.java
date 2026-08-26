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
