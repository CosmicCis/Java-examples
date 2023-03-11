package regularExpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeWhiteSpaces2 {
	/*
Problem Description
How to remove the white spaces?

Solution
Following example demonstrates how to remove the white spaces with the help matcher.replaceAll(stringname) method of Util.regex.Pattern class.
Данный код на языке Java решает задачу удаления всех пробелов из введенной пользователем строки.
Вначале пользователю предлагается ввести строку, которую нужно преобразовать.
Затем строка считывается с помощью объекта Scanner и сохраняется в переменной s1.
Далее вызывается метод replaceAll() для строки s1, в котором с помощью регулярного выражения "\s+" заменяются все подстроки, состоящие из одного или более пробелов, на пустую строку. Полученная преобразованная строка сохраняется в переменной s2.
Наконец, программа выводит на экран исходную строку и преобразованную строку без пробелов.
	*/
	public static void main (String[]args) {
		String s1 = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string\n");
		s1 = scan.nextLine();
		System.out.println("Input String is  :\n"+s1);
		String s2 = s1.replaceAll("\\s+","");
		System.out.println("\n Output String is  :\n"+s2);
	}
}
