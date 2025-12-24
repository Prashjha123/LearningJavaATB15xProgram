package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    static void main(String[] args) {
        int course = 100;
        float NSRT_GST = 18.45f;
//        int total = course + NSRT_GST; // Narrowing - Implicit - Not allowed
//        int total = course + (int)NSRT_GST; // Narrowing - Explicit -Allowed
//        System.out.println(total); // output - 118, 0.45 is lost

        float total2 = course + NSRT_GST; // Widening - Implicit -Allowed
        float total3 = (float)course + NSRT_GST; // Widening - Explicit -Allowed,But Not Required
        System.out.println(total2);
        System.out.println(total3);

//        Flow/order of Widening: byte -> short -> int -> long -> float -> double

    }
}
