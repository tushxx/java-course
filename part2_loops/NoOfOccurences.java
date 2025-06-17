package javafoundation.part2_loops;

import java.util.Scanner;

public class NoOfOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int n = sc.nextInt();
        System.out.println("which number you want to check :");
        int num = sc.nextInt();
        int total = 0;
//        for(int i = 0; i < n.length(); i++) {
//            // Convert char at position i to int using Character.getNumericValue
//            if(Character.getNumericValue(n.charAt(i)) == num) {
//                total++;
//            }
//        }

        // second method
        while (n > 0) {
            // Get the last digit of the number using modulo operator
            int rem = n % 10;

            // If the last digit matches the number we're looking for, increase the count
            if (rem == num) {
                total++;
            }

            // Remove the last digit from the number by dividing by 10
            n = n / 10;

            //  number after removing the last digit (for debugging or understanding the flow)
            // System.out.println(n);  // Example: for 4454 → 445 → 44 → 4 → 0
        }
           // Print how many times the target digit was found in the original number
        //% 10 → Gives the last digit of the number.
        //10 → Removes the last digit from the number.

        System.out.println(total);


    }
}
