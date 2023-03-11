package JDBC;
import java.sql.*;
public class differentMethodsColumnCountNoColumnsGetColumnNameGetColumnType {
	/*
Problem Description
How to use different methods of column to Count no of columns, get column name, get column type etc?

Solution
Following example uses getColumnCount, getColumnName, getColumnTypeName, getColumnDisplaySize methods to get the no of columns, name of the column or type of the column in the table.
Данный код демонстрирует, как использовать различные методы столбцов (columns) в таблице в Java для получения количества столбцов, имени столбца и типа столбца.

Код начинается с подключения к базе данных "testDb" с помощью драйвера Apache Derby и установления соединения с помощью имени пользователя и пароля. Затем создается объект Statement, который используется для выполнения запросов к базе данных. В данном случае запросом является выборка всех данных из таблицы "emp" и сортировка их по имени.

Затем создается объект ResultSet, который содержит результат выполнения запроса. Объект ResultSetMetaData используется для получения метаданных о столбцах результата запроса.

Далее используются методы getColumnCount(), getColumnName(), getColumnTypeName(), getColumnDisplaySize() для получения информации о столбцах в таблице. getColumnCount() возвращает количество столбцов в таблице, getColumnName() возвращает имя столбца по индексу, getColumnTypeName() возвращает тип столбца по индексу, а getColumnDisplaySize() возвращает размер столбца по индексу.

Результатом выполнения программы является вывод информации о столбцах таблицы в консоль.
	*/

	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:derby://localhost:1527/testDb","name","pass");

		Statement stmt = con.createStatement();
		String query = "select * from emp order by name";

		ResultSet rs = stmt.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();

		System.out.println("no of columns in the table = "+ rsmd.getColumnCount());
		System.out.println("Name of the first column "+ rsmd.getColumnName(1));
		System.out.println("Type of the second column "+ rsmd.getColumnTypeName(2));
		System.out.println("No of characters in 3rd column "+ rsmd.getColumnDisplaySize(2));
	}
}
