package Networking;

import java.net.InetAddress;

public class findHostnameIPAddress {
	/*
Problem Description
How to find hostname from IP Address?

Solution
Following example shows how to change the host name to its specific IP address with the help of InetAddress.getByName() method of net.InetAddress class.
Данный код на языке Java помогает найти IP-адрес и имя хоста для заданного доменного имени. В данном случае, мы ищем IP-адрес и имя хоста для доменного имени "github.com".

Класс InetAddress используется для представления IP-адресов и имен хостов в Java. Метод getByName() принимает доменное имя в качестве аргумента и возвращает объект InetAddress, который представляет собой IP-адрес и имя хоста для данного доменного имени.

В данном примере мы вызываем метод getByName() и передаем ему доменное имя "github.com". Затем мы выводим имя хоста и IP-адрес на консоль с помощью методов getHostName() и getHostAddress() соответственно.
	*/
	public static void main(String[] argv) throws Exception {
		InetAddress addr = InetAddress.getByName("github.com");
		System.out.println("Host name is: "+addr.getHostName());
		System.out.println("Ip address is: "+ addr.getHostAddress());
	}
}
