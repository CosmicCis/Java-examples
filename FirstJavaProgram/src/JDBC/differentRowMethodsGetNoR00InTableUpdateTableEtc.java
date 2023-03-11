package JDBC;
import java.sql.*;
public class differentRowMethodsGetNoR00InTableUpdateTableEtc {
	/*
Problem Description
How to use different row methods to get no of rows in a table, update table etc?

Solution
Following example uses first, last, deletRow, getRow, insertRow methods of ResultSet to delete or insert a Row & move pointer of ResultSet to first or last Record.

Данный код на языке Java иллюстрирует использование различных методов для работы с записями таблицы в базе данных.

Сначала происходит подключение к базе данных с использованием JDBC, затем создается объект Statement для выполнения SQL-запросов. Запрос выбирает все записи из таблицы emp в базе данных.

Затем создается объект ResultSet, который представляет результат выполнения запроса. Также устанавливается тип прокручиваемости ResultSet.TYPE_SCROLL_SENSITIVE и режим обновления ResultSet.CONCUR_UPDATABLE для возможности изменения записей в ResultSet.

Далее, используя метод last() объекта ResultSet, курсор перемещается к последней записи в ResultSet, и метод getRow() возвращает количество записей в ResultSet.

Затем используется метод moveToInsertRow() для перемещения курсора ResultSet на позицию перед первой записью, чтобы добавить новую запись в таблицу emp. С помощью методов updateInt(), updateString() устанавливаются значения полей вставляемой записи. Затем вызывается метод insertRow(), чтобы добавить новую запись в таблицу emp.

Затем курсор перемещается на первую запись с помощью метода first() объекта ResultSet, и метод deleteRow() вызывается для удаления этой записи из таблицы emp.

После этого операции с базой данных завершаются, соединение с базой данных закрывается.

	*/
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:derby://localhost:1527/testDb","name","pass");

		Statement stmt = con.createStatement(
				ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		String query = "select * from emp";
		ResultSet rs = stmt.executeQuery(query);
		rs.last();
		System.out.println("No of rows in table = "+rs.getRow());

		rs.moveToInsertRow();
		rs.updateInt("id", 9);
		rs.updateString("name","sujay");
		rs.updateString("job", "trainee");
		rs.insertRow();

		System.out.println("Row added");
		rs.first();
		rs.deleteRow();
		System.out.println("first row deleted");
	}
}
