package ex_06_Ternary$Conditional_Operator;

public class Lab064_IQ_NestedTernaryOperator {
    static void main(String[] args) {
        int amol_age = 21;
        String result = amol_age > 18 ? (amol_age > 25 ? "You can drink" : "You can't drink") : "You cannot got to GOA" ;
        System.out.println(result);
    }
}
