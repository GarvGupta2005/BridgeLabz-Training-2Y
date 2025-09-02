import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // initialize with 1

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;  // store the first divisor found
                break;  // stop the loop since we found the greatest factor
            }
        }

        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
