public class Main {
    public static void main(String[] args) {

        System.out.println(isSumBetween10and20(5, 10));
        System.out.println(isSumBetween10and20(5, 25));

        System.out.println();
        System.out.println(isPositive(5));
        System.out.println(isPositive(-10));

        System.out.println();
        printString("abcd", 3);

        System.out.println();
        System.out.println(isLeapYear(1996));

        System.out.println();
        printArrayInConsole(createArray(3, 5));
    }

    // проверить, что сумма a и b лежит между 10 и 20
    private static boolean isSumBetween10and20(int a, int b){
        int res = a+b;
        if(res > 10 && res<20) return true;
        else return false;
    }

    // проверить, что х положительное
    private static boolean isPositive(int x){
        if(x>=0) return true;
        else return false;
    }

    // напечатать строку source repeat раз
    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(source);
        }
    }

    // проверить, является ли год високосным. если да - return true
    private static boolean isLeapYear(int year) {
        if(year%4 == 0) return true;
        else return false;
    }

    // должен вернуть массив длины len, каждое значение которого равно initialValue
    private static int[] createArray(int len, int initialValue) {
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

}