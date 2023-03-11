package Arrays;
import java.util.Arrays;
public class compareElementsOfTwoArrays2 {
    /*
    В следующих примерах показано сравнение массивов в Java.
     */
    public static void main (String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};

        if (Arrays.equals(arr1, arr2)) System.out.println("Такой же");
        else System.out.println("Не то же самое");
    }
}
