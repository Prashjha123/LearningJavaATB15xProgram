package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    static void main(String[] args) {
        String first_name = "Prashi";
        String last_name = "Jha";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
//        JVM goes from left to right
//        it will do concat of int also
//        PrashiJha1010
//        If first time it will work as concat then second time it will work as concat

        System.out.println(a + b + first_name + last_name);
//        20PrashiJha
//        Math + Concat

        System.out.println(first_name + last_name + (a + b));
//        PrashiJha20

//        BODMAS -> Bracket of Div, Mul, Add, Sub
    }
}
