package ex_04_Operators;

public class Lab049_All_Operators {
    static void main(String[] args) {
        boolean b1 = true;

        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println( a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

//        Compound Assignment Operator
        int age = 10;
       // age += 10; // age = age + 10 = 10 + 10 = 20
       // age -= 10; // 0
        age /= 10; // 1
        System.out.println(age);

//        int a = -100
//        int a1 = +110
//        This is unary operator

//    BITWISE Operator
//        Never used in automation testing
//        ~ - Bitwise NOT
//        >> - Right shift
//        << - Left shift
//        ^ - XOR
    }
}
