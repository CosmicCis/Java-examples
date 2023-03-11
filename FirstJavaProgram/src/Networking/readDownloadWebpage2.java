package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class readDownloadWebpage2 {
	/*
Problem Description
How to read and download a webpage?

Solution
Following example shows how to read and download a webpage URL() constructer of net.URL class.
Данный код на языке Java предназначен для чтения и загрузки веб-страницы.

Сначала мы создаем объект URL, который представляет адрес веб-страницы, которую мы хотим загрузить и прочитать. Затем мы открываем поток InputStream, используя метод openStream() объекта URL, который возвращает поток данных, связанных с этим URL-адресом.

Далее мы создаем объект BufferedReader, который используется для чтения текста из потока ввода. Мы передаем InputStreamReader в конструктор BufferedReader, который позволяет читать текст из потока байтов.

Затем мы читаем содержимое веб-страницы, используя метод readLine() объекта BufferedReader, который читает каждую строку текста из потока ввода и сохраняет ее в переменной line. Мы выводим содержимое веб-страницы в консоль, используя метод println() класса System.

В случае возникновения ошибок при открытии потока ввода или чтении из него, программа перехватывает соответствующее исключение и выводит сообщение об ошибке.

В конце, мы закрываем поток ввода, используя метод close(), чтобы освободить ресурсы и избежать утечек памяти.
	*/
	public static void main(String[] args) {
		URL url;
		InputStream is = null;
		BufferedReader br;
		String line;
		try {
			url = new URL("https://www.github.com/");
			is = url.openStream();  // throws an IOException
			br = new BufferedReader(new InputStreamReader(is));

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				if (is != null) is.close();
			} catch (IOException ioe) {}
		}
	}
}
