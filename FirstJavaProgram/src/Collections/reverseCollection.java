package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class reverseCollection {
	/*
Problem Description
How to reverse a collection?

Solution
Following example demonstratres how to reverse a collection with the help of listIterator() and Collection.reverse() methods of Collection and Listiterator class.
	*/
	public static void main(String[] args) {
		String[] coins = { "A", "B", "C", "D", "E" };
		List l = new ArrayList();

		for (int i = 0; i < coins.length; i++)l.add(coins[i]);
		ListIterator liter = l.listIterator();
		System.out.println("Before reversal");

		while (liter.hasNext())System.out.println(liter.next());
		Collections.reverse(l);
		liter = l.listIterator();
		System.out.println("After reversal");
		while (liter.hasNext())System.out.println(liter.next());
	}
}
