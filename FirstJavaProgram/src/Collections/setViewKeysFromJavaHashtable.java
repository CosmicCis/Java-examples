package Collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class setViewKeysFromJavaHashtable {
	/*
Problem Description
How to set view of Keys from Java Hashtable?

Solution
Following example uses keys() method to get Enumeration of Keys of the Hashtable.
Данный код демонстрирует, как получить представление ключей из Hashtable в Java, используя метод keys(). В примере создается объект Hashtable и заполняется несколькими парами ключ-значение. Затем метод keys() вызывается на объекте Hashtable, что возвращает перечисление ключей в этой таблице. В цикле while проходятся все ключи, пока hasMoreElements() метод перечисления возвращает true. Каждый ключ затем выводится на консоль с помощью метода nextElement().
	*/
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		Enumeration e = ht.keys();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}