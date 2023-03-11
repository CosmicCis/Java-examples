package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class findEveryOccuranceOfWord {
	/*
Problem Description
How to find every occurance of a word?

Solution
Following example demonstrates how to find every occurance of a word with the help of Pattern.compile() method and m.group() method.
Этот Java-код демонстрирует, как найти все вхождения слова в тексте, используя метод Pattern.compile() и метод m.group() из класса Matcher. Код начинается с объявления строки candidate, в которой хранится исходный текст. Затем в строке regex задается регулярное выражение для поиска слова, состоящего из букв 'a' и последующих букв и цифр. Для компиляции регулярного выражения используется метод Pattern.compile(). Результат компиляции сохраняется в объекте Pattern p.

Затем создается объект Matcher m, который ассоциируется с исходным текстом candidate и регулярным выражением regex. Запускается цикл, в котором метод m.find() находит следующее вхождение регулярного выражения в исходном тексте. Если такое вхождение находится, то метод m.group() извлекает найденный текст в строку val и выводит ее на экран с помощью метода System.out.println(). Цикл продолжается, пока не будут найдены все вхождения слова в тексте.

Если ни одно вхождение не найдено, то на экран выводится сообщение "NO MATCHES".
	*/
	public static void main(String args[]) throws Exception {
		String candidate = "this is a test, A TEST.";
		String regex = "\\ba\\w*\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(candidate);

		String val = null;
		System.out.println("INPUT: " + candidate);
		System.out.println("REGEX: " + regex + "\r\n");

		while (m.find()) {
			val = m.group();
			System.out.println("MATCH: " + val);
		}
		if (val == null) {
			System.out.println("NO MATCHES: ");
		}
	}
}
