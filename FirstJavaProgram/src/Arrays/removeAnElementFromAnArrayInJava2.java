package Arrays;

import java.util.ArrayList;

public class removeAnElementFromAnArrayInJava2 {
    /*
    В следующем примере показано удаление из массива в Java.
     */
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(5);
        arr.add(20);
        arr.add(15);
        arr.add(30);
        arr.add(45);

        System.out.println("Размер списка: " + arr.size());
        for (Object number : arr) {
            System.out.println("Число = " + number);
        }
        arr.remove(2);
        System.out.println("Теперь размер списка: " + arr.size());

        for (Object number : arr) {
            System.out.println("Число = " + number);
        }
    }
}