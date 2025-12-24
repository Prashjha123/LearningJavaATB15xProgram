package ex_06_Ternary$Conditional_Operator;

public class Lab067_CLI_Maxof3no {
    static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int result = (n1 > n2) ? n1 : ((n2 > n3) ? n2 : n3);
        System.out.println("MAX OUT OF THREE: "+result);

    }
}
