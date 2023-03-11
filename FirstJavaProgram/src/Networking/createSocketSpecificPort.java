package Networking;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
public class createSocketSpecificPort {
	/*
Problem Description
How to create a socket at a specific port?

Solution
Following example shows how to sing Socket constructor of Socket class.And also get Socket details using getLocalPort() getLocalAddress , getInetAddress() & getPort() methods.
Данный код создает сокет на указанном порту и адресе хоста, используя конструктор класса Socket. Адрес хоста передается в качестве параметра методу getByName() класса InetAddress, который возвращает объект типа InetAddress с IP-адресом этого хоста. Затем создается объект Socket с указанным адресом и портом.
Для получения информации о созданном сокете используются методы getLocalPort(), getLocalAddress(), getInetAddress() и getPort(). Метод getLocalPort() возвращает порт локальной машины, к которому привязан данный сокет. Метод getLocalAddress() возвращает IP-адрес локальной машины, который привязан к данному сокету. Метод getInetAddress() возвращает объект типа InetAddress, представляющий адрес удаленной машины, к которой подключен данный сокет. Метод getPort() возвращает номер порта, который используется удаленной машиной для соединения с данным сокетом.
Если в процессе выполнения возникает исключение типа UnknownHostException, значит, переданный в метод getByName() адрес хоста неверен или не может быть разрешен в IP-адрес. Если возникает исключение типа SocketException, значит, не удается установить соединение с указанным хостом. Если возникает исключение типа IOException, значит, произошла другая ошибка ввода-вывода.
	*/
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("github.com");
			Socket theSocket = new Socket(addr, 80);
			System.out.println("Connected to "
					+ theSocket.getInetAddress()
					+ " on port " + theSocket.getPort() + " from port "
					+ theSocket.getLocalPort() + " of "
					+ theSocket.getLocalAddress());
		} catch (UnknownHostException e) {
			System.err.println("I can't find " + e  );
		} catch (SocketException e) {
			System.err.println("Could not connect to " +e );
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
