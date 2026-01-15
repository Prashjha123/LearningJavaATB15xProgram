package ATB15X_Exam;

import java.util.Scanner;

/**
 * ExplicitTypeCastingWithInput
 * -----------------------------
 * This program accepts a double value from the user,
 * converts it into an int using explicit type casting,
 * and also demonstrates rounding.
 */

public class ExplicitTypeCastingExample {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input double value
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Explicit type casting (truncation)
        int castedValue = (int) doubleValue;

        // Rounding before casting
        int roundedValue = (int) Math.round(doubleValue);

        // Output results
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Integer value after explicit casting: " + castedValue);
        System.out.println("Integer value after rounding: " + roundedValue);

        scanner.close();
    }
}