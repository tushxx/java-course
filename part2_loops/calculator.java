package javafoundation.part2_loops;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input till user says Exit or exit

        int ans = 0;
        while(true){
            //take operator as an input
            System.out.println("\nWhich operation would you like to perform? (+, -, *, /, %)");
            System.out.println("Type Exit or exit to quit the calculator.");
            String choice = sc.next().trim();


            if (choice.equals("Exit") || choice.equals("exit")) {
                System.out.println("Calculator exited. Thank you!");
                break;
            }

            if (choice.equals("+") || choice.equals("-") || choice.equals("*") || choice.equals("/")) {
                // == can't be used in strings
                // we need to write .equals("")
                //take 2 numbers as input
                System.out.print("Enter first number:");
                int num1 = sc.nextInt();
                System.out.print("Enter second number:");
                int num2 = sc.nextInt();

                if (choice.equals("+")) {
                    ans = num1 + num2;
                }
                else if (choice.equals("-")) {
                    ans = num1 - num2;
                }
                else if (choice.equals("*")) {
                    ans = num1 * num2;
                }
                else if (choice.equals("/")) {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by 0.");
                        continue;
                    }
                }
                else if (choice.equals("/")) {
                    ans = num1 % num2;
                }
                System.out.println(ans);
            }
        }
    }
}
