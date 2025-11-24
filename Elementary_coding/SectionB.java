import java.util.Scanner;

public class SectionB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Is Prime?
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean prime = true;
        if (n <= 1) prime = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime");

        // 2. Factorial
        System.out.print("Enter number: ");
        int f = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= f; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);

        // 3. Nth Fibonacci
        System.out.print("Enter N: ");
        int fibN = sc.nextInt();
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= fibN; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Fibonacci = " + (fibN == 0 ? a : b));

        // 4. Nth prime number
        System.out.print("Enter N: ");
        int k = sc.nextInt();
        int count = 0, num = 2;
        while (true) {
            boolean isPrime = true;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
            if (count == k) {
                System.out.println("Nth prime = " + num);
                break;
            }
            num++;
        }

        // 5. Count primes in a range
        System.out.print("Start: ");
        int s = sc.nextInt();
        System.out.print("End: ");
        int e = sc.nextInt();
        int pc = 0;
        for (int i = s; i <= e; i++) {
            boolean pr = true;
            if (i <= 1) continue;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    pr = false;
                    break;
                }
            }
            if (pr) pc++;
        }
        System.out.println("Prime count = " + pc);

        // 6. Count digits
        System.out.print("Enter number: ");
        int d = sc.nextInt();
        int temp = d, cd = 0;
        while (temp > 0) {
            cd++;
            temp /= 10;
        }
        System.out.println("Digit count = " + cd);

        // 7. Count unique digits
        temp = d;
        int[] freq = new int[10];
        while (temp > 0) {
            freq[temp % 10]++;
            temp /= 10;
        }
        int unique = 0;
        for (int val : freq) if (val == 1) unique++;
        System.out.println("Unique digits = " + unique);

        // 8. Count non-repeated digits
        int nonRepeated = 0;
        for (int val : freq) if (val == 0) nonRepeated++;
        System.out.println("Non-Repeated digits = " + nonRepeated);

        // 9. digitSum – total sum of digits
        temp = d;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Digit sum = " + sum);

        // 10. digitSum Even only
        temp = d;
        int evenSum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) evenSum += digit;
            temp /= 10;
        }
        System.out.println("Even digit sum = " + evenSum);

        // 11. digitSum Odd only
        temp = d;
        int oddSum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) oddSum += digit;
            temp /= 10;
        }
        System.out.println("Odd digit sum = " + oddSum);

        // 12. digitSum Opt – choose even or odd
        System.out.print("Type 1 for even sum or 2 for odd sum: ");
        int op = sc.nextInt();
        temp = d;
        int finalSum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (op == 1 && digit % 2 == 0) finalSum += digit;
            if (op == 2 && digit % 2 != 0) finalSum += digit;
            temp /= 10;
        }
        System.out.println("Final sum = " + finalSum);

        sc.close();
    }
}
