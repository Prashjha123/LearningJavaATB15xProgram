package ATB15X_Exam;

import java.util.Scanner;
/**
 * MonthNameFinder
 * ----------------
 * This program prints the month name based on a number (1-12)
 * entered by the user using a switch statement.
 */

public class MonthNameFinder {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month number
        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        String monthName;

        // Determine month name using switch
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number! Please enter a number between 1 and 12.";
        }

        // Output result
        System.out.println(monthName);

        scanner.close();
    }

}
