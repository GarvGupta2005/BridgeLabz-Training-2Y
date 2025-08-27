import java.util.*;

public class abundant {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        
        // Step 1: Find divisors and add them
        for (int i = 1; i < number; i++) {   // proper divisors only
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Step 2: Check condition of Abundant Number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }
    }
}
