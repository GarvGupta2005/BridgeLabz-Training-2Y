import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.printf("Distance in yards: %.2f\n", distanceInYards);
        System.out.printf("Distance in miles: %.4f\n", distanceInMiles);
    }
}
