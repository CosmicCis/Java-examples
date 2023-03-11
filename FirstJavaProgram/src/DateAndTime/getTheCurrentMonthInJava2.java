package DateAndTime;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class getTheCurrentMonthInJava2 {
    /*
       В этом примере месяц форматируется с помощью конструктора SimpleDateFormat('MMMM') и метода sdf.format(date) класса SimpleDateFormat.
     */
    public static void main(String[] argv) throws Exception {
        Format formatter = new SimpleDateFormat("MMMM");
        String s = formatter.format(new Date());
        System.out.println(s);
    }
}
