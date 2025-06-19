package javafoundation.part3_functions;

public class Method_overloading {
    // Method Overloading in Java means defining multiple methods in the same class with the same name but different parameter lists.
    public static void main(String[] args) {

        fun(30);
        fun("hello");


    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

//    ✅ Rules for Method Overloading:
//    You must change at least one of the following:
//    - Number of parameters
//    - Type of parameters
//    - Order of parameters (when types are different)
//    ❗ You cannot overload a method just by changing its return type.

    //When you call an overloaded method,
    // Java looks at the method signature (method name + parameter list) and matches it to the most specific version available.
    // This happens at compile time, not runtime.

}
