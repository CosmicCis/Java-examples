package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class findTheMinimumAndMaximumNumberInTheArray2 {
    /*
    Еще один пример поиска минимального и максимального элементов в массиве.
     */
    public static void main(String[] args) {
        int numbers[] = new int[]{8, 2, 7, 1, 4, 9, 5};
        int s = numbers[0];
        int l = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > l)l = numbers[i];
            else if (numbers[i] < s)s = numbers[i];
        }
        System.out.println("Максимум: " + l);
        System.out.println("Минимум: " + s);
    }
}
