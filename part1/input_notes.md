## Scanner 
is a class in Java (from the java.util package) that is used to read input from various sources:
-Keyboard (System.in)
-Files
-Strings

## System.in
System.in is a built-in input stream in Java.
It represents standard input, usually the keyboard.

## The Problem:

-nextInt(), nextDouble(), etc. don’t consume the newline after you hit Enter.
-nextLine() reads until it finds that newline.
-So after any nextInt() or similar method, always use nextLine() once to clear the buffer before using nextLine() again.

✅ The Fix:
Add an extra input.nextLine(); after nextInt() to consume the leftover newline:

 ``` System.out.print("please enter your Roll no: ");
int rollno = input.nextInt();
input.nextLine(); // <-- consume the leftover newline 


System.out.println("please enter your name: ");
String name = input.nextLine();

``` System.out.println("Your Roll no is : " + rollno);
System.out.println("Your name is : " + name);
```


## Type Casting

- float num = input.nextFloat();
- System.out.println(num);

 here even if we give input as integer it will convert it automatically to float
 i.e. 18 --->> 18.0
 but it should be compatible with it, not like we gave input as string and it will convert it into float- NO
 that means destination type should be greater than source that
 float contains integer also and decimal also therefore, float is greater than int
 but if we say

-int num2 = input.nextInt();
// and here we give float or decimal number then we will get error

// SO TO CONVERT FLOAT TO INTEGER AUTOMATICALLY - TYPE CASTING
-int num3 = (int)(24.55);
-System.out.println(num3); //24


## 🔹 Java Type Promotion Rules:
Smaller types are promoted to larger types:
byte, short, and char are promoted to int during arithmetic operations.
If one operand is long, the result is promoted to long.
If one is float, the result is float.
If one is double, the result is double.

Character promotion:
'A' + 1 promotes 'A' to its ASCII (Unicode) int value (65), then adds.

Mixed types promotion:
```
byte b = 10;
int i = 5;
int result = b + i; // b promoted to int
``` 

Promotion hierarchy:
``` byte → short → int → long → float → double```