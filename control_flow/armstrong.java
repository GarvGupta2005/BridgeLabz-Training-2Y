import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;                       // to store sum of cubes
        int originalNumber = number;       // keep a copy of the original number
        
        // Step 1: Loop until number becomes 0
        while (originalNumber != 0) {
            
            // Step 2: Get last digit using modulus
            int digit = originalNumber % 10;
            
            // Step 3: Add cube of the digit to sum
            sum += digit * digit * digit;
            
            // Step 4: Remove last digit (integer division by 10)
            originalNumber = originalNumber / 10;
        }
        
        // Step 5: Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }
}
