package Strings;

public class findACharacterOrWordInAString {
    /*
    Следующий пример показывает как найти символ или слово в строке в Java с помощью метода indexOf(). Метод вернет индекс первого вхождения, если символ или слово не будет найдено, то метод вернет -1.
     */
    public static void main(String[] args) {
        String str = "Привет, java-программист!";

        int indexM = str.indexOf("м"); // Нахождение символа в строке
        int indexJava = str.indexOf("java"); // Нахождение слова в строке

        if(indexM == - 1) {
            System.out.println("Символ \"м\" не найден.");
        } else {
            System.out.println("Символ \"м\" найден в индексе " + indexM);
        }

        if(indexJava == - 1) {
            System.out.println("Слово \"java\" не найдено.");
        } else {
            System.out.println("Слово \"java\" найдено в индексе " + indexJava);
        }
    }
}
