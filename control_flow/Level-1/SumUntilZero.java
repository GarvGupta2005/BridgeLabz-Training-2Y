import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // To store the sum
        double number;        // To store user input

        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        // Keep looping until user enters 0
        while (number != 0) {
            total += number; // Add number to total

            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }

        // Print the final result
        System.out.println("The total sum is: " + total);
    }
}
