package javafoundation.part1;

public class primitive {
    public static void main(String[] args) {
        int roll_no = 59;
        char gender = 'M';
        float marks = 98.99f;
        double largeDecimalNumbers = 456767.8967786;
        long largeIntegerNumbers = 933387653543211111L;
        boolean check = true;

        int a = 234_000_000;
        System.out.println(a); //-> 234000000
        //a is identifier and value is litreal

        //string is not primitive
        String name = "tushar shirke";
        System.out.println(name);

        /*
        Types of Literals in Java
        - Integral Literals
        - Floating-Point Literals
        - Char Literals
        - Boolean Literals
        - null
        - String Literals  //string is literal but not primitive data type
                    // because string is class/object it have methods like --> .length(), .charAt()
         */

    }
}
