package DateAndTime;

import java.util.Calendar;
import java.util.Formatter;

public class getTheCurrentTimeAndDateInJava {
    /*
        В этом примере показано, как вывести текущую дату и время с помощью метода Calender.getInstance() класса Calender и метода fmt.format() класса Formatter.
     */
    public static void main(String args[]) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("%tc", cal);
        System.out.println(fmt);
    }
}
