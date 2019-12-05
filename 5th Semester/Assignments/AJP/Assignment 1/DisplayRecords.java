import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DisplayRecords {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		
			
			Connection	con;
			Statement	stmt;
			ResultSet	rs;
			
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password", "password");
			
			
			String	URL = "jdbc:mysql://localhost:3306/pes";
			
			con = DriverManager.getConnection(URL, props);
			
			String	query = "select * from student";
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println("Student ID : "+rs.getInt(1));
				System.out.println("Student Name : "+rs.getString(2));
				System.out.println("SRN : "+rs.getString(3));
				System.out.println("Course : "+rs.getString(4));
				System.out.println("--------------------------------------------------");
			}
			
			con.close();
			stmt.close();
			rs.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
