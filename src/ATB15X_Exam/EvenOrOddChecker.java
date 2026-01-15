package ATB15X_Exam;

import java.util.Scanner;

public class EvenOrOddChecker {
    static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Input number
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Check even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }

            scanner.close();
    }
}
