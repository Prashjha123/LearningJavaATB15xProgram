package ATB15X_Exam;

import java.util.Scanner;

public class Jan18_CountCharacters {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            // Exclude spaces
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Total number of characters (excluding spaces): " + count);

        sc.close();
    }
}
