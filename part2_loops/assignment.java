package javafoundation.part2_loops;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        // To calculate Fibonacci Series up to n numbers.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int prev1 = 1;
        int prev2 = 0;

        System.out.print(prev2 + " ");
        if (n == 1){
            return;
        }
        System.out.print(prev1 + " ");
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
            System.out.print(curr + " ");
        }

    }
}
