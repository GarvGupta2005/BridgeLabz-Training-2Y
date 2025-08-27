import java.util.*;

public class BMI {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Take user input
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();
        
        // Step 2: Convert height from cm to meters
        double heightM = heightCm / 100;
        
        // Step 3: Calculate BMI
        double bmi = weight / (heightM * heightM);
        
        System.out.printf("Your BMI is: %.2f\n", bmi);
        
        // Step 4: Determine weight status using standard BMI table
        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Status: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}
