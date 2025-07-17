package javafoundation.part_3_2_assignment;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers separated by spaces: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println(max(a,b,c));
        System.out.println(min(a,b,c));

    }
    static String max(int a, int b, int c) {

        int max = a;
        if (b > a ) {
            max = b;

            if (c > b) {
                max = c;
            }
        }
        return "largest number is : " + max;
    }static String min(int a, int b, int c) {

        int min = a;
        if (b < a ) {
            min = b;

            if (c < b) {
                min = c;
            }
        }
        return "smallest number is : " + min;
    }


}
