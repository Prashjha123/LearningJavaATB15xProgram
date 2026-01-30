package ex_22_OOPs__Ecap_AccessModifer.police;

public class Rahul extends ex_22_OOPs__Ecap_AccessModifer.police.Cop {

    public Rahul(int bullet) {
        super(bullet);
    }

    public static void main(String[] args) {
        Cop rahul  = new Cop(100);
        rahul.canIShoot();
        rahul.thisDefaultF1();
    }
}