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


		String dbURL = "jdbc:oracle:thin:@ma-redsdisd-ldb01.corp.apple.com:1546:redsd1d";
		String username = "REDSDD_TRIRIGA_USER";
		String password = "welcometoappleredsdd#123";

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
