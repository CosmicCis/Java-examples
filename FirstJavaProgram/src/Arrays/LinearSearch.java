package Arrays;

public class LinearSearch {
    /*
    В следующем примере показан поиск элемента массива с использованием в Java линейного поиска.
     */
    public static void main(String[] args) {
        int[] a = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int target = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("Элемент массива найден по индексу " + i);
                break;
            }
        }
    }
}