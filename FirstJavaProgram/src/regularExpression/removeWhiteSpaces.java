package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class removeWhiteSpaces {
	/*
Problem Description
How to remove the white spaces?

Solution
Following example demonstrates how to remove the white spaces with the help matcher.replaceAll(stringname) method of Util.regex.Pattern class.
Данный код на языке Java решает следующую задачу: удаление пробелов из заданной строки.

В коде создается строковая переменная str, которая содержит исходную строку, в которой нужно удалить пробелы. Затем создаются две строковых переменные: pattern и replace. Переменная pattern содержит регулярное выражение для поиска пробелов, а переменная replace содержит строку для замены найденных пробелов.

С помощью метода Pattern.compile() создается объект класса Pattern, который содержит скомпилированное регулярное выражение. Затем создается объект класса Matcher, который будет использоваться для поиска пробелов в строке str.

Метод Matcher.replaceAll() заменяет все найденные пробелы в строке str на строку, указанную в переменной replace. Результат замены сохраняется обратно в переменную str.

Наконец, метод System.out.println() выводит на экран полученную строку без пробелов.
	*/
	public static void main(String[] argv) {
		String str = "This is a Java program. This is another Java Program.";
		String pattern="[\\s]";
		String replace = "";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		str = m.replaceAll(replace);
		System.out.println(str);
	}
}
