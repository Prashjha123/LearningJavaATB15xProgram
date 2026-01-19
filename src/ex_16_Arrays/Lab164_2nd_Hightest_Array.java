package ex_16_Arrays;

public class Lab164_2nd_Hightest_Array {
    static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 45, 89};
        int highest = 0;
        int secondHighest = 0;
        // 67
        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }

        }
        System.out.println(secondHighest);
    }
}
