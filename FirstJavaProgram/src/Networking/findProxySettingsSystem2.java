package Networking;

import java.net.*;
import java.util.Properties;

public class findProxySettingsSystem2 {
	/*
Problem Description
How to find proxy settings of a System?

Solution
Following example shows how to find proxy settings & create a proxy connection on a system using put method of systemSetting & getResponse method of HttpURLConnection class.
Этот код показывает, как найти настройки прокси-сервера на компьютере и создать соединение через прокси.

В методе main сначала устанавливаются системные настройки прокси-сервера с помощью объекта Properties. Эти настройки включают в себя хост и порт прокси-сервера для HTTP-соединений. В данном конкретном примере установлено, что прокси-сервер находится на github.com и работает на порту 80.

Затем создается объект URL с адресом http://www.google.com, и с его помощью создается объект HttpURLConnection. Выполняется запрос на этот адрес и выводится код ответа и сообщение. Если код ответа равен HTTP_OK (код 200), то выводится true, иначе false.

Затем устанавливается системное свойство java.net.useSystemProxies в значение true, чтобы использовать настройки прокси-сервера, которые определены в системе. Затем с помощью метода ProxySelector.getDefault().select(new URI("http://www.yahoo.com/")) находится список доступных прокси-серверов для данного адреса. Первый прокси-сервер из списка выбирается и выводится его хост и порт. Если список пустой, выводится сообщение "No Proxy".

Здесь http://www.yahoo.com/ использован только в качестве адреса, чтобы определить доступные прокси-серверы для этого адреса. Фактически, прокси-сервер не используется для запроса этого адреса.	*/
	public static void main(String[] s) throws Exception {
		try {
			Properties systemSettings = System.getProperties();
			systemSettings.put("proxySet", "true");
			systemSettings.put("http.proxyHost", "github.com");
			systemSettings.put("http.proxyPort", "80");

			URL u = new URL("http://www.google.com");
			HttpURLConnection con = (HttpURLConnection)u.openConnection();
			System.out.println(con.getResponseCode() + " : " + con.getResponseMessage());
			System.out.println(con.getResponseCode() == HttpURLConnection.HTTP_OK);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(false);
		}
		System.setProperty("java.net.useSystemProxies", "true");
		Proxy proxy = (Proxy) ProxySelector.getDefault().select(new URI(
						"http://www.yahoo.com/")).iterator().
				next();;
		System.out.println("proxy hostname : " + proxy.type());
		InetSocketAddress addr = (InetSocketAddress)proxy.address();

		if (addr == null) {
			System.out.println("No Proxy");
		} else {
			System.out.println("proxy hostname : " + addr.getHostName());
			System.out.println("proxy port : " + addr.getPort());
		}
	}
}
