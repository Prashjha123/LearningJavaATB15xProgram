package ex_02_Java_Basics;

import java.lang.classfile.attribute.SourceFileAttribute;

public class Lab024_printF {
    static void main(String[] args) {
//        System.out.println("It will add a new line");
//        System.out.print("It will NOT add a new line");
//        System.out.print(". It is printed on the same line");

//        souf = printF


//        System.out.printf(". Prashi This is a normal text");
//        System.out.printf("It is printed on the same line.");

        int a = 10;
//        System.out.println("Value of a is ->"+a);
//        System.out.println(a);

        System.out.printf("Value of a is %d", a);
//        %d -> int,byte, long, short, -data type
//        %s -> string
//        %f -> float
//        %b -> boolean
        System.out.println();
        int aa = 100;
        int bb = 121;
        System.out.printf("Formatting output aa = %d and b=%d", aa, bb);

        System.out.println();

        int table = 9;
        System.out.printf("%dX1=%d", table, table*1);

    }
}
