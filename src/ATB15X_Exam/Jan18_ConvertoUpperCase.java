package ATB15X_Exam;

import java.util.Scanner;

public class Jan18_ConvertoUpperCase {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upperStr = str.toUpperCase();

        System.out.println("String in uppercase: " + upperStr);

        sc.close();
    }
}
