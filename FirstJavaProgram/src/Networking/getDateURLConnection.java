package Networking;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class getDateURLConnection {
	/*
Problem Description:
How to get the date of URL connection?

Solution:
Following example demonstrates how to get the date of URL connection by using httpCon.getDate() method of HttpURLConnection class.
Данный Java-код демонстрирует, как получить дату соединения с URL, используя класс HttpURLConnection.

В данном конкретном примере программа создает объект класса URL с адресом "http://www.google.com", и затем открывает соединение с этим URL при помощи метода openConnection(). Затем программа получает дату соединения при помощи метода getDate() объекта HttpURLConnection и проверяет, были ли получены какие-либо данные. Если дата равна 0, выводится сообщение "No date information.", иначе программа выводит полученную дату, преобразованную в объект Date.
	*/
	public static void main(String args[])
			throws Exception {
		URL url = new URL("http://www.google.com");
		HttpURLConnection httpCon =
				(HttpURLConnection) url.openConnection();
		long date = httpCon.getDate();
		if (date == 0)
			System.out.println("No date information.");
		else
			System.out.println("Date: " + new Date(date));
	}
}
