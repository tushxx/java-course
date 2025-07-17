package javafoundation.part3_functions;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    //when we do not know how many inputs we are giving as parameter/ argument
    public static void main(String[] args) {


        varargs( 10, 20, 30, 40);
        multiple_varargs(4, 6, 8, new String[]{"hello", "world", "tushar"});

    }

    static void varargs(int ...a ){ //"a" is just name, it can be anything
        //internally it is taking as an array of integer, string, char, etc.

        System.out.println(Arrays.toString(a));
    }
    static void multiple_varargs(int a, int b, int c, String ...d ){
        System.out.println("Integers: " + a + ", " + b + ", " + c);
        System.out.println("Strings: " + Arrays.toString(d));
    }
}
