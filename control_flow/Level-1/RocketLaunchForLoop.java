import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for countdown start
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Launch message
        System.out.println("🚀 Lift off!");
    }
}
