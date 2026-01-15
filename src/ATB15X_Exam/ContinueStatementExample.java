package ATB15X_Exam;

/**
 * ContinueStatementExample
 * ------------------------
 * This program prints numbers from 1 to 10,
 * but skips printing the number 5 using the continue statement.
 */

public class ContinueStatementExample {
    static void main(String[] args) {
        System.out.println("Numbers from 1 to 10 (skip 5):");

        for (int number = 1; number <= 10; number++) {
            if (number == 5) {
                // Skip the rest of the loop for number 5
                continue;
            }
            System.out.println(number);
        }
    }

}
