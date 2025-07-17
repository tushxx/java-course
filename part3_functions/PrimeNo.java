package javafoundation.part3_functions;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        isPrime(n);
    }

    static void isPrime(int n){
        if(n == 1){
            System.out.println( "1 is neither composite not prime");
            return;

        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                System.out.println(n + " is not Prime no.");
                return;

            }
            c ++;
        }
        System.out.println(n + " is Prime no.");
    }
}
