package JDBC;
import java.sql.*;
public class editColumnsTableAndHowDeleteTable {
	/*
Problem Description
How to edit(Add or update) columns of a Table and how to delete a table?

Solution
Following example uses create, alter & drop SQL commands to create, edit or delete table.
Данный код демонстрирует, как можно создавать, редактировать и удалять таблицы в базе данных с помощью SQL-запросов.

Сначала мы подключаемся к базе данных с помощью JDBC, используя URL-адрес, имя пользователя и пароль. Затем мы создаем Statement и создаем таблицу "employees" с тремя столбцами: id, first_name и last_name.

Далее мы редактируем таблицу, используя команду ALTER TABLE, чтобы добавить новый столбец "address" и удалить столбец "last_name".

В конце мы удаляем таблицу "employees" с помощью команды DROP TABLE.

После каждого действия выводится сообщение в консоль для информирования пользователя.
	*/
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:derby://localhost:1527/testDb","username", "password");

		Statement stmt = con.createStatement();
		String query ="CREATE TABLE employees(id INTEGER PRIMARY KEY, first_name CHAR(50), last_name CHAR(75))";

		stmt.execute(query);
		System.out.println("Employee table created");
		String query1 = "aLTER TABLE employees ADD address CHAR(100) ";
		String query2 = "ALTER TABLE employees DROP COLUMN last_name";

		stmt.execute(query1);
		stmt.execute(query2);
		System.out.println("Address column added to the table & last_name column removed from the table");

		String query3 = "drop table employees";
		stmt.execute(query3);
		System.out.println("Employees table removed");
	}
}
