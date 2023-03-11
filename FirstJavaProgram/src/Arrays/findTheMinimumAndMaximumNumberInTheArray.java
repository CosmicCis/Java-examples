package Arrays;
import java.util.Collections;
import java.util.Arrays;

public class findTheMinimumAndMaximumNumberInTheArray {
    /*
    В этом примере показано, как найти минимальное и максимальное число в массиве в Java с помощью методов Collection.max() и Collection.min() класса Collection.
     */
    public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
