package Strings;

public class outputAnArrayInReverseOrder {
    /*
    Ниже продемонстрирован пример как вывести массив в обратном порядке в Java.
    */
    public static void main(String[] args) {
        String str = "Github";
        char[] reverseArray1 = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        System.out.print("1. Массив в обратном порядке: ");
        for (int i = reverseArray1.length-1; i >= 0; i--) System.out.print(reverseArray1[i]);

        double[] reverseArray2 = {1.2, 1.9, 11.4, 23.8};
        System.out.print("\n2. Массив в обратном порядке: ");
        for (int i = reverseArray2.length-1; i >= 0; i--) {
            System.out.print(reverseArray2[i] + " ");
        }
    }
}
