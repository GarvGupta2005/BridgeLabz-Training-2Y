import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;  // Step 2: Initialize count

        // Special case: If number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Step 3: Loop until number becomes 0
            while (number != 0) {
                number = number / 10;  // Remove last digit
                count++;               // Increase count
            }
        }

        // Step 4: Output result
        System.out.println("The number of digits is: " + count);
    }
}