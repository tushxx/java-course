package javafoundation.part3_functions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an two number to swap: ");
        int num1 = input.nextInt(); //10
        int num2 = input.nextInt(); //20


        System.out.println(swap(num1,num2)); // a = 20 b = 10
        System.out.println("a = "+num1+" b = "+num2); //a = 10 b = 20
        // in java there is no pass by reference; there is only pass by value.
//  Java passes everything by value.
//  For primitives: you get a copy of the value.
//  For objects: you get a copy of the reference (but not pass-by-reference).


    }

    static String swap(int a, int b){
        // Swap numbers code
        int temp = a;
        a = b;
        b = temp;

        return "a = "+a+" b = "+b;
    }
}
