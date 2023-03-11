package regularExpression;

public class matchPhoneNumbersInList2 {
	/*
Problem Description
How to match phone numbers in a list?

Solution
Following example shows how to match phone numbers in a list to a particle pattern by using phone.matches(phoneNumberPattern) method.
Этот код проверяет, является ли заданный номер телефона действительным по заданному шаблону. Он определяет метод isValid, который принимает строку в качестве аргумента и возвращает true, если строка соответствует шаблону \\d{2}-\\d{4}-\\d{6}, иначе он возвращает false. Затем в методе main вызывается метод isValid с передачей строки "91-9652-0118244" в качестве аргумента, и результат выводится в консоль. В этом случае метод isValid вернет true, так как строка соответствует шаблону.
	*/
	private static boolean isValid(String s) {
		String regex = "\\d{2}-\\d{4}-\\d{6}";
		return s.matches(regex);
	}
	public static void main(String[] args) {
		System.out.println(isValid("91-9652-0118244"));
	}
}
