import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;   // initialize with 1
        int counter = number - 1; // start from number-1

        // Loop until counter reaches 1
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter; // store the first divisor found
                break; // stop the loop, since this is the greatest factor
            }
            counter--; // decrement counter
        }

        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
