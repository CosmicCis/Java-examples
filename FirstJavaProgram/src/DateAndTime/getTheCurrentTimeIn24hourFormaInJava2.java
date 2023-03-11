package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getTheCurrentTimeIn24hourFormaInJava2 {
    /*
    В этом примере время форматируется в 24-часовой формат (00:00–24:00) с использованием метода sdf.format(date) класса SimpleDateFormat.
     */
    public static void main(String[] argv) throws Exception {
        Date d = new Date();
        SimpleDateFormat simpDate;
        simpDate = new SimpleDateFormat("kk:mm:ss");
        System.out.println(simpDate.format(d));
    }
}
