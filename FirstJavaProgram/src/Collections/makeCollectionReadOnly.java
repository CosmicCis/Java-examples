package Collections;

import java.util.*;

public class makeCollectionReadOnly {
	/*
Problem Description
How to make a collection read-only?

Solution
Following example shows how to make a collection read-only by using Collections.unmodifiableList() method of Collection class.
	*/
	public static void main(String[] argv) throws Exception {
		List stuff = Arrays.asList(new String[] { "a", "b" });
		List list = new ArrayList(stuff);
		list = Collections.unmodifiableList(list);
		try {
			list.set(0, "new value");
		} catch (UnsupportedOperationException e) {
		}
		Set set = new HashSet(stuff);
		set = Collections.unmodifiableSet(set);
		Map map = new HashMap();
		map = Collections.unmodifiableMap(map);
		System.out.println("Collection is read-only now.");
	}
}
