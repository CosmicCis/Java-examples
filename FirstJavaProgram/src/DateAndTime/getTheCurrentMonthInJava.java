package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getTheCurrentMonthInJava {
    /*
       В этом примере месяц форматируется с помощью конструктора SimpleDateFormat('MMMM') и метода sdf.format(date) класса SimpleDateFormat.
     */
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        System.out.println("Текущий месяц в формате MMMM: " + sdf.format(date));
    }
}
