import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if number is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");

            int counter = 1; // start from 1
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++; // increment counter
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }
    }
}
