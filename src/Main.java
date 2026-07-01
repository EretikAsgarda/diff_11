public class Main {
    public static void main(String[] args) {

        //---------------------Задача 1-2
        int[] intArray1 = new int[3];
        intArray1[0] = 1;
        intArray1[1] = 2;
        intArray1[2] = 3;
        // Вывод всех массивов для проверки
        System.out.print("intArray: [");
        for (int i = 0; i < intArray1.length; i++) {
            System.out.print(intArray1[i]);
            if (i < intArray1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Массив дробных чисел (double), сразу заполненный значениями
        double[] doubleArray2 = {1.57, 7.654, 9.986};
        // Вывод всех массивов для проверки
        System.out.print("doubleArray: [");
        for (int i = 0; i < doubleArray2.length; i++) {
            System.out.printf("%.3f", doubleArray2[i]);
            if (i < doubleArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //  Произвольный массив: массив строк из 4 элементов
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Java";
        stringArray3[1] = "массивы";
        stringArray3[2] = "обучение";
        stringArray3[3] = "примеры";
        // Вывод всех массивов для проверки
        System.out.print("stringArray: [");
        for (int i = 0; i < stringArray3.length; i++) {
            System.out.print(stringArray3[i]);
            if (i < stringArray3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

//---------------------Задача 3
// 1. Целочисленный массив из 3 элементов, созданный через new
        int[] intArray4 = new int[3];
        intArray4[0] = 1;
        intArray4[1] = 2;
        intArray4[2] = 3;

        // Вывод intArray в обратном порядке
        for (int i = intArray4.length - 1; i >= 0; i--) {
            System.out.print(intArray4[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(); // переход на новую строку

        // 2. Массив дробных чисел (double), сразу заполненный значениями
        double[] doubleArray5 = {1.57, 7.654, 9.986};

        // Вывод doubleArray в обратном порядке
        for (int i = doubleArray5.length - 1; i >= 0; i--) {
            System.out.printf("%.3f", doubleArray5[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // 3. Произвольный массив: массив строк из 4 элементов
        String[] stringArray6 = new String[4];
        stringArray6[0] = "Java";
        stringArray6[1] = "массивы";
        stringArray6[2] = "обучение";
        stringArray6[3] = "примеры";

        // Вывод stringArray в обратном порядке
        for (int i = stringArray6.length - 1; i >= 0; i--) {
            System.out.print(stringArray6[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

//---------------------Задача 4
        // 1. Целочисленный массив из 3 элементов
        int[] intArray7 = new int[3];
        intArray7[0] = 1;
        intArray7[1] = 2;
        intArray7[2] = 3;

        // Делаем все нечётные числа чётными (прибавляем 1)
        for (int i = 0; i < intArray7.length; i++) {
            if (intArray7[i] % 2 != 0) {          // если число нечётное
                intArray7[i] = intArray7[i] + 1;   // прибавляем 1, чтобы стало чётным
            }
        }

        // Вывод преобразованного массива
        System.out.print("Преобразованный intArray: [");
        for (int i = 0; i < intArray7.length; i++) {
            System.out.print(intArray7[i]);
            if (i < intArray7.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 2. Массив дробных чисел (double)
        double[] doubleArray8 = {1.57, 7.654, 9.986};
        System.out.print("doubleArray: [");
        for (int i = 0; i < doubleArray8.length; i++) {
            System.out.printf("%.3f", doubleArray8[i]);
            if (i < doubleArray8.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 3. Массив строк
        String[] stringArray9 = new String[4];
        stringArray9[0] = "Java";
        stringArray9[1] = "массивы";
        stringArray9[2] = "обучение";
        stringArray9[3] = "примеры";
        System.out.print("stringArray: [");
        for (int i = 0; i < stringArray9.length; i++) {
            System.out.print(stringArray9[i]);
            if (i < stringArray9.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}