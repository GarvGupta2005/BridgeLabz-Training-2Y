import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Step 2: Calculate sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract last digit
            sum += digit;                     // Add digit to sum
            originalNumber = originalNumber / 10; // Remove last digit
        }

        // Step 3: Check Harshad condition
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}