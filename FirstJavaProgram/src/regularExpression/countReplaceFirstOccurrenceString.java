package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class countReplaceFirstOccurrenceString {
	/*
Problem Description
How to count replace first occurrence of a String?

Solution
Following example demonstrates how to replace first occurrence of a String in a String using replaceFirst() method of a Matcher class.
Данный код на языке программирования Java заменяет первое вхождение строки "hello" в строке "hello hello hello." на строку "Java".

Сначала создается объект класса Pattern с использованием метода compile, который принимает в качестве параметра регулярное выражение "hello". Это регулярное выражение используется для поиска вхождений слова "hello" в строке.

Затем создается строка "instring", которая содержит три вхождения слова "hello". Создается объект класса Matcher, который используется для поиска вхождений регулярного выражения в строке "instring".

Метод replaceFirst() объекта Matcher используется для замены первого вхождения. Если вхождение найдено, то метод заменяет первое вхождение регулярного выражения на указанную строку "Java". Результат замены сохраняется в переменной "tmp".

Наконец, программа выводит исходную строку "instring" и строку, полученную после замены первого вхождения, на экран с помощью метода println(). В данном случае, на экран будет выведена строка "hello hello hello." и строка "Java hello hello.", так как только первое вхождение было заменено.
	*/
	public static void main(String args[]) {
		Pattern p = Pattern.compile("hello");
		String instring = "hello hello hello.";
		System.out.println("initial String: "+ instring);
		Matcher m = p.matcher(instring);
		String tmp = m.replaceFirst("Java");
		System.out.println("String after replacing 1st Match: " +tmp);
	}
}
