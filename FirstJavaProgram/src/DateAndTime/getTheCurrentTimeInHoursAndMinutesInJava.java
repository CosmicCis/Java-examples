package DateAndTime;

import java.util.Calendar;
import java.util.Formatter;

public class getTheCurrentTimeInHoursAndMinutesInJava {
    /*
    В этом примере показано, как вывести текущее время в часах и минутах в Java с помощью Calender.getInstance() класса Calender.
     */
    public static void main(String args[]) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt = new Formatter();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);
    }
}
