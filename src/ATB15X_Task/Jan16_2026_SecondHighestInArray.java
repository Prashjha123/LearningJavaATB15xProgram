package ATB15X_Task;

public class Jan16_2026_SecondHighestInArray {
    static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                secondHighest = highest;
                highest = numbers[i];
            } else if (numbers[i] > secondHighest && numbers[i] != highest) {
                secondHighest = numbers[i];
            }
        }

        System.out.println("Second Highest Number: " + secondHighest);
    }
}
