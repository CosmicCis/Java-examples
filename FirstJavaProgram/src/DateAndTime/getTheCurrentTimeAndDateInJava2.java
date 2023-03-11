package DateAndTime;

import java.util.Date;

public class getTheCurrentTimeAndDateInJava2 {
    /*
        В этом примере показано, как вывести текущую дату и время с помощью метода Calender.getInstance() класса Calender и метода fmt.format() класса Formatter.
     */
    public static void main(String args[]) {
        Date d = new Date();
        System.out.println(d.toString());
    }
}
