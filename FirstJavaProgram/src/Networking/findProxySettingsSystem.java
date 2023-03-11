package Networking;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
public class findProxySettingsSystem {
	/*
Problem Description
How to find proxy settings of a System?

Solution
Following example shows how to find proxy settings & create a proxy connection on a system using put method of systemSetting & getResponse method of HttpURLConnection class.
Данный код написан на языке Java и предназначен для нахождения настроек прокси-сервера в системе.

Первая часть кода устанавливает настройки прокси-сервера в системе с помощью класса System, метода getProperties() и установки параметров proxySet, http.proxyHost и http.proxyPort. Затем создается объект класса URL для подключения к веб-ресурсу, объект HttpURLConnection для установки соединения с указанным URL-адресом и выводится код ответа сервера и сообщение ответа.

Во второй части кода устанавливается свойство java.net.useSystemProxies в значение true, чтобы использовать системные настройки прокси-сервера. Затем создается объект класса Proxy с помощью метода getDefault() класса ProxySelector, который выбирает прокси-сервер для указанного URI-адреса, и метода select(), который возвращает список всех доступных прокси-серверов. Если прокси не настроен, выводится сообщение "No Proxy". Если прокси настроен, выводится его хост-имя и порт.
	*/
	public static void main(String[] s) throws Exception {
		try {
			Properties systemSettings = System.getProperties();
			systemSettings.put("proxySet", "true");
			systemSettings.put("http.proxyHost", "proxy.mycompany1.local");
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
