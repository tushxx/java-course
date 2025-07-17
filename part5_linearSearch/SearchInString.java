package javafoundation.part5_linearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "tushar";
        char target = 'u';

        System.out.println(CharSearch(name, target));
    }


    static boolean CharSearch(String str, char target){

        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
