package ATB15X_Exam;

import java.util.Scanner;

/**
 * PositiveNegativeZeroChecker
 * ----------------------------
 * This program determines whether a given number
 * is positive, negative, or zero using the ternary operator.
 */

public class PositiveNegativeZeroChecker {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check using nested ternary operator
        String result = (number > 0) ? "Positive"
                : (number < 0) ? "Negative"
                : "Zero";

        // Output result
        System.out.println("The number is: " + result);

        scanner.close();
    }
}
