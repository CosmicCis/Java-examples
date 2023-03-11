package Collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class enumerationDisplayContentsHashTable {
	/*
Problem Description
How to use enumeration to display contents of HashTable?

Solution
Following example uses hasMoreElements & nestElement Methods of Enumeration Class to display the contents of the HashTable.
Этот код демонстрирует, как использовать перечисление (Enumeration) для отображения содержимого Hashtable. Создается объект Hashtable, в котором ключами являются числовые строки "1", "2" и "3", а значениями соответственно "One", "Two" и "Three". Затем создается объект Enumeration, который используется для перебора значений в Hashtable с помощью методов hasMoreElements() и nextElement(). В цикле while() происходит перебор всех элементов Hashtable с помощью метода nextElement() и вывод их содержимого на консоль с помощью метода println(). В результате на консоль будут выведены значения "One", "Two" и "Three".
	*/
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		Enumeration e = ht.elements();

		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
