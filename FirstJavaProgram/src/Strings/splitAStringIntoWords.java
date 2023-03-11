package Strings;

public class splitAStringIntoWords {
    /*
    Ниже продемонстрирован пример, который позволяет в Java разбить строку на слова.
     */
    public static void main(String[] args) {
        String str = "разбить строку на слова";
        String[] words = str.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        // Вывод на экран
        for(String subStr:words) {
            System.out.println(subStr);
        }
    }
}
