package Networking;
import java.net.InetAddress;
import java.net.Socket;
public class getConnectedWithWebServer {
	/*
Problem Description
How to get connected with web server?

Solution
Following example demonstrates how to get connected with web server by using sock.getInetAddress() method of net.Socket class.
Этот код демонстрирует, как установить соединение с веб-сервером, используя класс Socket из пакета java.net. Конкретно, в этом примере создается объект Socket, который подключается к адресу "www.github.com" на порту 80. Затем метод getInetAddress() используется для получения IP-адреса сервера, к которому было установлено соединение, и выводится сообщение об успешном подключении к этому адресу. После этого соединение закрывается вызовом метода close() объекта Socket. Если возникает ошибка ввода-вывода при установлении соединения, программа выдает сообщение об ошибке.
	*/
	public static void main(String[] args) {
		try {
			InetAddress addr;
			Socket sock = new Socket("www.github.com", 80);
			addr = sock.getInetAddress();
			System.out.println("Connected to " + addr);
			sock.close();
		} catch (java.io.IOException e) {
			System.out.println("Can't connect to " + args[0]);
			System.out.println(e);
		}
	}
}
