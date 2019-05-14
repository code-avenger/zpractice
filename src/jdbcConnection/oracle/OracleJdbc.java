package jdbcConnection.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleJdbc {

	public static void main(String[] argv) {

		try (Connection conn = getConnection()) {
			System.out.println("Successfully Connected.");

		} catch (SQLException ex) {
			System.out.println("Catch block");
			ex.printStackTrace();
		}

	}

	public static Connection getConnection() {

		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "oracle";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();

		}
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(dbURL, username, password);

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}

		return connection;
	}

}
