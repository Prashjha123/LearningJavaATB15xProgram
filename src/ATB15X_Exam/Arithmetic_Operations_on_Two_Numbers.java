package ATB15X_Exam;
import java.util.Scanner;

public class Arithmetic_Operations_on_Two_Numbers {
    static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Input two integers
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                // Arithmetic operations
                System.out.println("Sum: " + (a + b));
                System.out.println("Difference: " + Math.abs(a - b));
                // Math.abs will show result as positive
                System.out.println("Multiplication: " + (a * b));

                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                    System.out.println("Remainder: " + (a % b));
                } else {
                    System.out.println("Division and Remainder not possible (division by zero).");
                }

                sc.close();
            }
        }
