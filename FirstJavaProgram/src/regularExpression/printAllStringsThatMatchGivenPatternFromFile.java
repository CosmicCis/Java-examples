package regularExpression;
import java.util.regex.*;
import java.io.*;
public class printAllStringsThatMatchGivenPatternFromFile {
	/*
Problem Description
How to print all the strings that match a given pattern from a file?

Solution
Following example shows how to print all the strings that match a given pattern from a file with the help of Patternname.matcher() method of Util.regex class.

Данный код написан на языке Java и решает следующую задачу: необходимо вывести на экран все строки из файла, которые содержат подстроки, удовлетворяющие заданному шаблону. Шаблон задается регулярным выражением "[A-Za-z][a-z]+", которое означает: любая строка, начинающаяся с буквы верхнего или нижнего регистра, за которой следуют одна или более букв нижнего регистра.

Для выполнения задачи используется метод compile класса Pattern из библиотеки java.util.regex, который создает регулярное выражение для поиска совпадений. Далее, создается объект BufferedReader, который читает содержимое файла построчно. Затем, для каждой строки выполняется метод matcher созданного объекта Pattern для поиска всех вхождений, удовлетворяющих заданному шаблону.

Если совпадение найдено, то выполняется цикл while, в котором вызывается метод group(0) объекта Matcher для получения найденной строки. Также вычисляются начальный и конечный индексы совпадения с помощью методов start(0) и end(0) объекта Matcher. Затем, из исходной строки выбирается подстрока с помощью метода substring и выводятся на экран. Если совпадений в строке не найдено, то цикл while пропускается и переходит к следующей строке файла. По завершении чтения файла, метод завершается.
	*/
	public static void main(String[] args) throws IOException {
		Pattern p1 = Pattern.compile("[A-Za-z][a-z]+");
		BufferedReader r = new BufferedReader(new FileReader("abc.txt"));
		String line;

		while ((line = r.readLine()) != null) {
			Matcher m = p1.matcher(line);
			while (m.find()) {
				System.out.println(m.group(0));
				int s1 = m.start(0);
				int e1 = m.end(0);
				System.out.println(line.substring(s1, e1));
			}
		}
	}
}
