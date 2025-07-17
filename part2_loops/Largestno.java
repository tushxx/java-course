package javafoundation.part2_loops;

import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a 3 number & find largest of them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > a ) {
            max = b;

            if (c > b) {
                max = c;
            }
        }
        System.out.println("largest number is : " + max);

        //simplest
        int max2 = Math.max(c, Math.max(a, b));
        System.out.println("largest number is : " + max2);

    }
}
