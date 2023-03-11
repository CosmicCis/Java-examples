package regularExpression;

public class matchPhoneNumbersInList {
	/*
Problem Description
How to match phone numbers in a list?

Solution
Following example shows how to match phone numbers in a list to a particle pattern by using phone.matches(phoneNumberPattern) method.
Данный код содержит метод isValid, который проверяет, соответствует ли строка определенному формату телефонного номера, заданному с помощью регулярного выражения \\d{2}-\\d{4}-\\d{6}. Это означает, что номер должен содержать две цифры, за которыми следуют дефис, затем еще четыре цифры и еще один дефис, и, наконец, шесть цифр.

Далее, в методе main вызывается метод isValid с примером телефонного номера "91-96152-018244", и результат выводится на экран с помощью метода System.out.println. Если переданный телефонный номер соответствует формату, то метод isValid возвращает true, иначе - false.
	*/
	private static boolean isValid(String s) {
		String regex = "\\d{2}-\\d{4}-\\d{6}";
		return s.matches(regex);
	}
	public static void main(String[] args) {
		System.out.println(isValid("91-96152-018244"));
	}

}
