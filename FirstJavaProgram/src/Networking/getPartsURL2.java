package Networking;

import java.net.URL;

public class getPartsURL2 {
	/*
Problem Description
How to get the parts of an URL?

Solution
Following example shows how to get the parts of an URL with the help of url.getProtocol(), url.getFile() method etc. of net.URL class.
Данный код на языке Java демонстрирует способ получения различных частей URL-адреса с помощью класса URL из стандартной библиотеки Java.

Класс URL представляет собой URL-адрес и содержит методы для доступа к его различным частям. В данном примере создается новый объект URL с адресом "http://www.example.com/index.html".

Затем, с помощью вызова различных методов объекта URL, выводится информация об адресе, включая его протокол (HTTP), файл (index.html), имя хоста (www.example.com), путь (/index.html), порт (80) и порт по умолчанию для этого протокола (80).

Код выводит эту информацию на экран, используя методы System.out.println().
	*/
	public static void main(String[] args) throws Exception {
		URL u = new URL("http://www.example.com/index.html");
		System.out.println("The URL is " + u);
		System.out.println("The file part is " + u.getFile());
		System.out.println("host is " + u.getHost());
		System.out.println("path is " + u.getPath());
		System.out.println("port is " + u.getPort());
		System.out.println("default port is " + u.getDefaultPort());
	}
}
