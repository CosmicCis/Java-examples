package Networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class makeServerAllowConnectionSocket {
	/*
Problem Description
How to make a server to allow the connection to the socket 6123?

Solution
Following example shows how to make a server to allow the connection to the socket 6123 by using server.accept() method of ServerSocket class and sock.getInetAddress() method of Socket class.
Данный код написан на языке Java и демонстрирует, как создать сервер, который будет принимать подключения к сокету с номером 6123.

В методе main создается объект класса ServerSocket, который принимает номер порта (6123) для создания сервера. Далее с помощью цикла while(true) сервер начинает прослушивать подключения к указанному порту. Когда клиент подключается к серверу, метод accept() объекта ServerSocket возвращает сокет, связанный с клиентом.

Для каждого клиента, который подключается к серверу, вызывается метод getInetAddress() объекта Socket, который возвращает IP-адрес и имя хоста клиента. Имя хоста и IP-адрес выводятся на консоль.

Затем метод pause() приостанавливает работу сервера на 5 секунд, после чего сокет закрывается методом close().

Если происходит ошибка ввода-вывода (IOException), сервер выводит сообщение об ошибке на консоль.
	*/
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(6123);
			while (true) {
				System.out.println("Listening");
				Socket sock = server.accept();
				InetAddress addr = sock.getInetAddress();
				System.out.println("Connection made to " + addr.getHostName() + " ( " + addr.getHostAddress() + ")");
				pause(5000);
				sock.close();
			}
		} catch (IOException e) {
			System.out.println("Exception detected: " + e);
		}
	}
	private static void pause(int ms) {
		try {
			Thread.sleep(ms);
		}catch (InterruptedException e) {}
	}
}
