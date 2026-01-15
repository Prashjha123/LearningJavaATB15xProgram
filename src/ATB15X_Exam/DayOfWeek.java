package ATB15X_Exam;

import java.util.Scanner;

/**
 * DayOfWeekPrinter
 * ----------------
 * This program prints the name of the day of the week
 * based on a number entered by the user (1 to 7).
 */

public class DayOfWeek {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input day number
        System.out.print("Enter a number (1-7) to get the day of the week: ");
        int dayNumber = scanner.nextInt();

        String dayName;

        // Determine day using switch
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid input! Please enter a number between 1 and 7.";
        }

        // Output result
        System.out.println(dayName);

        scanner.close();
    }
}
