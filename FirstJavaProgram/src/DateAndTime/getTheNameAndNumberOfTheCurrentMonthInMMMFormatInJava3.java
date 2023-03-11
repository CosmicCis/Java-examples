package DateAndTime;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class getTheNameAndNumberOfTheCurrentMonthInMMMFormatInJava3 {
    /*
    В этом примере показано, как отобразить в Java текущий месяц в формате (МММ) с помощью метода Calender.getInstance() класса Calender и метода fmt.format() класса Formatter.
     */

    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("MMM");
        SimpleDateFormat f1 = new SimpleDateFormat("dd");
        SimpleDateFormat f2 = new SimpleDateFormat("a");
        int h;

        if(Calendar.getInstance().get(Calendar.HOUR)== 0)h = 12;
        else h = Calendar.getInstance().get(Calendar.HOUR);

        String filename="Текущая дата: "
                +f1.format(new Date())
                +f.format(new Date())
                +h+f2.format(new Date());
        System.out.println(filename);

    }

}
