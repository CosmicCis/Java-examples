package DateAndTime;
import java.util.*;
import java.util.Calendar;

public class addTimeToDateInJava {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        Calendar cl = Calendar. getInstance();
        cl.setTime(d1);
        System.out.println("сегодня " + d1.toString());
        cl. add(Calendar.MONTH, 1);
        System.out.println("дата через месяц будет " + cl.getTime().toString() );
        cl. add(Calendar.HOUR, 70);
        System.out.println("дата после 7 часов будет " + cl.getTime().toString() );
        cl. add(Calendar.YEAR, 3);
        System.out.println("дата через 3 года будет " + cl.getTime().toString() );
    }
}
