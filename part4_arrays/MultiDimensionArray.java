package javafoundation.part4_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {

    public static void main(String[] args){

        /*
         syntax -
         datatype[][] name = new datatype [row_size][column_size]; //number of rows are mandatory
         */
        // a 2D array is actually an array of arrays
        int[][] rollnumber = new int[3][3];

        int[][] rolls = {
                {2,3,4},
                {5,6,7},
                {8,9,0}
        };
        System.out.println(Arrays.deepToString(rolls)); //[[2, 3, 4], [5, 6, 7], [8, 9, 0]]


        // Irregular (Jagged) Arrays - You can also have rows of different lengths:
        int[][] jagged = {
                {1, 2}, // 0th index jagged[0]
                {3, 4, 5}, // 1st index ,, 4--->> jagged[1][1]
                {6} // 2nd index
        };

        // INPUT && OUTPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("how many rows you want?");
        int rows = sc.nextInt();
        System.out.println("how many cols you want?");
        int cols = sc.nextInt();


        int[][] arr = new int[rows][cols];
        // arr.length will give number of row
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++){ //  arr[index].length ---> number of column in that row
                arr[row][col] = sc.nextInt();
               System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // after every row print new line

        }
        System.out.println(Arrays.deepToString(arr));
        /*
         3x3
        - input ==>>> 1 2 3 4 5 6 7 8 9
        -output
        1 2 3
        4 5 6
        7 8 9
        [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
         */

        System.out.println(Arrays.toString(arr)); // [[I@1be6f5c3, [I@6b884d57, [I@38af3868]
        // Because arr is a 2D array — i.e.,
        // an array of arrays — and Arrays.toString() just prints each sub-array as an object reference, not their contents.
        //  Why deepToString()? -  Because it recursively prints nested arrays (multi-dimensional) in readable form.



        for (int row = 0; row < arr.length; row++) {  // would not worked for jagged array- column different for each row
            System.out.println(Arrays.toString(arr[row]));
        }
        // output
        /*
        [1, 2, 3]
        [4, 5, 6]
        [7, 8, 9]
         */

        //foreach
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        // same output as above



    }
}
