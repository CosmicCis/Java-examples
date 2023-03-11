package DateAndTime;
import java.util.Calendar;
import java.util.Formatter;

public class getTheNameAndNumberOfTheCurrentMonthInMMMFormatInJava {
    /*
    В этом примере показано, как отобразить в Java текущий месяц в формате (МММ) с помощью метода Calender.getInstance() класса Calender и метода fmt.format() класса Formatter.
     */

    public static void main(String args[]) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);
    }

}
