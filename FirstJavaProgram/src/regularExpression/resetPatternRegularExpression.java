package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class resetPatternRegularExpression {
	/*
Problem Description
How to reset the pattern of a regular expression?

Solution
Following example demonstrates how to reset the pattern of a regular expression by using Pattern.compile() of Pattern class and m.find() method of Matcher class.
Данный код демонстрирует, как сбросить шаблон регулярного выражения с помощью методов классов Pattern и Matcher.

В данном примере создается объект Matcher, который получает на вход строку "fix the rug with bags" и ищет в ней соответствия шаблону регулярного выражения "[frb][aiu][gx]". Затем найденные соответствия выводятся на экран.

Далее вызывается метод reset у объекта Matcher, передавая ему новую строку "fix the rig with rags", в которой уже нет соответствий шаблону, используемому в первом случае. После этого объект Matcher ищет соответствия новому шаблону и выводит их на экран.

Таким образом, данный пример демонстрирует возможность сброса шаблона регулярного выражения и повторного его применения для поиска соответствий в новой строке.
	*/
	public static void main(String[] args) throws Exception {
		Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
		while (m.find())System.out.println(m.group());
		m.reset("fix the rig with rags");
		while (m.find())System.out.println(m.group());
	}
}
