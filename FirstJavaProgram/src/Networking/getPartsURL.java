package Networking;

import java.net.URL;

public class getPartsURL {
	/*
Problem Description
How to get the parts of an URL?

Solution
Following example shows how to get the parts of an URL with the help of url.getProtocol(), url.getFile() method etc. of net.URL class.
Данный код демонстрирует, как получить различные части URL-адреса с помощью класса URL из пакета java.net.

Сначала создается объект URL с помощью конструктора, в котором передается строка, содержащая URL-адрес "http://www.example.com/index.html". Затем выводятся следующие характеристики этого адреса:

url.toString() - возвращает URL-адрес в виде строки.
url.getProtocol() - возвращает протокол (в данном случае "http").
url.getFile() - возвращает часть URL-адреса после имени хоста (в данном случае "/index.html").
url.getHost() - возвращает имя хоста (в данном случае "www.example.com").
url.getPath() - возвращает путь к ресурсу на сервере (в данном случае "/index.html").
url.getPort() - возвращает номер порта, который был указан в URL-адресе (если он был указан) или -1, если он не был указан (в данном случае -1).
url.getDefaultPort() - возвращает номер порта по умолчанию для указанного протокола (в данном случае 80 для протокола "http").
	*/
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.example.com/index.html");
		System.out.println("URL is " + url.toString());
		System.out.println("protocol is " + url.getProtocol());
		System.out.println("file name is " + url.getFile());
		System.out.println("host is " + url.getHost());
		System.out.println("path is " + url.getPath());
		System.out.println("port is " + url.getPort());
		System.out.println("default port is " + url.getDefaultPort());
	}
}
