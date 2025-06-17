package javafoundation.part1;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt());
        // this will just print integer input not string or any other
//        System.out.println(input.next());
        //this will print the string but only first word before space
        // if we want to print full line type "nextLine()"
        // input-- 456 hey world
        //output -- 456
        //          hey
        System.out.print("please enter your Roll no: ");
        int rollno = input.nextInt();

        //nextInt(), nextDouble(), etc. don’t consume the newline after you hit Enter.
        //nextLine() reads until it finds that newline.
        //So after any nextInt() or similar method, always use nextLine() once to clear the buffer before using nextLine() again.

        input.nextLine(); // add this line so after nextInt() code is being read

        System.out.print("please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hi, " + name + " your roll no is : " + rollno);
    }

}
