package ex_04_Operators;

public class Lab056_Interview_Short_Char {
    static void main(String[] args) {
        short s = 10;
        char c = 'A'; // ASCII A -> 65
        System.out.println(c + s); // Char is int // 75
        char c1 = 'a'; //ASCII a -> 97
        System.out.println(c1 + s); // 107
    }
}
