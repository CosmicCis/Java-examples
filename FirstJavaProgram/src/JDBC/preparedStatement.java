package JDBC;
import java.sql.*;
public class preparedStatement {
	/*
Problem Description
How to use Prepared Statement in Java?

Solution
Following example uses PrepareStatement method to create PreparedStatement. It also uses setInt & setString methods of PreparedStatement to set parameters of PreparedStatement.

Данный Java-код демонстрирует использование подготовленного запроса (PreparedStatement) для выполнения запроса к базе данных с помощью JDBC.

Сначала происходит подключение к базе данных, указанной в строке подключения. Затем создается PreparedStatement для выполнения операции вставки записи в таблицу "emp". Этот PreparedStatement содержит три параметра, которые будут заданы перед выполнением запроса. Для этого используются методы setInt() и setString() класса PreparedStatement.

Далее, задаются значения параметров (id, name, job) и вызывается метод executeUpdate() для выполнения операции вставки.

Затем создается объект класса Statement, который используется для выполнения запроса на выборку данных из таблицы "emp". Результат запроса хранится в объекте ResultSet, который проходится в цикле while и выводится на экран в формате "Id Name Job".

В итоге, программа подключается к базе данных, вставляет запись с заданными параметрами и выводит содержимое таблицы на экран.

	*/
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection (
				"jdbc:derby://localhost:1527/testDb","name","pass");
		PreparedStatement updateemp = con.prepareStatement(
				"insert into emp values(?,?,?)");

		updateemp.setInt(1,23);
		updateemp.setString(2,"Roshan");
		updateemp.setString(3, "CEO");
		updateemp.executeUpdate();

		Statement stmt = con.createStatement();
		String query = "select * from emp";
		ResultSet rs =  stmt.executeQuery(query);
		System.out.println("Id Name    Job");

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String job = rs.getString("job");
			System.out.println(id + "  " + name+"   "+job);
		}
	}
}
