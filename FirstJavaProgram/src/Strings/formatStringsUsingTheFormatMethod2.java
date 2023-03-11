package Strings;

public class formatStringsUsingTheFormatMethod2 {
    /*
    Ниже приведен еще один пример форматирования строк в Java.
    */
    public static void main(String[] args) {
        String name = "Привет мир";
        String s1 = String.format("имя %s", name);
        String s2 = String.format("значение %f", 32.33434);
        String s3 = String.format("значение %32.12f", 32.33434);
        System.out.print(s1);
        System.out.print("\n");
        System.out.print(s2);
        System.out.print("\n");
        System.out.print(s3);
        System.out.print("\n");
    }
}