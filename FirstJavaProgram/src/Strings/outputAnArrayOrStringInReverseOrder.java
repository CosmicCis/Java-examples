package Strings;

public class outputAnArrayOrStringInReverseOrder {
    /*
    Следующий пример показывает как вывести строку в обратном порядке в Java, после взятия ее из аргумента командной строки. Программа буферизует входную строку с использованием метода StringBuffer(), реверсирует буфер и затем преобразует буфер в String с помощью метода toString().
     */
    public static void main(String[] args) {
        String str = "абвгдеёжзи";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nСтрока до реверса: " + str);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
    }
}
