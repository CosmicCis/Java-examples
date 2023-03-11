package JDBC;
import java.sql.*;
public class updateContentsTableUsingJDBC {
	/*
Problem Description
How to update(delete, insert or update) contents of a table using JDBC connection?

Solution
Following method uses update, delete & insert SQL commands to edit or delete row contents.

Данный код является примером использования JDBC-соединения с базой данных, иллюстрирующим возможности обновления, удаления и вставки данных в таблицу.

Сначала происходит загрузка драйвера JDBC для работы с базой данных Apache Derby:
Class.forName("org.apache.derby.jdbc.ClientDriver");
Затем устанавливается соединение с базой данных с помощью метода DriverManager.getConnection(). В данном случае используется URL-адрес базы данных, имя пользователя и пароль для авторизации:
Connection con = DriverManager.getConnection ("jdbc:derby://localhost:1527/testDb","username", "password");
Создается объект Statement, который будет использоваться для выполнения SQL-запросов на базе данных:
Statement stmt = con.createStatement();
Создаются три запроса на языке SQL: для обновления, удаления и вставки данных в таблицу "emp".
Запрос для обновления строки в таблице:
String query1 = "update emp set name = 'ravi' where id = 2";
Он обновляет имя сотрудника на 'ravi' в строке, где id равен 2.

Запрос для удаления строки в таблице:
String query2 = "delete from emp where id = 1";
Он удаляет строку из таблицы, где id равен 1.

Запрос для вставки новой строки в таблицу:

String query3 = "insert into emp values (1,'ronak','manager')";
Он вставляет новую строку в таблицу "emp" со значениями id=1, name='ronak', job='manager'.

Каждый запрос выполняется с помощью метода execute() объекта Statement:

stmt.execute(query1);
stmt.execute(query2);
stmt.execute(query3);

Создается объект ResultSet, который представляет результирующий набор для выполненного запроса на выборку из таблицы "emp".
ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

Результаты выборки из базы данных выводятся на экран с помощью цикла while. В нем для каждой строки из набора данных извлекаются значения столбцов, используя методы getInt() и getString(), и выводятся на экран:
while (rs.next()) {
    int id = rs.getInt("id");
    String name = rs.getString("name");
    String job = rs.getString("job");
    System.out.println(id+"   "+name+"    "+job);
}
Этот код в целом демонстрирует, как использовать JDBC для выполнения запросов на обновление, удаление и вставку данных в таблицы базы данных.







	*/
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch(ClassNotFoundException e) {
			System.out.println("Class not found "+ e);
		}
		try {
			Connection con = DriverManager.getConnection (
					"jdbc:derby://localhost:1527/testDb","username", "password");

			Statement stmt = con.createStatement();
			String query1 = "update emp set name = 'ravi' where id = 2";
			String query2 = "delete from emp where id = 1";
			String query3 = "insert into emp values (1,'ronak','manager')";

			stmt.execute(query1);
			stmt.execute(query2);
			stmt.execute(query3);

			ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
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
