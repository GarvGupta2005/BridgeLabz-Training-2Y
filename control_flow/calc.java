import java.util.*;

public class calc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Take input
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();
        
        double result;
        
        // Step 2: Use switch...case for operations
        switch(op) {
            case "+":
                result = first + second;
                System.out.println("Result = " + result);
                break;
            
            case "-":
                result = first - second;
                System.out.println("Result = " + result);
                break;
                
            case "*":
                result = first * second;
                System.out.println("Result = " + result);
                break;
                
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero not allowed.");
                }
                break;
                
            default:
                System.out.println("Invalid Operator!");
        }
    }
}
