/*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2;*/

import java.util.Arrays;

public class arr_2 {
    public static void main(String[] args) {
        int[] arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] *= 2;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
