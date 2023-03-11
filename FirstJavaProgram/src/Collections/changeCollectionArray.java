package Collections;

import java.util.ArrayList;
import java.util.List;

public class changeCollectionArray {
	/*
Problem Description
How to change a collection to an array?

Solution
Following example shows how to convert a collection to an array by using list.add() and list.toArray() method of Java Util class.
	*/
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("This ");
		list.add("is ");
		list.add("a ");
		list.add("good ");
		list.add("program.");
		String[] s1 = list.toArray(new String[0]);

		for(int i = 0; i< s1.length; ++i) {
			String contents = s1[i];
			System.out.print(contents);
		}
	}
}
