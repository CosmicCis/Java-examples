package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class findHostnameIPAddress2 {
	/*
Problem Description
How to find hostname from IP Address?

Solution
Following example shows how to change the host name to its specific IP address with the help of InetAddress.getByName() method of net.InetAddress class.
Данный код предназначен для получения IP-адреса и имени хоста компьютера, на котором выполняется программа.

Он использует класс InetAddress из пакета java.net для получения локального IP-адреса и соответствующего имени хоста. Сначала метод getLocalHost() возвращает объект InetAddress, который представляет локальный хост, на котором выполняется программа. Затем метод getHostName() вызывается для извлечения имени хоста из объекта InetAddress, а метод toString() вызывается для извлечения IP-адреса. Наконец, эти значения выводятся на экран с помощью метода System.out.println().

Если возникает исключение UnknownHostException, вызванное невозможностью разрешить имя хоста, программа выводит сообщение об ошибке с помощью метода printStackTrace() объекта исключения.
	*/

	public static void main(String[] args) {
		InetAddress ip;
		String hostname;
		try {
			ip = InetAddress.getLocalHost();
			hostname = ip.getHostName();
			System.out.println("Your current IP address : " + ip);
			System.out.println("Your current Hostname : " + hostname);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
