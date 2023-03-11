package regularExpression;
import java.util.regex.Pattern;

public class splitRegularExpression2 {
	/*
Problem Description
How to split a regular expression?

Solution
Following example demonstrates how to split a regular expression by using Pattern.compile() method and patternname.split() method of regex.Pattern class.
Данный код демонстрирует проверку формата электронных адресов с помощью регулярных выражений в языке программирования Java. Он создает список адресов электронной почты и затем проходится по ним в цикле, проверяя каждый адрес на соответствие регулярному выражению.

Регулярное выражение, используемое для проверки, задано строковой переменной regex и имеет следующий формат: "^(.+)@(.+)$". Это выражение гласит, что электронный адрес должен содержать символ "@" и что до этого символа может быть любая последовательность символов, а после - любое количество символов, включая точки и дефисы.

Для проверки каждого адреса электронной почты используется класс Pattern из пакета java.util.regex. Сначала создается объект класса Pattern, который компилирует регулярное выражение в объект Pattern. Затем для каждого адреса создается объект Matcher, который проверяет, соответствует ли адрес регулярному выражению.

Результат проверки выводится на экран с помощью метода System.out.println(). Если адрес соответствует регулярному выражению, метод matcher.matches() вернет значение true, иначе - false.	*/
	public static void main(String a[]) {
		String s1 = "Learn how to use regular expression in Java programming. Here are most commonly used example";
		Pattern p1 = Pattern.compile("(use|Java|are|use)");
		String[] parts = p1.split(s1);

		for(String p:parts) {
			System.out.println(p);
		}
	}
}
