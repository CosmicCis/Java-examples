package DateAndTime;
import java.text.SimpleDateFormat;
import java.util.Date;
public class timeFormattingInAMPMFormat {
    /*
    В этом примере время форматируется с помощью конструктора SimpleDateFormat("HH-mm-ss a") и метода sdf.format(date) класса SimpleDateFormat.
     */
    public static void main(String[] args){
        Date date = new Date();
        String strDateFormat = "HH:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
