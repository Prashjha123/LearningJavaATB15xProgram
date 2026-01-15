package ATB15X_Exam;

import java.util.Scanner;

/**
 * ReverseNumber
 * -------------
 * This program reverses a given integer number
 * using a do-while loop.
 */

public class ReverseNumber {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int originalNumber = number; // Keep the original number for display
        int reversedNumber = 0;

        // Reverse the number using do-while loop
        do {
            int digit = number % 10;       // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit
            number = number / 10;          // Remove last digit
        } while (number != 0);

        // Display result
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}
