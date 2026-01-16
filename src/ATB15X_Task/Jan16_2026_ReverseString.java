package ATB15X_Task;

import java.util.Scanner;

public class Jan16_2026_ReverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}
