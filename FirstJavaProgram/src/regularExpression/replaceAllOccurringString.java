package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class replaceAllOccurringString {
	/*
Problem Description
How to replace all occurring of a string?

Solution
Following example demonstrates how to replace all occurrence of a String in a String using replaceAll() method of Matcher class.
Этот код демонстрирует, как заменить все вхождения одной строки в другую строку с использованием метода replaceAll() класса Matcher. В этом примере исходная строка - "hello hello hello.", и мы хотим заменить все вхождения подстроки "hello" на "Java". Мы создаем объект класса Pattern с регулярным выражением, которое соответствует строке "hello". Затем мы создаем объект класса Matcher для нашей строки и вызываем метод matcher(), чтобы получить экземпляр Matcher для нашей строки. Затем мы вызываем метод replaceAll() на экземпляре Matcher и передаем новую строку "Java" в качестве параметра. Результатом является новая строка, где все вхождения "hello" заменены на "Java".
	*/
	public static void main(String args[]) {
		Pattern p = Pattern.compile("hello");
		String instring = "hello hello hello.";
		System.out.println("initial String: "+ instring);
		Matcher m = p.matcher(instring);
		String tmp = m.replaceAll("Java");
		System.out.println("String after replacing 1st Match: "+tmp);
	}
}
