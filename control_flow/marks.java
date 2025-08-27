import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        // Calculate average percentage
        int total = physics + chemistry + maths;
        double average = total / 3.0;

        // Display Average
        System.out.println("\nAverage Marks: " + average + "%");

        // Grade and Remarks
        if (average >= 90) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent ");
        } else if (average >= 75) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Very Good ");
        } else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Good ");
        } else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Pass ");
        } else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Fail ");
        }
    }
}
