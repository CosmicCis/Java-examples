package Networking;

import java.net.URL;
import java.net.URLConnection;

public class getFileSizeFromServer2 {
	/*
Problem Description
How to get the file size from the server?

Solution
Following example demonstrates How to get the file size from the server.
Данный код написан на языке Java и демонстрирует, как получить размер файла с сервера.

В методе main определен объект класса URL, представляющий адрес файла на сервере, и установлено соединение с сервером с помощью метода openConnection(), вызванного на этом объекте. Затем с помощью метода getContentLength() получается размер файла в байтах, который сохраняется в переменную size.

Далее происходит проверка полученного размера файла. Если размер файла меньше нуля, выводится сообщение "file size is empty." (размер файла пуст), в противном случае выводится сообщение с указанием размера файла в байтах.

В конце метода getInputStream().close() закрывает входной поток соединения с сервером. Когда поток закрывается, соединение с сервером также закрывается автоматически.
	*/
	public static void main(String[] argv) throws Exception {
		int size;
		URL url = new URL("https://www.github.com/");
		URLConnection conn = url.openConnection();
		size = conn.getContentLength();
		if (size < 0) System.out.println("file size is empty.");
		else System.out.println("File size is = " + size + "bytes");
		conn.getInputStream().close();
	}
}
