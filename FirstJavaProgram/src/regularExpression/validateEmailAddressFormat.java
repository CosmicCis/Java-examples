package regularExpression;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateEmailAddressFormat {
	/*
Problem Description
How to validate an email address format?

Solution
Following example demonstrates how to validate e-mail address using matches() method of String class.
Данный код проверяет правильность формата e-mail адреса. Он использует метод matches() класса String для сравнения e-mail адреса с регулярным выражением EMAIL_REGEX, которое определяет правильный формат адреса.

Переменная EMAIL_REGEX содержит регулярное выражение, которое проверяет наличие букв, цифр, знаков подчёркивания, дефисов и точек до символа "@" и после символа "@", наличие доменного имени и зоны (например, ".com", ".co.in" и т.д.).

Далее, в данном примере проверяются два e-mail адреса email1 и email2 с помощью регулярного выражения EMAIL_REGEX. Результаты проверки сохраняются в логическую переменную b.

Затем, для каждого e-mail адреса выводится сообщение о его правильности с помощью метода System.out.println(). Если e-mail адрес соответствует заданному формату, то в консоли выводится сообщение Valid = true, в противном случае Valid = false.
	*/
	public static void main(String args[]) {
		List emails = new ArrayList();
		emails.add("github@gmail-indai.com");
		emails.add("site#@youtube.com");
		emails.add("kittu@domaincom");
		emails.add("kitty#gmail.com");
		emails.add("@pindom.com");

		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);

		for (Object email : emails) {
			Matcher matcher = pattern.matcher((CharSequence) email);
			System.out.println(email + " : " + matcher.matches());
		}
	}
}
