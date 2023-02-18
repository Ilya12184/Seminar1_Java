/*Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
условия заменить 0 на 1, 1 на 0; */

import java.util.Arrays;

public class arr_1 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) arr1[i] = 0;
            else arr1[i] = 1;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
