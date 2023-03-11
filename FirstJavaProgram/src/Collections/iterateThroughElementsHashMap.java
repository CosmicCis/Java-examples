package Collections;
import java.util.*;
public class iterateThroughElementsHashMap {
	/*
Problem Description
How to iterate through elements of HashMap?

Solution
Following example uses iterator Method of Collection class to iterate through the HashMap.
	*/
	public static void main(String[] args) {
		HashMap< String, String> hMap = new HashMap< String, String>();
		hMap.put("1", "1st");
		hMap.put("2", "2nd");
		hMap.put("3", "3rd");
		Collection cl = hMap.values();
		Iterator itr = cl.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
