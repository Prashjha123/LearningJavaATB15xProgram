package ex_16_Arrays;

public class Lab149_Arrays {
    static void main(String[] args) {

        int a = 10;
        int marks[] = {91, 92, 96, 85, 56};
        int[] marks2 = {91, 92, 96, 85, 56};

        boolean[] is_married_people = {true, false, true};
        String [] names = {"Prashi", "Akash", "Jha"};
      //  String [] names = {"Prashi", "Akash", 34};
        // Not Allowed- different DataTypes

        float[] values = new float[3];
        values[0] = 3.14f;
        values[1] = 4.14f;
        values[2] = 5.14f;
//        values[0] = 6.14f; ArrayIndexOutOfBound Exception

        for(String name: names){
            System.out.println(name);
        }


    }
}
