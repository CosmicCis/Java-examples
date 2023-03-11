package JDBC;
import java.sql.*;
public class sortContentsTable {
	/*
Problem Description
How to sort contents of a table?

Solution
Following example uses Order by SQL command to sort the table.


Данный код на Java демонстрирует, как отсортировать содержимое таблицы в базе данных с использованием команды SQL ORDER BY.

Сначала происходит подключение к базе данных с помощью драйвера "org.apache.derby.jdbc.ClientDriver", URL-адреса базы данных и учетных данных пользователя и пароля.

Далее создается объект Statement для выполнения запросов к базе данных. Создаются два SQL-запроса: первый сортирует таблицу по имени, а второй - сначала по имени, а затем по работе.

Первый запрос выполняется и результаты выводятся в консоль в виде таблицы с заголовками "Id", "Name" и "Job". Затем второй запрос выполняется и его результаты также выводятся в консоль в виде таблицы с теми же заголовками.

Таким образом, код демонстрирует простой способ сортировки содержимого таблицы в базе данных с помощью SQL-запроса ORDER BY.

	*/
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection (
				"jdbc:derby://localhost:1527/testDb","name","pass");

		Statement stmt = con.createStatement();
		String query = "select * from emp order by name";
		String query1 = "select * from emp order by name, job";

		ResultSet rs = stmt.executeQuery(query);
		System.out.println("Table contents sorted by Name");
		System.out.println("Id Name Job");

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String job = rs.getString("job");
			System.out.println(id + "  " + name+"   "+job);
		}
		rs = stmt.executeQuery(query1);
		System.out.println("Table contents after sorted by Name & job");
		System.out.println("Id Name    Job");

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String job = rs.getString("job");
			System.out.println(id + "  " + name+"   "+job);
		}
	}
}

