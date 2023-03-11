package Strings;

public class determineTheUnicodeCodeOfACharacterInAString {
    /*
    В этом примере показано, как использовать метод codePointBefore() для возврата символа (кодовой точки Юникода) перед указанным индексом.
     */
    public static void main(String[] args) {
        String test_string = "Добро пожаловать на GitHub";
        System.out.println("Тестируемая строка = "+test_string);

        System.out.println("Кодовая точка Юникода"
                +" в строке в позиции 5 = "
                +  test_string.codePointBefore(5));
    }
}
