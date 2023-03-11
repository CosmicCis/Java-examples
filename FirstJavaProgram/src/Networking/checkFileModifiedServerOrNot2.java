package Networking;

import java.net.URL;
import java.net.URLConnection;

public class checkFileModifiedServerOrNot2 {
	/*
Problem Description
How to check a file is modified at a server or not?

Solution
Following example shows How to check a file is modified at a server or not.
Данный код написан на языке Java и имеет следующую функциональность:

Импортируются классы URL и URLConnection для работы с сетевыми ресурсами.
Объявляется публичный класс checkFileModifiedServerOrNot2.
В комментарии описывается проблема, которую решает код, а также приводится краткое решение проблемы.
Объявляется метод main, который принимает аргументы в виде массива строк.
Создается объект URL для заданного URL-адреса (https://www.github.com/).
Создается объект URLConnection для установления соединения с ресурсом по заданному URL-адресу.
Выставляется флаг использования кэша в false, чтобы гарантировать актуальность информации о модификации файла на сервере.
Получается время последней модификации файла на сервере с помощью метода getLastModified() объекта URLConnection.
Выводится на экран время последней модификации файла на сервере.
Таким образом, данный код позволяет проверить, был ли изменен файл на сервере с момента последнего обращения к нему.
	*/
	public static void main(String[] argv)throws Exception {
		URL u = new URL(
				"https://www.github.com/");

		URLConnection uc = u.openConnection();
		uc.setUseCaches(false);
		long timestamp = uc.getLastModified();
		System.out.println("The last modification time of file is :"+timestamp);
	}
}
