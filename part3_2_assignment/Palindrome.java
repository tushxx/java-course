package javafoundation.part_3_2_assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check whether it is a palindrome: ");
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));

    }

    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

        if (reverse == original) {
            return true;
        }
        return false;

    }
}
