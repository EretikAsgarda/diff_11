public class Main {
    public static void main(String[] args) {

        //---------------------Задача 1-2
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        // Вывод всех массивов для проверки
        System.out.print("intArray: [");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // Массив дробных чисел (double), сразу заполненный значениями
        double[] doubleArray = {1.57, 7.654, 9.986};
        // Вывод всех массивов для проверки
        System.out.print("doubleArray: [");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.printf("%.3f", doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //  Произвольный массив: массив строк из 4 элементов
        String[] stringArray = new String[4];
        stringArray[0] = "Java";
        stringArray[1] = "массивы";
        stringArray[2] = "обучение";
        stringArray[3] = "примеры";
        // Вывод всех массивов для проверки
        System.out.print("stringArray: [");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            if (i < stringArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");



//---------------------Задача 3
// 1. Целочисленный массив из 3 элементов, созданный через new
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        // Вывод intArray в обратном порядке
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(); // переход на новую строку

        // 2. Массив дробных чисел (double), сразу заполненный значениями
        double[] doubleArray = {1.57, 7.654, 9.986};

        // Вывод doubleArray в обратном порядке
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.printf("%.3f", doubleArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // 3. Произвольный массив: массив строк из 4 элементов
        String[] stringArray = new String[4];
        stringArray[0] = "Java";
        stringArray[1] = "массивы";
        stringArray[2] = "обучение";
        stringArray[3] = "примеры";

        // Вывод stringArray в обратном порядке
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

//---------------------Задача 4
        // 1. Целочисленный массив из 3 элементов
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        // Делаем все нечётные числа чётными (прибавляем 1)
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {          // если число нечётное
                intArray[i] = intArray[i] + 1;   // прибавляем 1, чтобы стало чётным
            }
        }

        // Вывод преобразованного массива
        System.out.print("Преобразованный intArray: [");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 2. Массив дробных чисел (double)
        double[] doubleArray = {1.57, 7.654, 9.986};
        System.out.print("doubleArray: [");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.printf("%.3f", doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 3. Массив строк
        String[] stringArray = new String[4];
        stringArray[0] = "Java";
        stringArray[1] = "массивы";
        stringArray[2] = "обучение";
        stringArray[3] = "примеры";
        System.out.print("stringArray: [");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            if (i < stringArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}