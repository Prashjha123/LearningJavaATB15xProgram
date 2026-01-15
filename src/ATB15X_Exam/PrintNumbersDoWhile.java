package ATB15X_Exam;

/**
 * PrintNumbersDoWhile
 * --------------------
 * This program prints numbers from 1 to 10 using a do-while loop.
 */

public class PrintNumbersDoWhile {
    static void main(String[] args) {
        int number = 1; // Initialize starting number

        // do-while loop to print numbers from 1 to 10
        do {
            System.out.println(number);
            number++; // Increment number
        } while (number <= 10); // Continue while number is <= 10

    }
}
