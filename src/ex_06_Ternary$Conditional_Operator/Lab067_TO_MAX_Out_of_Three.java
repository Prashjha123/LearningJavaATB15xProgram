package ex_06_Ternary$Conditional_Operator;

public class Lab067_TO_MAX_Out_of_Three {
    static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int maxOutOfThree = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(maxOutOfThree);
    }
}
