package javafoundation.part_3_2_assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int num = input.nextInt();

        System.out.println(factorial(num));
    }

    static int factorial(int n){

        if (n == 0 || n == 1){
            System.out.println(1);
        }
        int  fact = 1;
        for(int i=1;i<=n;i++){
           fact = fact * i;

        }
        return fact;
    }
}
