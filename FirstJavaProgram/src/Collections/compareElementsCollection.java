package Collections;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
public class compareElementsCollection {
	/*
Problem Description
How to compare elements in a collection?

Solution
Following example compares the element of a collection by converting a string into a treeset using Collection.min() and Collection.max() methods of Collection class.
	*/
	public static void main(String[] args) {
		String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
		Set set = new TreeSet();

		for (int i = 0; i < coins.length; i++)set.add(coins[i]);
		System.out.println(Collections.min(set));
		System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));

		for(int i = 0; i <= 10; i++)System.out.print('-');
		System.out.println(Collections.max(set));
		System.out.println(Collections.max(set,
				String.CASE_INSENSITIVE_ORDER));
	}
}
