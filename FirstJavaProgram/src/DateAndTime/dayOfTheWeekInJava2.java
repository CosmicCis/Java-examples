package DateAndTime;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dayOfTheWeekInJava2 {
    /*
    Будние дни.
    В этом примере названия дней недели выводятся с помощью метода DateFormatSymbols().getWeekdays() класса DateFormatSymbols.
     */
    public static void main(String[] argv) throws Exception {
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE", Locale.US);
        String str = dateFormat.format(d);
        System.out.println(str);
    }
}
