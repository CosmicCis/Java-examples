package Arrays;
import java.util.*;
public class fillAnArrayWithNumbersInJava {
    /*
    В этом примере выполняется инициализация всех элементов массива с использованием метода Array.fill(имя_массива, значение) и метода Array.fill(имя_массива, начальный индекс, конечный индекс, значение) класса Java Util.
     */
    public static void main(String args[]) {
        int array[] = new int[6];
        Arrays.fill(array, 100);

        for (int i = 0, n = array.length; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 3, 6, 50);

        for (int i = 0, n = array.length; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
