import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input numbers
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Step 2: Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result = 0;
        boolean valid = true;

        // Step 3: Use switch...case
        switch (op) {
            case "+":
                result = first + second;
                break;

            case "-":
                result = first - second;
                break;

            case "*":
                result = first * second;
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero!");
                    valid = false;
                }
                break;

            default:
                System.out.println("Invalid Operator!");
                valid = false;
        }

        // Step 4: Display result
        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}