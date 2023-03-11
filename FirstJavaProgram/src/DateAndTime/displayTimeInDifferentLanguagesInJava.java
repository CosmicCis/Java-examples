package DateAndTime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class displayTimeInDifferentLanguagesInJava {
    /*
    В этом примере используется класс DateFormat для отображения времени на итальянском языке.
     */
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("сегодня "+ d1.toString());
        Locale locItalian = new Locale("it");
        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locItalian);
        System.out.println("сегодня "+ df.format(d1));
    }
}
