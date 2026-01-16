package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    static void main(String[] args) {

        int[] array = {25, 14, 56, 34, 77, 65};

//        Arrays.sort(array); Here sorting is done from min to max
//        System.out.println(array[array.length-1]);

        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);



    }
}
