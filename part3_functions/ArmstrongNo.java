package javafoundation.part3_functions;

import java.util.Scanner;

public class ArmstrongNo {

    // A number is an Armstrong number if the sum of the nth power of each digit equals the number itself,
    // where 'n' is the number of digits.
    // in simple language if a each digit in a number is raised to power of number of digit present then sum of those will be same as number

    // e.g. 153 = total digit => 3
    // 1^3 + 5^3 + 3^3 = 153
    // 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        isArmstrong(n);

    }

    static void isArmstrong(int n) {
        int original = n; // Store original value for comparison
//        int count = String.valueOf(n).length(); // number of digits

        int count = countDigits(n); // Optimized digit counting without string conversion
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            int raised = (int) Math.pow(rem, count);
            sum += raised;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Number is an Armstrong number");
        } else {
            System.out.println("Number is not an Armstrong number");
        }
    }

    // Optimized digit counting without string conversion
    static int countDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

}
