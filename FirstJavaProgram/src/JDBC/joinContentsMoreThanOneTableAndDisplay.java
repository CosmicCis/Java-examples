package JDBC;
import java.sql.*;
public class joinContentsMoreThanOneTableAndDisplay {
	/*
Problem Description
How to join contents of more than one table & display?

Solution
Following example uses inner join sql command to combine data from two tables. To display the contents of the table getString() method of resultset is used.

Этот код является примером использования команды SQL "inner join" для объединения данных из двух таблиц в базе данных и вывода результатов в консоль.

В начале кода используется Java-библиотека для работы с базами данных JDBC. Затем создается объект соединения с базой данных, используя URL, имя пользователя и пароль для доступа к базе данных.

Далее создается объект "Statement", который позволяет выполнить SQL-запрос в базе данных. В этом примере SQL-запрос объединяет две таблицы "author" и "books" на основе значения столбца "AUTHORID". Результаты запроса сохраняются в объекте "ResultSet".

Затем в цикле "while" происходит итерация по результатам запроса и выводятся на консоль значения из столбцов "fname", "lname" и "isbn". Метод "rs.getString()" используется для получения значений из столбцов с помощью их названий.

В конце выполнения программы закрывается соединение с базой данных.

Таким образом, этот код выполняет запрос к базе данных, используя команду SQL "inner join", объединяет данные из двух таблиц и выводит результаты на консоль.

	*/
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection (
				"jdbc:derby://localhost:1527/testDb","username", "password");

		Statement stmt = con.createStatement();
		String query ="SELECT fname,lname,isbn from author inner join books on author.AUTHORID = books.AUTHORID";
		ResultSet rs = stmt.executeQuery(query);
		System.out.println("Fname  Lname   ISBN");

		while (rs.next()) {
			String fname = rs.getString("fname");
			String lname = rs.getString("lname");
			int isbn = rs.getInt("isbn");
			System.out.println(fname + "  " + lname+"   "+isbn);
		}
		System.out.println();
		System.out.println();
	}
}
