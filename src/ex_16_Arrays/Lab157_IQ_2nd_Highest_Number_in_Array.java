package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_IQ_2nd_Highest_Number_in_Array {
    static void main(String[] args) {
int[] numbers = {12, 54, 10, 1, 100, 31, 6, 75};

          Arrays.sort(numbers);
//          Here sorting is done from min to max
          System.out.println(numbers[numbers.length-2]);


    }
}
