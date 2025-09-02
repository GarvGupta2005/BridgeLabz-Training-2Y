import java.util.*;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum and store original number
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use while loop till originalNumber becomes 0
        while (originalNumber != 0) {
            // Step 3.1: Extract last digit
            int digit = originalNumber % 10;

            // Step 3.2: Find cube of the digit and add to sum
            sum += digit * digit * digit;

            // Step 3.3: Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Step 4: Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }
}
