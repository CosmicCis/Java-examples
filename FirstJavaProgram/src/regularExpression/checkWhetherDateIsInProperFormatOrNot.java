package regularExpression;

public class checkWhetherDateIsInProperFormatOrNot {
	/*
Problem Description
How to check whether date is in proper format or not?

Solution
Following example demonstrates how to check whether the date is in a proper format or not using matches method of String class.
Данный код на Java предназначен для проверки, является ли дата введенная пользователем в правильном формате или нет. Для этого определены две даты - date1 и date2, а также шаблон datePattern, который содержит регулярное выражение для проверки правильности формата даты. В данном случае, шаблон содержит следующее выражение: "\d{1,2}-\d{1,2}-\d{4}", которое означает, что дата должна состоять из цифр и иметь следующий формат: день-месяц-год (два числа, дефис, два числа, дефис, четыре числа).

Затем, для проверки каждой даты, используется метод matches() класса String. Этот метод проверяет, соответствует ли строка заданному регулярному выражению (datePattern) и возвращает true, если строка соответствует выражению, и false в противном случае.

Результат проверки выводится в консоль с помощью метода System.out.println(). Если дата соответствует шаблону, то выводится сообщение "Date : [дата] : matches with the this date Pattern: [шаблон] Ans: true", иначе - "Date : [дата] : matches with the this date Pattern: [шаблон] Ans: false".
	*/
	public static void main(String[] argv) {
		boolean isDate = false;
		String date1 = "8-05-19188";
		String date2 = "08/04/19187";
		String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";

		isDate = date1.matches(datePattern);
		System.out.println("Date :"+ date1+": matches with the this date Pattern:"+datePattern+"Ans:"+isDate);

		isDate = date2.matches(datePattern);
		System.out.println("Date :"+ date2+": matches with the this date Pattern:"+datePattern+"Ans:"+isDate);
	}
}
