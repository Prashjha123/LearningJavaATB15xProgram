package ATB15X_Exam;

import java.util.Scanner;

public class Jan18_CheckStringLength {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() > 10) {
            System.out.println("The string length is greater than 10.");
        } else {
            System.out.println("The string length is not greater than 10.");
        }

        sc.close();
    }
}
