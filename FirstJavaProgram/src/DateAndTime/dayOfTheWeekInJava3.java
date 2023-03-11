package DateAndTime;

import java.text.DateFormatSymbols;

public class dayOfTheWeekInJava3 {
    public static void main(String[] args) {
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] dayNames = dfs.getWeekdays();
        dayNames[0] = "Monday";
        dfs.setWeekdays(dayNames);

        System.out.println("The week starts on Monday: ");
        for (int i = 0; i < dayNames.length; i++) {
            System.out.println(dayNames[i]);
        }
    }
}