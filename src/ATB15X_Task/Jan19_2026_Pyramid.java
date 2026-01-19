package ATB15X_Task;

public class Jan19_2026_Pyramid {
    static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // print leading spaces
            for (int s = i; s < rows; s++) {
                System.out.print(" ");
            }

            // print stars with space
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }
    }
}
