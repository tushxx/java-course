package javafoundation.part4_arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

        // use when you dont how much size you want

        //syntax
        // Arraylist <wrapper_class> name = new ArrayList<>(initialCapacity); // initialCapacity can be anything
        /*
        Java’s ArrayList can only store objects, not primitives (like int, double, char, etc.).
        That’s because:
        - ArrayList is a generic class (ArrayList<E>)
        - It needs a reference type (E) — not a primitive.
        " that's why wwe write Integer not int "
         */



        ArrayList<Integer> numbers = new ArrayList<>(2);
        // This creates an ArrayList with initial capacity of 2 (just a suggestion for internal resizing) but allows unlimited elements.
        numbers.add(1);
        numbers.add(2);
        numbers.add(3); //...... you cann add as many you want
        System.out.println(numbers); // [1, 2, 3]

        System.out.println(numbers.contains(2)); //true
        System.out.println(numbers.get(1)); //2 -- > here (1) is index

        // System.out.println(numbers.remove(2)); //will remove object/element at specified index
        numbers.set(1, 4); // 1st index - set 4
        System.out.println(numbers); //[1, 4, 3]

        Scanner sc = new Scanner(System.in);
        for(int i=0;i < 5; i++){
            numbers.add(sc.nextInt());
        }
        System.out.println(numbers);

        for(Integer i : numbers){
            System.out.println(i); // will print every element in list
        }


        /* That creates an internal array of given size. But when you add more elements:
        ArrayList creates a bigger array (usually 1.5x or 2x size)
        copies all old elements to new array, and adds the new element.
        This resizing continues until your system runs out of memory (RAM/heap).
         */








        // you can also define arraylist without defining datatype but not good practice
       /*
        ArrayList marks = new ArrayList(10);
        marks.add(1);
        marks.add("tushar");

        🔴 Problem
        - You didn’t specify a type for the ArrayList — this means it becomes raw type.
        - But it also causes loss of type safety, and may lead to ClassCastException at runtime.
        - This allows adding any object (int, String, double, custom objects, etc.).
         */

    }
}
