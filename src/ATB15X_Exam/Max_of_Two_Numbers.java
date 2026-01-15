package ATB15X_Exam;

import java.util.Scanner;

/**
 * MaximumOfTwoNumbers
 * -------------------
 * This program accepts two numbers from the user
 * and determines the maximum using the ternary operator.
 */

public class Max_of_Two_Numbers {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Find maximum using ternary operator
        int max = (num1 > num2) ? num1 : num2;

        // Output result
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);

        scanner.close();
    }
}
