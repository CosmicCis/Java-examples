package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class flipArrayOrOutputArrayElementsInReverseOrder {
    /*
    В следующем примере переворачиваем элементы массива в Java с помощью метода Collections.reverse(ArrayList), т.е. выводим массив в обратном порядке.
     */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("А");
        arrayList.add("Б");
        arrayList.add("В");
        arrayList.add("Г");
        arrayList.add("Д");
        System.out.println("До обратного порядка: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("После обратного порядка: " + arrayList);
    }
}
