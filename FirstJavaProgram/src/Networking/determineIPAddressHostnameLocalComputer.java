package Networking;

import java.net.InetAddress;

public class determineIPAddressHostnameLocalComputer {
	/*
Problem Description
How to determine IP Address & hostname of Local Computer?

Solution
Following example shows how to find local IP Address & Hostname of the system using getLocalAddress() method of InetAddress class.
Данный код на Java позволяет определить IP-адрес и имя хоста локального компьютера.

В первой строке импортируется класс InetAddress, который позволяет работать с IP-адресами и именами хостов.

Далее в методе main создается объект addr класса InetAddress с помощью метода getLocalHost(), который возвращает объект, представляющий локальный хост.

Затем с помощью метода getHostAddress() объекта addr выводится локальный IP-адрес в консоль, а с помощью метода getHostName() выводится имя хоста.

Таким образом, данный код выводит на экран локальный IP-адрес и имя хоста компьютера, на котором он выполняется.
	*/
	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("Local HostAddress: "+addr.getHostAddress());
		String hostname = addr.getHostName();
		System.out.println("Local host name: "+hostname);
	}
}
