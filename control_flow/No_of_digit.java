import java.util.*;

public class No_of_digit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        int count = 0;   // to store number of digits
        
        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Repeat until number becomes 0
            while (number != 0) {
                number = number / 10;  // remove last digit
                count++;               // increase digit count
            }
        }
        
        System.out.println("Number of digits: " + count);
    }
}
