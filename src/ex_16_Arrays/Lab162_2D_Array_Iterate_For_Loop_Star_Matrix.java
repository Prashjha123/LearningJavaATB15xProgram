package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop_Star_Matrix {
    static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) { // rows
            for (int j = 0; j < matrix[i].length; j++){ //columns
                System.out.print("*" +"|");
            }
            System.out.println("");
        }
    }

}
