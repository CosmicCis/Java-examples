package JDBC;
import java.sql.*;
public class commitQuery {
	/*
Problem Description
How to commit a query?

Solution
Following example uses connection.commit() method to execute a query.
Этот код является примером использования метода "commit()" для подтверждения выполнения транзакции в базе данных.

Сначала в коде создается объект "Connection" с помощью класса "DriverManager" для соединения с базой данных. Затем создается объект "Statement", который используется для выполнения SQL-запросов в базе данных.

Далее в коде определяются три SQL-запроса: два запроса на добавление записей в таблицу "emp" и один запрос на выборку всех записей из этой таблицы.

Для выполнения запросов используется метод "executeQuery()", который возвращает объект "ResultSet", содержащий результаты запроса. Затем в цикле while мы перебираем каждую строку в результате запроса и увеличиваем счетчик "no_of_rows" для подсчета количества строк в таблице "emp".

После этого устанавливается режим автоматической фиксации транзакции "false" с помощью метода "setAutoCommit()", что означает, что изменения в базе данных не будут автоматически фиксироваться при выполнении SQL-запросов.

Затем выполняются два запроса на добавление записей в таблицу "emp" с помощью метода "execute()". После этого вызывается метод "commit()", который фиксирует изменения в базе данных.

Затем выполняется запрос на выборку всех записей из таблицы "emp" и считается количество строк в результате запроса с помощью цикла "while".

В конце кода соединение с базой данных закрывается методом "close()".

Таким образом, этот код подтверждает выполнение транзакции в базе данных с помощью метода "commit()" после выполнения нескольких SQL-запросов и отключает автоматическую фиксацию изменений в базе данных при выполнении SQL-запросов.
	*/
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection (
				"jdbc:derby://localhost:1527/testDb","name","pass");

		Statement stmt = con.createStatement();
		String query = "insert into emp values(2,'name1','job')";
		String query1 ="insert into emp values(5,'name2','job')";
		String query2 = "select * from emp";

		ResultSet rs = stmt.executeQuery(query2);
		int no_of_rows = 0;

		while (rs.next()) {
			no_of_rows++;
		}
		System.out.println("No. of rows before commit statement = "+ no_of_rows);
		con.setAutoCommit(false);
		stmt.execute(query1);
		stmt.execute(query);
		con.commit();
		rs = stmt.executeQuery(query2);
		no_of_rows = 0;

		while (rs.next()) {
			no_of_rows++;
		}
		System.out.println("No. of rows after commit statement = "+ no_of_rows);
		con.close();
	}
}
