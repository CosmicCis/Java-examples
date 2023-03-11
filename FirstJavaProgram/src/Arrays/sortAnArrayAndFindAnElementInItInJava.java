package Arrays;

import java.util.Arrays;
public class sortAnArrayAndFindAnElementInItInJava {
    /*
    В следующем примере показано, как использовать методы sort() и binarySearch() для выполнения сортировки массива и поиска. Определенный пользователем метод printArray() используется для отображения вывода:
     */
    public static void main(String[] args) throws Exception {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("Отсортированный массив", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("Цифра 2 найдена по индексу " + index);
    }
    private static void printArray(String message, int array[]) {
        System.out.println(message + ": [длина: " + array.length + "]");

        for (int i = 0; i < array.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
