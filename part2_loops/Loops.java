package javafoundation.part2_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
        for loop syntax :
        for (initialization; condition; increment/decrement){
                body
            }
        */
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int a =0; a < n; a++){
            System.out.println(a);
        }


        // while loop
        /*
        while (condition){
          //body- do this if true
        }
         */

        while(n >= 0){
            System.out.println(n);
            n--;
        }

        // do while
        int num = 6;
        do {
            System.out.println(num);
            return;
        }
        while(n < 5); // this is false but in do while loop atleast once output will be get then condition will be check
    }
}
