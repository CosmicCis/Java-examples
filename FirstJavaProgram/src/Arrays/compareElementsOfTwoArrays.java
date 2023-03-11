package Arrays;

public class compareElementsOfTwoArrays {
    /*
    В следующих примерах показано сравнение массивов в Java.
    Не правильное сравнение массивов
     */
    public static void main (String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};

        if (arr1 == arr2) System.out.println("Такой же");
        if (arr1 != arr2) System.out.println("Не то же самое");
    }
}
