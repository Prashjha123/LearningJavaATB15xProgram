package ex_03_Literals;

public class Lab034_Char_Literals {
    static void main(String[] args) {
        char c1 = 'A';
//        A to Z, a to z, !@#$%^^&**()
//        char c = "A"; String - "" - bunch of char
//        char c0 = 'AB'; This is a String
        char c2 = 'B';
        System.out.println(c2);
        char c3 = '@';
        char c4 = '*';
        char c5 = ' '; // blank space is also a character

//        Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PrashiJha");
        System.out.println("Prashi"+new_line+"Jha");
        System.out.println("Prashi\nGullu");
        System.out.println("Niva"+tab_line+"Jha");
        System.out.println("Akash"+back_space+"Kumar");
        System.out.println(new_line);
        System.out.println("PRASHI"+carriage_return+"JHA");
//        Carriage return delete the previous word


        char my_laugh_silly = '\u1f60';
//        emoji can also be entered as Literals
        System.out.println(my_laugh_silly);

        int binary = 0b1010;
        int hex = 0xFF;
        long amount = 1_00_000L;
        // Instead of , we can also use _ in long
        System.out.println(amount);


//        char c = 'A';
//        ASCII value of A is 65, but if we print it will get A only
    }
}
