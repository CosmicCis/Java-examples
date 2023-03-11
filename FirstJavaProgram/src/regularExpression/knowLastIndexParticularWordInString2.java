package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class knowLastIndexParticularWordInString2 {
	/*
Problem Description
How to know the last index of a particular word in a string?

Solution
Following example demonstrates how to know the last index of a particular word in a string by using Patter.compile() method of Pattern class and matchet.find() method of Matcher class.
Данный код написан на языке Java и выполняет следующую задачу: нахождение последнего индекса вхождения определенного слова в строке.
Данный код на языке Java написан для того, чтобы найти последний индекс вхождения определенного слова в строке.

В данном примере мы ищем последний индекс вхождения слова "GitHub" в строке "GitLab". Для этого мы создаем объект класса Pattern, который представляет собой регулярное выражение, которое будет использоваться для поиска в строке. Затем мы создаем объект Matcher, который будет использоваться для поиска совпадений в строке.

Для поиска последнего вхождения мы используем метод find() объекта Matcher, который ищет следующее вхождение шаблона, начиная с текущей позиции. Поскольку мы ищем последнее вхождение, то после каждого найденного совпадения мы обновляем переменную nextIndex значением m1.end(), которое представляет собой индекс конца совпадения.

В конце мы выводим в консоль найденный индекс с помощью метода System.out.println(). Если в строке нет совпадений, то будет выведено значение 0.
	*/
	public static void main(String args[]) {
		String s1 = "GitLab";
		Pattern p1 = Pattern.compile("GitHub");

		Matcher m1 = p1.matcher(s1);
		m1.find();
		int nextIndex = m1.end();

		System.out.print("The last index is:");
		System.out.println(nextIndex);
	}
}
