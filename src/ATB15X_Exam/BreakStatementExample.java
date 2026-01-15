package ATB15X_Exam;

/**
 * BreakStatementExample
 * ---------------------
 * This program prints numbers from 1 to 10,
 * but stops the loop when the number becomes 5
 * using the break statement.
 */

public class BreakStatementExample {
    static void main(String[] args) {
        System.out.println("Numbers from 1 to 10 (stop at 5):");

        for (int number = 1; number <= 10; number++) {
            if (number == 5) {
                // Stop the loop when number is 5
                break;
            }
            System.out.println(number);
        }
    }
}
