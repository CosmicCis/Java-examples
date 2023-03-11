package Strings;

import java.util.Locale;
/*
    В следующем примере возвращается отформатированное строковое значение с использованием определенного языкового стандарта, формата и аргументов метода format().
 */
public class formatStringsUsingTheFormatMethod {
    public static void main(String[] args){
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);
    }
}
