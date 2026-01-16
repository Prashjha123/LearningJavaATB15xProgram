package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();

        String[] numbers_marks = new String[size];

        for(int i = 0; i < numbers_marks.length; i++){
            System.out.println("Enter the marks");
            numbers_marks[i] = scanner.next();
        }

        System.out.println("======================================================");

        for(int i = 0; i < numbers_marks.length; i++){
            System.out.println(numbers_marks[i]);
        }
    }
}
