package ex_05_TypeCasting;

public class Lab057_TypeCasting_0 {
    static void main(String[] args) {

        byte b = 10;
        int a = b; // Valid syntax - Implicit - Casting Widening - JVM/ JAVA

//        boolean f = b; // Incompatible data type is not possible

        int a1 = (int)b; // Valid syntax - Explicit - Widening


    }
}
