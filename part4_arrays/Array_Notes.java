package javafoundation.part4_arrays;

import java.util.Arrays;

public class Array_Notes {
    public static void main(String[] args){

        // Syntax
        //datatype[] arrayName = new datatype[size];  // Preferred
        // datatype arrayName[];  // Also valid

        //'new' is used to create an object

        // all the type of data in the array should be same

        int[] marks = new int[5]; // Creates an array of size 5
        // default values = 0 or null
        marks[0] = 95;             // Assigning values individually

        // Or directly:
        int[] marks2 = {95, 85, 76, 89, 100}; // ✅
        /* When you declare and initialize an array in a single line,
           Java understands you're creating a new array and infers the type and size automatically.

           It’s syntactic sugar for:
           int[] marks_2 = new int[]{95, 85, 76, 89, 100}; // 👈🏻👈🏻👈🏻 same as above not need to write all if declaring and initializing in one line

         */


        int[] marks3;       // Declared — okay ,,,,,declaration of array; marks3 is getting defined in stack

        /*  marks3 = {1, 2, 3}; // ❌ Error: Not allowed!
        Why it's invalid:
        - The syntax {1, 2, 3} is only allowed during declaration.
        - If you're assigning later, you must use:
         */

        // int[] marks3;
        marks3 = new int[]{1, 2, 3}; // ✅ Correct // Initialization --actually here object is being created in heap


        /*
        Memory Allocation: Stack vs Heap 👈🏻👈🏻👈🏻
       - marks (the reference) is stored in the stack.
       - The actual array ([95, 85, 76, 89, 100]) is created in the heap.
       - The reference marks points to the memory location of that array in the heap.

        Fixed Size
       - Once the array is created, its size cannot change.
       - Java allocates a contiguous block of memory in the heap to hold the elements. for primitive arrays
       //////\\\\\✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅


          'No' – for arrays of objects or references
           -  names array holds references, not actual String objects.
           -  These references are stored contiguously.
           -  But the actual strings like "Tushar", "Amit" are objects in random places in heap — not guaranteed to be side-by-side.
         */




        int[] marks4 = {3, 4, 5, 6, 7};
        marks4[3] = 90;

        // you cant directly print array in java as you did in javascript,
        System.out.println(Arrays.toString(marks4)); // [3, 4, 5, 90, 7]
        System.out.println(marks4); // [I@27716f4
       /*  What does [I@27716f4 mean?
       -  [ → It's an array.
       -  I → Type of array (I = integer array).
       -  @27716f4 → Hexadecimal hash code of the object’s memory address (from Object.toString()).
       -  marks4 is just printing the reference address, not the actual contents.
       */




    }
}
