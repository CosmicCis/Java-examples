package DateAndTime;
import java.text.DateFormat;
import java.util.*;
public class displayTheTimeInTheFormatOfAnotherCountry {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("сегодня "+ d1.toString());
        Locale locItalian = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locItalian);
        System.out.println("сегодня на итальянском языке в швейцарском формате: "+ df.format(d1));
    }
}
