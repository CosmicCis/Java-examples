package Networking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class readDownloadWebpage {
	/*
Problem Description
How to read and download a webpage?

Solution
Following example shows how to read and download a webpage URL() constructer of net.URL class.
Данный код демонстрирует, как считывать и скачивать веб-страницу. В основном методе программы создается объект класса URL с адресом веб-страницы, которую нужно скачать и прочитать. Затем создаются объекты BufferedReader и BufferedWriter, которые будут использоваться для чтения и записи соответственно.

С помощью метода openStream() объекта URL создается поток ввода, считывающий содержимое веб-страницы, а затем этот поток оборачивается объектом BufferedReader для построчного чтения содержимого страницы.

Далее происходит чтение содержимого страницы построчно и вывод ее содержимого в консоль с помощью команды System.out.println(). Также каждая считанная строка записывается в файл "data.html" с помощью методов write() и newLine() объекта BufferedWriter.

Наконец, после окончания чтения страницы оба объекта, BufferedReader и BufferedWriter, закрываются с помощью методов close().
	*/
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.google.com");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
		String line;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			writer.write(line);
			writer.newLine();
		}
		reader.close();
		writer.close();
	}
}
