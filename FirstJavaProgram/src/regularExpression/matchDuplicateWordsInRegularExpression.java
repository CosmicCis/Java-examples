package regularExpression;
import java.util.Scanner;
import java.io.*;
import java.util.regex.*;
import java.util.ArrayList;
public class matchDuplicateWordsInRegularExpression {
	/*
Problem Description
How to match duplicate words in a regular expression?

Solution
Following example shows how to search duplicate words in a regular expression by using p.matcher() method and m.group() method of regex.Matcher class.
Данный код на Java демонстрирует, как искать повторяющиеся слова в регулярном выражении.

Сначала создаются два списка: "manyLines" и "noRepeat", где "manyLines" содержит много строк, а "noRepeat" будет содержать эти строки без повторяющихся слов.

Затем, в блоке "try", строка "s1" инициализируется определенной строкой, а затем входной поток Scanner считывает каждую строку и разделяет ее на строки с помощью метода split(). Затем строки добавляются в список "manyLines", но только в том случае, если они не пустые.

Далее, если список "manyLines" не пустой, то оригинальный текст печатается в консоль с помощью цикла for.

Далее, если список "manyLines" не пустой, каждая строка проходит через метод replaceAll(), где с помощью регулярного выражения "(?i)\b([a-z]+)\b(?:\s+\1\b)+" и метода "$1" удаляются все повторяющиеся слова. Строки без повторяющихся слов затем добавляются в список "noRepeat".

Наконец, если список "noRepeat" не пустой, то каждая строка печатается в консоль с помощью цикла for.
	*/
	public static void main(String[] args) {
		ArrayList <String> manyLines = new ArrayList<String>();
		ArrayList <String> noRepeat = new ArrayList<String>();
		try {
			String s1 = "Hello hello Hello there there past pastures ";
			Scanner myfis = new Scanner(s1);
			while(myfis.hasNext()) {
				String line = myfis.nextLine();
				String delim = System.getProperty("line.separator");
				String [] lines = line.split(delim);

				for(String s: lines) {
					if(!s.isEmpty() && s != null) {
						manyLines.add(s);
					}
				}
			}
			if(!manyLines.isEmpty()) {
				System.out.print("Original text is:\n");
				for(String s: manyLines) {
					System.out.println(s);
				}
			}
			if(!manyLines.isEmpty()) {
				for(String s: manyLines) {
					String result = s.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
					noRepeat.add(result);
				}
			}
			if(!noRepeat.isEmpty()) {
				System.out.print("After Remove duplicates:\n");
				for(String s: noRepeat) {
					System.out.println(s);
				}
			}
		} catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
