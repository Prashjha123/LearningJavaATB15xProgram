package ATB15X_Exam;

/**
 * PrintEvenNumbersDoWhile
 * ------------------------
 * This program prints all even numbers between 1 and 50
 * using a do-while loop.
 */

public class PrintEvenNumbersDoWhile {
    static void main(String[] args) {
        int number = 2; // Start from the first even number

        System.out.println("Even numbers between 1 and 50:");

        // do-while loop to print even numbers
        do {
            System.out.print(number + " "); // Print number with a space
            number += 2; // Increment by 2 to get the next even number
        } while (number <= 50); // Continue while number is <= 50

        System.out.println(); // Move to the next line after printing all numbers
    }

}
