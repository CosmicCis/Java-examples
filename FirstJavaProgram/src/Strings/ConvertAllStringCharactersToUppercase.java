package Strings;

public class ConvertAllStringCharactersToUppercase {
    /*
    Следующий пример изменяет регистр строки на верхний с помощью строкового метода toUpperCase().
     */
    public static void main(String[] args) {
        String str = "делаем все буквы заглавными";
        String strUpper = str.toUpperCase();
        System.out.println("Оригинал строки: " + str);
        System.out.println("Изменение строки в верхний регистр: " + strUpper);
    }
}
