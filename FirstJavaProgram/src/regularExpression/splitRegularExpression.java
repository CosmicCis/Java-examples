package regularExpression;
import java.util.regex.Pattern;
public class splitRegularExpression {
	/*
Problem Description
How to split a regular expression?

Solution
Following example demonstrates how to split a regular expression by using Pattern.compile() method and patternname.split() method of regex.Pattern class.
Данный код на языке программирования Java выполняет разбиение строки на подстроки с помощью регулярного выражения " ".

Сначала создается объект класса Pattern с использованием метода compile, который принимает в качестве параметра регулярное выражение " ". Это регулярное выражение соответствует пробелу, по которому будет производиться разбиение строки.

Затем создается строка "tmp", которая содержит несколько слов, разделенных пробелами.

Вызывается метод split() объекта Pattern, который разбивает строку на подстроки с использованием регулярного выражения. Результат сохраняется в массиве строк "tokens".

Затем выполняется цикл по элементам массива "tokens". В каждой итерации цикла выводится очередная подстрока на консоль.

В данном примере на экран будут выведены следующие строки:

this
is
the
Java
example
	*/
	public static void main(String args[]) {
		Pattern p = Pattern.compile(" ");
		String tmp = "this is the Java example";
		String[] tokens = p.split(tmp);

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
