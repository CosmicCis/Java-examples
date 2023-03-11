package Arrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class mergeTwoArraysIntoOne {
    /*
    В этом примере показано, как объединить два массива в один массив с помощью метода list.Addall(array1.asList(array2) класса List и метода Arrays.toString() класса Array.
     */
    public static void main(String args[]) {
        String a[] = { "А", "Б", "В" };
        String b[] = { "Г", "Д" };
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
