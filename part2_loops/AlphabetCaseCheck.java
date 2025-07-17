package javafoundation.part2_loops;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

       char alpha = in.next().trim().charAt(0); //trim removes extra space

        if (alpha >= 'a' && alpha <= 'z') {
            System.out.println("first char is in Lowercase");
        }
        else{
            System.out.println("first char is in Uppercase");
        }
        


    }


}
