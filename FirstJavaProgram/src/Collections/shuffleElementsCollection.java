package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class shuffleElementsCollection {
	/*
Problem Description
How to shuffle the elements of a collection?

Solution
Following example how to shuffle the elements of a collection with the help of Collections.shuffle() method of Collections class.
	*/
	public static void main(String[] argv) throws Exception {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("A");
		obj.add("E");
		obj.add("I");
		obj.add("O");
		obj.add("U");
		Collections.shuffle(obj);
		System.out.println(obj);
	}
}
