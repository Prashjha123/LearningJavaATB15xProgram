package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    static void main(String[] args) {
        long phone = 987654321L;
//        short s = phone; // Narrowing - implicit - Not allowed
        short s1 = (short) phone; // Narrowing - Explicit - Allowed
        System.out.println(s1);
//        same concept as Lab059 - converted to binary and only 8 bits are considered
//        8 bits are converted to decimal again hence, 26801

    }
}
