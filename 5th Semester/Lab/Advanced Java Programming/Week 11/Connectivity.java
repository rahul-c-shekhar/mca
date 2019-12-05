package pes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
	
	public static Connection con;

	public static void createConnection(Connection cont) {
		con = cont;
	}
	
	public Connection getConnection() {
		return Connectivity.con;
	}
	
	public static void main(String[] args) throws SQLException {
		try {
			Connection con;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String  URL = "jdbc:mysql://localhost:3306/pes";
			
			con = DriverManager.getConnection(URL, "root", "student");
			
			createConnection(con);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
