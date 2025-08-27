import java.util.*;

public class harshad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int temp = number;   // keep a copy of number
        
        // Step 1: Extract digits and calculate sum
        while (temp != 0) {
            int digit = temp % 10;   // get last digit
            sum += digit;            // add digit to sum
            temp = temp / 10;        // remove last digit
        }
        
        // Step 2: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}
