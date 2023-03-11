package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countGroupWordsInString2 {
	/*
Problem Description
How to count a group of words in a string?

Solution
Following example demonstrates how to count a group of words in a string with the help of matcher.groupCount() method of regex.Matcher class.
Данный код на языке программирования Java выполняет подсчет количества вхождений группы слов в строку с использованием класса Matcher из библиотеки regex.

Сначала определяется строка "s1" с содержимым "GitHub". Затем создается объект класса Pattern с использованием метода compile, который принимает в качестве параметра регулярное выражение "GitHub". Это регулярное выражение используется для поиска вхождений группы слов в строку.

Затем создается объект класса Matcher, который используется для поиска вхождений регулярного выражения в строку "s1". Метод find() объекта Matcher используется для поиска следующего вхождения. Если вхождение найдено, переменная "count" увеличивается на 1. Это продолжается до тех пор, пока все вхождения не будут найдены.

Наконец, программа выводит количество найденных вхождений в консоль с помощью метода println(). В данном случае, так как строка "s1" содержит только одно вхождение регулярного выражения "GitHub", на экран будет выведено число 1.
	*/
	public static void main(String[] args) {
		String s1 = "GitHub";
		Pattern pattern = Pattern.compile("GitHub");
		Matcher  matcher = pattern.matcher(s1);
		int count = 0;

		while (matcher.find())count++;
		System.out.println(count);
	}
}
