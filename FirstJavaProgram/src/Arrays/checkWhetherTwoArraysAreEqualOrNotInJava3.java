package Arrays;
import java.util.Arrays;

public class checkWhetherTwoArraysAreEqualOrNotInJava3 {
    /*
    В следующем примере показано, как использовать метод equals() для массивов, чтобы проверить равны ли два массива или нет в Java.
    Еще один пример сравнения массивов.
    Данный пример является ошибкой.
     */
    public static void main (String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};

        if (arr1 == arr2) System.out.println("Такой же");
        else System.out.println("Не то же самое");
    }
}
