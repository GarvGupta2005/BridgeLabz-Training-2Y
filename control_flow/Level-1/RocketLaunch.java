import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for countdown start
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrement by 1
        }

        // Launch message
        System.out.println("🚀 Lift off!");
    }
}
