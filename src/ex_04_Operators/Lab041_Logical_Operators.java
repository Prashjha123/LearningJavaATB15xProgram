package ex_04_Operators;

public class Lab041_Logical_Operators {
    static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);
//        Same value as b will be printed

        boolean c = true || false;
//        OR operator 1 0 = 1
        System.out.println(c);

        boolean c1 = false && true;
//        AND operator 0,1 = 0
        System.out.println(c1);

    }
}
