import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class CalableStatement {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		
			
			Connection			con;
			CallableStatement	stmt;
			ResultSet			rs;
			
			Scanner sc = new Scanner(System.in);
			
			int		id;
			String	name,srn;
			
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password", "password");
			
			
			String	URL = "jdbc:mysql://localhost:3306/pes";
			
			con = DriverManager.getConnection(URL, props);
			
			String query = "{CALL studentUpsert(?, ?, ?)}";
			
			System.out.print("Enter a Student ID : ");
			id = sc.nextInt();
			System.out.print("Enter updated Student Name : ");
			name = sc.next();
			System.out.print("Enter updated Student SRN : ");
			srn = sc.next();
			
			System.out.println();
			System.out.println();
			
			stmt = con.prepareCall(query);
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, srn);
			
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				System.out.println("Student ID : "+rs.getInt(1));
				System.out.println("Student Name : "+rs.getString(2));
				System.out.println("SRN : "+rs.getString(3));
				System.out.println("Course : "+rs.getString(4));
				System.out.println("------------------------------------------------");
			}
			
			con.close();
			stmt.close();
			rs.close();
			sc.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
