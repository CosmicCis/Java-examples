package JDBC;
import java.sql.*;
public class retrieveContentsTableUsingJDBC {
	/*
Problem Description
How to retrieve contents of a table using JDBC connection?

Solution
Following example uses getString, getInt & executeQuery methods to fetch & display the contents of the table.
Данный код на Java демонстрирует, как получить содержимое таблицы базы данных с использованием JDBC-соединения.

Сначала мы используем Class.forName() для загрузки драйвера JDBC в память. Затем мы устанавливаем соединение с базой данных, используя DriverManager.getConnection(), указывая URL-адрес базы данных, имя пользователя и пароль.

Далее мы создаем объект Statement с помощью метода createStatement(), который используется для выполнения SQL-запросов. В данном случае мы выполняем запрос "SELECT * FROM employee", который извлекает все строки из таблицы "employee".

Затем мы перебираем полученный результат, используя метод next() объекта ResultSet, который перемещает указатель к следующей строке. Для каждой строки мы получаем значения столбцов, используя методы getInt() и getString() объекта ResultSet. Полученные значения выводятся на экран с помощью System.out.println().
	*/
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch(ClassNotFoundException e) {
			System.out.println("Class not found "+ e);
		}
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:derby://localhost:1527/testDb","username", "password");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
			System.out.println("id  name    job");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String job = rs.getString("job");
				System.out.println(id+"   "+name+"    "+job);
			}
		} catch(SQLException e) {
			System.out.println("SQL exception occured" + e);
		}
	}
}
