package Networking;

import java.net.URL;
import java.net.URLConnection;

public class checkFileModifiedServerOrNot {
	/*
Problem Description
How to check a file is modified at a server or not?

Solution
Following example shows How to check a file is modified at a server or not.
Данный код демонстрирует использование класса Enumeration для отображения содержимого HashTable. Создается объект Hashtable, в который добавляются три элемента. Затем вызывается метод elements() для получения объекта Enumeration, который используется в цикле while для вывода содержимого Hashtable с помощью методов hasMoreElements() и nextElement().
	*/
	public static void main(String[] argv)throws Exception {
		URL u = new URL("http://127.0.0.1/java.bmp");
		URLConnection uc = u.openConnection();
		uc.setUseCaches(false);
		long timestamp = uc.getLastModified();
		System.out.println("The last modification time of java.bmp is :"+timestamp);
	}
}
