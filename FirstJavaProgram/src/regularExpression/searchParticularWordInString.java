package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class searchParticularWordInString {
	/*
	Problem Description
	How to search a particular word in a string?

	Solution
	Following example demonstrates how to search a particular word in a string with the help of matcher.start() method of regex.Matcher class.
Данный код на языке программирования Java выполняет поиск определенного слова в строке с использованием класса Matcher из библиотеки regex.

Сначала создается объект класса Pattern с использованием метода compile, который принимает в качестве параметра регулярное выражение "java". Это регулярное выражение используется для поиска вхождений слова "java" в строку.

Затем создается строка "candidateString", которая содержит два вхождения слова "java". Создается объект класса Matcher, который используется для поиска вхождений регулярного выражения в строку "candidateString".

Метод find() объекта Matcher используется для поиска следующего вхождения. Если вхождение найдено, то вызывается метод start() объекта Matcher, который возвращает индекс начала найденного вхождения.

Если вхождение найдено, программа выводит строку "candidateString" и индекс начала найденного вхождения в консоль с помощью метода println(). В данном случае, так как в строке "candidateString" содержится два вхождения слова "java", на экран будет выведен индекс первого вхождения, то есть число 10.

Если вхождение не найдено, программа выводит сообщение "No match found." в консоль.
	*/
	public static void main(String args[]) {
		Pattern p = Pattern.compile("java");
		String candidateString = "This is a java program. This is another java program.";
		Matcher matcher = p.matcher(candidateString);

		if (matcher.find()) {
			int nextIndex = matcher.start();
			System.out.println(candidateString);
			System.out.println("The index for java is:" + nextIndex);
		} else {
			System.out.println("No match found.");
		}
	}
}
