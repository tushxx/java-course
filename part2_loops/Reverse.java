package javafoundation.part2_loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String reverse = "";
        // or you can do
        // int reverse = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            reverse = reverse + rem;
            // here you do
            // reverse = reverse * 10 + rem;
        }
        System.out.println(reverse);
    }

}
