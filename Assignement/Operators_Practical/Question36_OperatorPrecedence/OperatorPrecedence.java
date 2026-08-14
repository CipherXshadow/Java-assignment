public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println("--- Operator Precedence Demonstration ---\n");
        
        // Multiplication has higher precedence than addition
        int result1 = 10 + 5 * 2;
        System.out.println("Expression: 10 + 5 * 2");
        System.out.println("Result    : " + result1);
        System.out.println("Reason    : 5 * 2 is evaluated first, then 10 is added.\n");
        
        // Parentheses change the order of evaluation
        int result2 = (10 + 5) * 2;
        System.out.println("Expression: (10 + 5) * 2");
        System.out.println("Result    : " + result2);
        System.out.println("Reason    : (10 + 5) is evaluated first due to parentheses, then multiplied by 2.\n");
        
        // Division has higher precedence than addition
        int result3 = 20 / 5 + 3;
        System.out.println("Expression: 20 / 5 + 3");
        System.out.println("Result    : " + result3);
        System.out.println("Reason    : 20 / 5 is evaluated first, then 3 is added.\n");
        
        // Parentheses again
        int result4 = 20 / (5 + 3);
        System.out.println("Expression: 20 / (5 + 3)");
        System.out.println("Result    : " + result4);
        System.out.println("Reason    : (5 + 3) is evaluated first, then 20 is divided by 8.\n");
    }
}
