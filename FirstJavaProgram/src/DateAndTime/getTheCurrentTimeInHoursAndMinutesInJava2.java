package DateAndTime;

import java.util.Calendar;
import java.util.Formatter;

public class getTheCurrentTimeInHoursAndMinutesInJava2 {
    /*
    В этом примере показано, как вывести текущее время в часах и минутах в Java с помощью Calender.getInstance() класса Calender.
     */
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));
    }
}
