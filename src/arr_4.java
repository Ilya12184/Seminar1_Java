//Задать одномерный массив и найти в нем минимальный и максимальный элементы

import java.util.Arrays;

public class arr_4 {
    public static void main(String[] args) {
        int[] arr4 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxim = arr4[1];
        int minim = arr4[1];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i]>maxim) maxim = arr4[i];
            if (arr4[i]<minim) minim = arr4[i];
        }
        System.out.println(Arrays.toString(arr4));
        System.out.println("Максимальный элемент: " + maxim);
        System.out.print("Минимальный элемент: " + minim);
    }
}
