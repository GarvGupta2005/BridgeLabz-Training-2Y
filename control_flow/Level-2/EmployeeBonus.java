import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter the salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Check eligibility
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5.");
        }
    }
}
