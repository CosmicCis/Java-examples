package Networking;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class splitStringIntoNumberSubstrings {
	/*
Problem Description
How to split a string into a number of substrings?

Solution
Following example shows how to change the host name to its specific IP address with the help of InetAddress.getByName() method of net.InetAddress class.
Этот код демонстрирует, как можно использовать метод InetAddress.getByName() класса InetAddress для получения IP-адреса хоста из его имени. В данном примере имя хоста "www.github.com" передается в качестве аргумента методу getByName(), который возвращает объект InetAddress, содержащий IP-адрес хоста. Далее в консоль выводится имя хоста и соответствующий ему IP-адрес, полученный с помощью методов getHostName() и getHostAddress() соответственно. Если при попытке получить IP-адрес возникает исключение UnknownHostException, программа завершается с кодом 2.
	*/
	public static void main(String[] args) {
		InetAddress address = null;
		try {
			address = InetAddress.getByName("www.github.com");
		} catch (UnknownHostException e) {
			System.exit(2);
		}
		System.out.println(address.getHostName() + "=" + address.getHostAddress());
		System.exit(0);
	}
}
