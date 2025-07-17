package javafoundation.part4_arrays;

import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 8, 6};

        System.out.println(Max(arr));

    }

    static int Max(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}


