package ex_02_Java_Basics;

public class Lab015_Variables {
    static void main(String[] args) {
//....
// data_type variable_name = variable_value
//......


//        variable - Local Variable (inside method)
        byte age_prashi = 28;
//        byte -> data type - type of container
//        age_prashi -> Variable Name | Identifier
//        = -> Assignment Operator
//        28 -> Variable Value | Literal
        age_prashi = 29;
        age_prashi =30;
        System.out.println(age_prashi);
//        only the latest value 30 is stored. hence it is printed. other values are out
    }
}
