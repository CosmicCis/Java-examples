package Networking;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class checkWhetherPortBeingUsedNot {
	/*
Problem Description
How to check whether a port is being used or not?

Solution
Following example shows how to check whether any port is being used as a server or not by creating a socket object.
Этот код предназначен для проверки, используется ли порт в качестве сервера или нет. Он создает объект Socket для каждого порта (от 0 до 1023) на локальном компьютере или другом хосте, указанном в переменной "host". Если порт используется в качестве сервера, то программа выводит сообщение об этом. Если порт не используется, то программа продолжает свое выполнение, ища дальше. Если происходит ошибка UnknownHostException, программа завершает свою работу.
	*/
	public static void main(String[] args) {
		Socket Skt;
		String host = "localhost";

		if (args.length > 0) {
			host = args[0];
		}
		for (int i = 0; i < 1024; i++) {
			try {
				System.out.println("Looking for "+ i);
				Skt = new Socket(host, i);
				System.out.println("There is a server on port " + i + " of " + host);
			} catch (UnknownHostException e) {
				System.out.println("Exception occured"+ e);
				break;
			} catch (IOException e) {}
		}
	}
}
