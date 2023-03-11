package JDBC;
import java.sql.*;
public class searchContentsTable {
	/*
Problem Description
How to Search contents of a table?

Solution
Following method uses where & like sql Commands to search through the database.



Данный код демонстрирует пример использования JDBC-соединения для поиска содержимого таблицы в базе данных. Он использует методы where и like языка SQL для поиска.

В начале программы мы регистрируем драйвер JDBC, указывая имя класса драйвера. Затем мы создаем соединение с базой данных, указывая URL-адрес, имя пользователя и пароль.

Далее мы создаем объект Statement, который используется для выполнения SQL-запросов в базе данных. Мы определяем три запроса для поиска записей в таблице emp с различными условиями: поиск по id, поиск по имени, начинающемуся на ravi_ и поиск по имени, начинающемуся на ravi%.

Затем мы перебираем массив запросов и выполняем каждый из них с помощью метода executeQuery(). Результаты запроса хранятся в объекте ResultSet. Мы выводим на экран имена, полученные из результатов каждого запроса.

В итоге, данный код ищет имена с использованием SQL-запросов в таблице базы данных и выводит результаты на экран.

	*/
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:derby://localhost:1527/testDb","username", "password");

		Statement stmt = con.createStatement();
		String query[] = {
				"SELECT * FROM emp where id = 1",
				"select name from emp where name like 'ravi_'",
				"select name from emp where name like 'ravi%'"
		};

		for(String q : query) {
			ResultSet rs = stmt.executeQuery(q);
			System.out.println("Names for query "+q+" are");

			while (rs.next()) {
				String name = rs.getString("name");
				System.out.print(name+"  ");
			}
			System.out.println();
		}
	}
}
