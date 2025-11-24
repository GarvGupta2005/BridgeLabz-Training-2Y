import java.util.Scanner;

public class SectionA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Is Even?
        System.out.print("Enter number: ");
        int n1 = sc.nextInt();
        System.out.println(n1 % 2 == 0 ? "Even" : "Not Even");

        // 2. Is Odd?
        System.out.print("Enter number: ");
        int n2 = sc.nextInt();
        System.out.println(n2 % 2 != 0 ? "Odd" : "Not Odd");

        // 3. Return last digit
        System.out.print("Enter number: ");
        int n3 = sc.nextInt();
        System.out.println("Last digit: " + (n3 % 10));

        // 4. Second last digit
        System.out.print("Enter number: ");
        int n4 = sc.nextInt();
        System.out.println("Second last digit: " + ((n4 / 10) % 10));

        // 5. Sum of last digits of two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = (a % 10) + (b % 10);
        System.out.println("Sum of last digits = " + sum);

        // 6. Is N exact multiple of M?
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.println(N % M == 0 ? "Yes" : "No");

        // 7 – Count even from 5 numbers
        int evenCount = 0;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) evenCount++;
        }
        System.out.println("Total Even = " + evenCount);

        // 8 – Count odd from 5 numbers
        int oddCount = 0;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            if (x % 2 != 0) oddCount++;
        }
        System.out.println("Total Odd = " + oddCount);

        // 9 – Count both even and odd together
        int e = 0, o = 0;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) e++;
            else o++;
        }
        System.out.println("Even = " + e + ", Odd = " + o);

        sc.close();
    }
}
