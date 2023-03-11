package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class countGroupWordsInString {
	/*
Problem Description
How to count a group of words in a string?

Solution
Following example demonstrates how to count a group of words in a string with the help of matcher.groupCount() method of regex.Matcher class.
Данный код на языке Java демонстрирует, как подсчитать количество групп слов в строке с помощью метода matcher.groupCount() класса Matcher из библиотеки java.util.regex.

В данном примере создается объект Pattern с шаблоном "J(ava)", который будет искаться в строке. Затем создается строка candidateString, содержащая несколько вхождений этого шаблона. Создается объект Matcher, который будет искать соответствия шаблону в этой строке.

Далее вызывается метод groupCount() объекта Matcher, который возвращает количество групп слов в шаблоне. В данном случае, шаблон содержит одну группу слов "ava", которая заключена в скобки, поэтому метод вернет значение 1. Результат выводится в консоль с помощью метода System.out.println().
	*/
	public static void main(String args[]) {
		Pattern p = Pattern.compile("J(ava)");
		String candidateString = "This is Java. This is a Java example.";
		Matcher matcher = p.matcher(candidateString);
		int numberOfGroups = matcher.groupCount();
		System.out.println("numberOfGroups =" + numberOfGroups);
	}
}
