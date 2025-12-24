package ex_05_TypeCasting;

public class Lab061_Extra_Example_Char {
    static void main(String[] args) {
        char ch = 'A';
        int ascii = ch; // Widening - char into int- Allowed

        int num = 66;
        char letter = (char) num; // Narrowing - int/num into char - Allowed

        System.out.println(ascii);
        System.out.println(letter);
    }
}
