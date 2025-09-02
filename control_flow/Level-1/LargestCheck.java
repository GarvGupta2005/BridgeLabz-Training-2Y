import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Find max
        int max = Math.max(number1, Math.max(number2, number3));

        // Output checks
        System.out.println("Is the first number the largest? " + (number1 == max ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (number2 == max ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (number3 == max ? "Yes" : "No"));

        sc.close();
    }
}
