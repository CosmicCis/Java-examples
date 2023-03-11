package Networking;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class makeSocketDisplayingMessageSingleClient {
	/*
Problem Description
How to make a socket displaying message to a single client?

Solution
Following example demonstrates how to make a socket displaying message to a single client with the help of ssock.accept() method of Socket class.
Данный код написан на языке Java и демонстрирует, как создать сокет и отправить сообщения на один клиент.

В методе main создается объект класса ServerSocket с указанием порта, на котором будет прослушиваться подключение клиента. Затем вызывается метод accept() объекта ssock, который блокирует выполнение программы до момента, когда клиент подключится к серверу. Как только клиент подключится, метод accept() вернет объект класса Socket, который будет использоваться для взаимодействия с клиентом.

Далее создается объект класса PrintStream, который предназначен для отправки данных на сокет. Цикл for отправляет 11 сообщений на сокет, каждое из которых содержит число от 10 до 0 и строку "from Java Source and Support.". Когда цикл завершается, сначала закрывается объект PrintStream, а затем объект Socket, чтобы завершить соединение с клиентом.

Важно отметить, что данный пример демонстрирует обработку только одного клиента, и для работы с несколькими клиентами потребуется использовать многопоточность или использовать библиотеки для работы с асинхронными соединениями.
	*/
	public static void main(String args[]) throws Exception {
		ServerSocket ssock = new ServerSocket(1234);
		System.out.println("Listening");
		Socket sock = ssock.accept();
		ssock.close();
		PrintStream ps = new PrintStream(sock.getOutputStream());

		for (int i = 10; i >= 0; i--) {
			ps.println(i + " from Java Source and Support.");
		}
		ps.close();
		sock.close();
	}
}
