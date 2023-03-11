package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class removeSpecificElementFromCollection {
	/*
Problem Description
How to remove a specific element from a collection?

Solution
Following example demonstrates how to remove a certain element from a collection with the help of collection.remove() method of Collection class.
	*/
	public static void main(String [] args) {
		System.out.println( "Collection Example!\n" );
		int size;
		HashSet<String> collection = new HashSet <String>();
		String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
		Iterator iterator;
		collection.add(str1);
		collection.add(str2);
		collection.add(str3);
		collection.add(str4);
		System.out.print("Collection data: ");
		iterator = collection.iterator();

		while (iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		collection.remove(str2);
		System.out.println("After removing [" + str2 + "]\n");
		System.out.print("Now collection data: ");
		iterator = collection.iterator();

		while (iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		size = collection.size();
		System.out.println("Collection size: " + size + "\n");
	}
}
