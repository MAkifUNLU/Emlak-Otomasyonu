package Helper;

import java.sql.*;

public class DBConnection {
	Connection c = null;

	public DBConnection() {
	}
	
	public Connection connDb() {
		try {
			
			this.c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emlak?user=postgres&password=12345");
			System.out.println("Connect");
			return c;
		} catch (SQLException e) {
			System.out.println("Disconnect");
			e.printStackTrace();
		}
		return c;
	}
}
