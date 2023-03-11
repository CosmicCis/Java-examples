package Strings;

public class splitAStringIntoCharactersInAnArray {
    /*
    Следующий пример показывает как разбить строку на массив по символу. Для этого просто преобразуем строку в массив с помощью метода toCharArray().
     */
    public static void main(String args[]) {
        String str = "разбить строку на буквы";
        char[] strToArray = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        // Вывод массива на экран
        for(int i = 0; i < strToArray.length; i++) {
            System.out.print(strToArray[i] + " "); // Для наглядности вставим пробел между индексами
        }
    }
}
