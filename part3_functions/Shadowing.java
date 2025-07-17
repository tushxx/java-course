package javafoundation.part3_functions;

public class Shadowing {
    static int number = 10; // class-level variable
    static int a = 50; // class-level variable


    public static void main(String[] args) {
        show(); //here output will be
        // Number is: 20
        // a = 50
        // that means local scope/ variable shadows the class variable

        int a = 200;
        System.out.println(a); // 200
        show(); //Number is: 20 ;;;;  a = 50

//       System.out.println("shadowed number can be accessed using" + this.number); // but it cant be done in static method


    }
    static void show() {
        int number = 20; // local variable shadows the class variable
        System.out.println("Number is: " + number);
        System.out.println("a = "+ a ); // here "a" will be from class variable because it cant access main method scope variables
    }
}
