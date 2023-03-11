package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class resetPatternRegularExpression2 {
	/*
Problem Description
How to reset the pattern of a regular expression?

Solution
Following example demonstrates how to reset the pattern of a regular expression by using Pattern.compile() of Pattern class and m.find() method of Matcher class.

	*/

	public static void main(String args[]) {
		Pattern p = Pattern.compile("\\d");
		Matcher mat1 = p.matcher("9652018244");

		while (mat1.find()) {
			System.out.println("\t\t" + mat1.group());
		}
		mat1.reset();
		System.out.println("After done resetting the Matcher, it should be like this");

		while (mat1.find()) {
			System.out.println("\t\t" + mat1.group());
		}
	}
}
