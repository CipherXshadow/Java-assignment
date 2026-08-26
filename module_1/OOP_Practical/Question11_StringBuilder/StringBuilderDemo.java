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
