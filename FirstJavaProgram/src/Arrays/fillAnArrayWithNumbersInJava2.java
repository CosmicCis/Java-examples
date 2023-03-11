package Arrays;

import java.util.Arrays;

public class fillAnArrayWithNumbersInJava2 {
    /*
    В этом примере выполняется инициализация всех элементов массива с использованием метода Array.fill(имя_массива, значение) и метода Array.fill(имя_массива, начальный индекс, конечный индекс, значение) класса Java Util.
     */
    public static void main(String[] args) {
        // инициализация int массива
        int arr[] = new int[] {1, 6, 3, 2, 9};

        // давайте выведем значения
        System.out.println("Реальные значения: ");

        for (int value : arr) {
            System.out.println("Значение = " + value);
        }

        // используем fill() для заполнения значениями 18
        Arrays.fill(arr, 18);

        // давайте выведем значения
        System.out.println("Новые значения после использования метода fill(): ");

        for (int value : arr) {
            System.out.println("Значение = " + value);
        }
    }
}
