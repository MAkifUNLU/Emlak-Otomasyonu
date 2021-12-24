package emlakOtomasyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dataBase {
	
	static String url = "jdbc:postgresql://localhost:5432/emlak";
	static Connection conn = null;
	
	static void connect() {
		try {
			conn = DriverManager.getConnection(url,"postgres","12345");
			System.out.println("Connection Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static ResultSet list(String query) {
		try {
			Statement st = conn.createStatement();
			//alt satýra bak deðiþebililr
			ResultSet rs = st.executeQuery(query);
			return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
