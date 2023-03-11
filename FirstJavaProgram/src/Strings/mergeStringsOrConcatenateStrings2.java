package Strings;

public class mergeStringsOrConcatenateStrings2 {
    /*
    В следующем примере показана конкатенация строк в Java. Метод concat() возвращает строку со значением строки, переданной в метод и приложенной к концу строки, используемой для вызова этого метода. Проще говоря, этот метод объединяет строки, путем добавления одной строки в конец к другой.
     */
    public static void main(String[] args) {
        String s = "Привет";
        s = s.concat(" мир!");
        System.out.print(s);
    }
}
