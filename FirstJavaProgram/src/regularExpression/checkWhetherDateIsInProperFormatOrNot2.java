package regularExpression;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class checkWhetherDateIsInProperFormatOrNot2 {
	/*
Problem Description
How to check whether date is in proper format or not?

Solution
Following example demonstrates how to check whether the date is in a proper format or not using matches method of String class.
Данный код на Java проверяет, соответствует ли дата правильному формату. Для этого задается список дат, которые нужно проверить, и регулярное выражение, которое определяет правильный формат даты.

Затем для каждой даты из списка выполняется следующее: создается объект Pattern с помощью регулярного выражения, а затем для данной даты вызывается метод matcher(), который создает объект Matcher для данной строки с помощью ранее созданного объекта Pattern. Затем вызывается метод matches(), который возвращает значение true, если строка соответствует шаблону регулярного выражения, и false в противном случае.

Результат проверки выводится на консоль для каждой даты в виде "дата : true/false".
	*/
	public static void main(String args[]) {
		List dates = new ArrayList();
		dates.add("25/12/19190");
		dates.add("25/12/19190");
		dates.add("12/12/190");
		dates.add("05/02/19190");
		String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
		Pattern pattern = Pattern.compile(regex);

		for(Object date : dates) {
			Matcher matcher = pattern.matcher((CharSequence) date);
			System.out.println(date +" : "+ matcher.matches());
		}
	}
}
