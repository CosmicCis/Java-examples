package Networking;

import java.net.URL;
import java.net.URLConnection;

public class getFileSizeFromServer {
	/*
Problem Description
How to get the file size from the server?

Solution
Following example demonstrates How to get the file size from the server.
Данный код написан на языке Java и демонстрирует, как получить размер файла с сервера.

В методе main определен объект класса URL, представляющий адрес файла на сервере, и установлено соединение с сервером с помощью метода openConnection(), вызванного на этом объекте. Затем с помощью метода getContentLength() получается размер файла в байтах, который сохраняется в переменную size.

Далее происходит проверка полученного размера файла. Если размер файла меньше нуля, выводится сообщение "Could not determine file size." (не удалось определить размер файла), в противном случае выводится сообщение с указанием размера файла в байтах.

В конце метода getInputStream().close() закрывает входной поток соединения с сервером.
	*/
	public static void main(String[] argv) throws Exception {
		int size;
		URL url = new URL("http://www.github.com");
		URLConnection conn = url.openConnection();
		size = conn.getContentLength();

		if (size < 0) System.out.println("Could not determine file size.");
		else System.out.println("The size of file is = " + size + "bytes");
		conn.getInputStream().close();
	}
}
