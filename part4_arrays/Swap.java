package javafoundation.part4_arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        SwapNo(arr, 1, 3); // [1, 4, 3, 2, 5]
        System.out.println(Arrays.toString(arr)); // here it is happening because arrays are mutable

        reverse(arr); //[5, 2, 3, 4, 1]
    }

    static void SwapNo(int[] arr, int index1, int index3) {
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length- 1;

        // swap
        while(start < end){
            SwapNo(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
