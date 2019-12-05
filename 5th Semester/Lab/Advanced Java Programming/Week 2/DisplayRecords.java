import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayRecords {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection	con;
			Statement	stmt;
			ResultSet	rs;
			
			String	URL = "jdbc:mysql://localhost:3306/PES";
			
			con = DriverManager.getConnection(URL, "root", "student");
			
			String display_query = "select * from Employee";
			String delete_query = "delete from Employee where EmployeeID = 002";
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(display_query);
			
			while (rs.next()) {
				System.out.println("Employee ID : "+rs.getInt(1));
				System.out.println("Employee First Name : "+rs.getString(2));
				System.out.println("Employee Last Name : "+rs.getString(3));
				System.out.println("Employee Department Name : "+rs.getString(4));
				System.out.println("Employee Salary : "+rs.getInt(5));
				System.out.println("-----------------------------------------------------");
			}
			
			System.out.println("\nAfter deleting the record : ");
			
			int count = stmt.executeUpdate(delete_query);
			rs = stmt.executeQuery(display_query);
			
			System.out.println();
			System.out.println("Number of records updated : "+count);
			System.out.println();
			
			while (rs.next()) {
				System.out.println("Employee ID : "+rs.getInt(1));
				System.out.println("Employee First Name : "+rs.getString(2));
				System.out.println("Employee Last Name : "+rs.getString(3));
				System.out.println("Employee Department Name : "+rs.getString(4));
				System.out.println("Employee Salary : "+rs.getInt(5));
				System.out.println("-----------------------------------------------------");
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
