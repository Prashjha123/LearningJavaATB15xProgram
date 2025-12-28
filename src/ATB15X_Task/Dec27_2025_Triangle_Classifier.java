package ATB15X_Task;

import java.util.Scanner;
public class Dec27_2025_Triangle_Classifier {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Equilateral → all three sides are equal
//Isosceles → exactly two sides are equal
//Scalene → all sides are different

        // Input side lengths
        System.out.print("Enter side 1: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double c = scanner.nextDouble();

        // Classify the triangle
        if (a == b && b == c) {
            System.out.println("The triangle is Equilateral.");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
        scanner.close();
    }
}
