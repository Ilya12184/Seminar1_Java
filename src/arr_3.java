/*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицам*/

public class arr_3 {
    public static void main(String[] args) {
        int[][] arr3 = new int[4][4];
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr3.length; j++) {
                if (i == j) arr3[i][j] = 1;
                else arr3[i][j] = 0;
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.print("\b\b]");
            System.out.println();
        }
        System.out.println();
    }
}
