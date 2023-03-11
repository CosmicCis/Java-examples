package DateAndTime;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class getTheShortNameOfTheMonthInJava2 {
    /*
    В этом примере названия месяцев отображаются в краткой форме с помощью метода DateFormatSymbols().getShortMonths() класса DateFormatSymbols.
     */
    public static void main(String[] argv) throws Exception {
        String str1 = "dd-MMM-yy";
        Date d = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(str1, Locale.ENGLISH);
        System.out.println(sdf.format(d));
        sdf = new SimpleDateFormat(str1, Locale.ENGLISH);
        System.out.println(sdf.format(d));
    }
}
