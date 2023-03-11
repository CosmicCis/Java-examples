package JDBC;
import java.sql.*;
public class connectDatabaseUsingJDBC {
	/*
Problem Description
How to connect to a database using JDBC? Assume that database name is testDb and it has table named employee which has 2 records.

Solution
Following example uses getConnection, createStatement & executeQuery methods to connect to a database & execute queries.
Данный код демонстрирует, как подключиться к базе данных с помощью JDBC (Java Database Connectivity). Предполагается, что имя базы данных - testDb, и в ней есть таблица employee, содержащая 2 записи.

В начале кода выполняется загрузка класса org.apache.derby.jdbc.ClientDriver, который представляет драйвер JDBC для базы данных Apache Derby. Затем создается объект Connection, который представляет соединение с базой данных, используя метод getConnection() класса DriverManager, который принимает URL-адрес базы данных, имя пользователя и пароль в качестве параметров.

Далее создается объект Statement, который представляет SQL-инструкцию, выполняемую на базе данных. Метод createStatement() вызывается на объекте Connection для создания объекта Statement. Метод executeQuery() вызывается на объекте Statement, чтобы выполнить запрос SQL, переданный в виде строки.

Результат запроса сохраняется в объекте ResultSet. Затем с помощью метода next() объекта ResultSet происходит итерация по записям в результате запроса, чтобы подсчитать количество записей в таблице. Наконец, в конце кода выводится на экран количество записей в таблице.

Обработка исключений также присутствует в коде для обработки возможных исключений ClassNotFoundException и SQLException, которые могут возникнуть при выполнении соответствующих операций.
	*/
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch(ClassNotFoundException e) {
			System.out.println("Class not found "+ e);
		}
		System.out.println("JDBC Class found");
		int no_of_rows = 0;

		try {
			Connection con = DriverManager.getConnection (
					"jdbc:derby://localhost:1527/testDb","username", "password");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery ("SELECT * FROM employee");
			while (rs.next()) {
				no_of_rows++;
			}
			System.out.println("There are "+ no_of_rows + " record in the table");
		} catch(SQLException e){
			System.out.println("SQL exception occured" + e);
		}
	}
}
