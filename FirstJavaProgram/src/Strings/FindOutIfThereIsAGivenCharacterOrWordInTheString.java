package Strings;

public class FindOutIfThereIsAGivenCharacterOrWordInTheString {
    /*
    Ниже продемонстрирован пример, который позволяет в Java узнать присутствует ли данный символ или слово в строке.
     */
    public static void main(String[] args) {
        String str = "Привет, java-программист!";
        System.out.println("Слово \"программист\" есть в строке str? Ответ: " + str.contains("программист"));
        System.out.println("Символ \"б\" присутствует в строке str? Ответ: " + str.contains("б"));
    }
}
