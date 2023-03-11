package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class knowLastIndexParticularWordInString {
	/*
Problem Description
How to know the last index of a particular word in a string?

Solution
Following example demonstrates how to know the last index of a particular word in a string by using Patter.compile() method of Pattern class and matchet.find() method of Matcher class.
Данный код написан на языке Java и выполняет следующую задачу: нахождение последнего индекса вхождения определенного слова в строке.

Код начинается с определения строки candidateString, которая содержит два вхождения слова "Java". Затем создается экземпляр класса Pattern, который компилирует регулярное выражение "Java". Это выражение указывает, что мы ищем слово "Java" в строке.

С помощью метода matcher() класса Pattern создается объект Matcher, который используется для сопоставления регулярного выражения с исходной строкой. Затем метод find() вызывается на объекте Matcher для поиска первого вхождения "Java" в строке.

С помощью метода end() объекта Matcher можно получить индекс, следующий за последним совпадением в строке. Таким образом, код выводит последний индекс вхождения "Java" в строке.

На выходе программа выводит сообщение "The last index of Java is:", за которым следует последний индекс вхождения слова "Java" в строке.
	*/
	public static void main(String args[]) {
		String candidateString = "This is a Java example.This is another Java example.";
		Pattern p = Pattern.compile("Java");

		Matcher matcher = p.matcher(candidateString);
		matcher.find();
		int nextIndex = matcher.end();

		System.out.print("The last index of Java is:");
		System.out.println(nextIndex);
	}
}
