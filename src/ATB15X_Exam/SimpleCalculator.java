package ATB15X_Exam;

import java.util.Scanner;

/**
 * SimpleCalculator
 * ----------------
 * This program performs basic arithmetic operations
 * (addition, subtraction, multiplication, division)
 * based on the user's choice using a switch statement.
 */

public class SimpleCalculator {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Display menu
        System.out.println("\nSelect operation:");
        System.out.println("1 - Addition (+)");
        System.out.println("2 - Subtraction (-)");
        System.out.println("3 - Multiplication (*)");
        System.out.println("4 - Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double result;

        // Perform operation based on choice
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select 1-4.");
        }

        scanner.close();
    }
}
