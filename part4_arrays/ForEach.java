package javafoundation.part4_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of object
        System.out.println("how many elemets you want in String array?");
        int n = sc.nextInt();

        String[] names = new String[n];
        for(int i = 0; i < n; i++){  // i < numArr.length
            names[i] = sc.next();
        }
        System.out.println(Arrays.toString(names));

        for(String name : names){
            System.out.print(name + " ");
        }

        names[n-2] = "gargee";
        System.out.print(Arrays.toString(names));
    }
}
