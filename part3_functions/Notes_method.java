package javafoundation.part3_functions;

import java.util.Scanner;

public class Notes_method {
    public static void main(String[] args){
        product(5, 10);
        //You don’t need to define everything inside main(),
        // but you must call things from inside main() if you want them to run when the program starts.
        // Without calling your method from main(), it will never run, even if it's defined outside main().

        int ans = sum();
        //a method can return a value — which means after the method finishes running,
        // it sends back a result that can be used elsewhere in the program.
        System.out.println("The answer using void i.e. using return is : " + ans);


        System.out.println(greeting("Tushar"));
    }


    static void product(int a, int b){ //If a method does not return anything, we use the keyword void.
        int product = a * b;
        System.out.println("The product is: " + product);
    }

    //return the value:
    static int sum(){ // if we are returning, then return type required "e.g" int
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;
        return sum;
        //      System.out.println("this statement will never execute because it is after return ");
    }

    static String greeting(String name){
        return "hello" +' ' + name +", How are you?";
    }


}

