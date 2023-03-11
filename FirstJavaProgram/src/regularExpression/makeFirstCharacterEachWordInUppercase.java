package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class makeFirstCharacterEachWordInUppercase {
	/*
Problem Description
How to make first character of each word in Uppercase?

Solution
Following example demonstrates how to convert first letter of each word in a string into an uppercase letter Using toUpperCase(), appendTail() methods.
Данный код решает задачу изменения первой буквы каждого слова в строке на заглавную.

Создается строковая переменная str с исходной строкой и выводится на экран.
Создается объект StringBuffer для хранения результирующей строки.
Создается объект Matcher с помощью метода Pattern.compile, который принимает два аргумента: регулярное выражение и флаг CASE_INSENSITIVE (игнорирование регистра символов), и применяется к строке str.
Запускается цикл while, который находит все вхождения регулярного выражения в строку str с помощью метода find() объекта Matcher.
Для каждого найденного вхождения первый символ заменяется на заглавный с помощью метода toUpperCase(), а все остальные символы до следующего пробела (если они есть) заменяются на строчные с помощью метода toLowerCase().
Полученная строка заменяет найденное вхождение в исходной строке, используя метод appendReplacement() объекта Matcher.
После того, как все вхождения заменены, метод appendTail() объекта Matcher добавляет все оставшиеся символы из исходной строки в результирующую строку.
Результирующая строка выводится на экран.
	*/
	public static void main(String[] args) {
		String str = "this is a java test";
		System.out.println(str);
		StringBuffer stringbf = new StringBuffer();
		Matcher m = Pattern.compile(
				"([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);

		while (m.find()) {
			m.appendReplacement(
					stringbf, m.group(1).toUpperCase() + m.group(2).toLowerCase());
		}
		System.out.println(m.appendTail(stringbf).toString());
	}
}
