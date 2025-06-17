package javafoundation.part1;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        // here even if we give input as integer it will convert it automatically to float
        // i.e. 18 --->> 18.0
        // but it should be compatible with it, not like we gave input as string and it will convert it into float- NO
        // that means destination type should be greater than source that
        // float contains integer also and decimal also therefore, float is greater than int
        // but if we say
        int num2 = input.nextInt();
        // and here we give float or decimal number then we will get error

        // SO TO CONVERT FLOAT TO INTEGER AUTOMATICALLY - TYPE CASTING
        int num3 = (int)(24.55);
        System.out.println(num3); //24

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)a; // max value byte can have is 256
        System.out.println(b);  // --> 1 (we get remainder)

        byte a2 = 40;
        byte b2 = 50;
        byte c2 = 100;
        int d  = a2 * b2 / c2;
        System.out.println(d); // 20
        // here a2 * b2 exceeds the range of byte still we are getting output while doing sometime operation it converts it into integer

        //here we will get error because we are assigning operation again to byte
//        byte b3 = 20;
//        b3 = b3 + 20


        int numChar = 'a';
        System.out.println(numChar); // 97


        // conversion rules example
        byte t = 42;
        char c = 'a';
        short s  = 1024;
        int i = 50000;
        float f = 5.67f;
        double e = 0.12356;
        double result = (f * t) + ( i / c) - (e - s);
        System.out.println((f * t) + " " + ( i / c) + " " + (e - s)); // 238.14  515  -1023.87644
        // float + int - double = double
        System.out.println(result); // 1777.0164546484375
    }
}
