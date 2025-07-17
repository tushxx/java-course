package javafoundation.part5_linearSearch;

public class basic {
    public static void main(String[] args){
            int[] nums = {22, 44, 55, 66};
        System.out.println(linearsearch(nums, 44));
    }


    // search in the array : return the index if item found else return -1
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){

                return index;

            }
        }
        return -1;
    }
}
