package javafoundation.part4_arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimenArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        // Add  empty rows
        for (int i = 0; i < rows; i++) {
            list.add(new ArrayList<>()); // creates a empty rows
        }

        // Add elements to each row
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter number of columns in row " + i + ": ");
            int columns = sc.nextInt();
            for (int j = 0; j < columns; j++) {
                list.get(i).add(sc.nextInt());
                //list.get(i)   // Gets the i-th row (which is an ArrayList)
                //.add(...)     // Adds a value at the END of that row (not at a specific index)
            }
        }

        for(ArrayList<Integer> row : list){
            System.out.println(row);
            // o/p= [1, 2]
            //      [3, 4]
        }

        System.out.println(list); // [[1, 2], [3, 4]]
    }
}
