import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Scanner	sc = new Scanner(System.in);
			
			Connection			con;
			Statement			stmt;
			ResultSet			rs = null;
			PreparedStatement	ps;
			
			String URL = "jdbc:mysql://localhost:3306/PES";
			
			con = DriverManager.getConnection(URL, "root", "student");
			
			String	fname = "", lname = "", updateQuery, displayQuery;
			
			System.out.print("Enter the First Name : ");
			fname = sc.next();
			System.out.print("Enter the Last Name : ");
			lname = sc.next();
			
			updateQuery = "update Employee set EmployeeFName = ?, EmployeeLName = ? where EmployeeID = 2";
			displayQuery = "select * from Employee";
			
			stmt = con.createStatement();
			ps = con.prepareStatement(updateQuery);
			
			ps.setString(1, fname);
			ps.setString(2, lname);
			
			int	result = ps.executeUpdate();
			
			if (result == 1) {
				rs = stmt.executeQuery(displayQuery);
				
				while (rs.next()) {
					System.out.println("Employee ID : "+rs.getInt(1));
					System.out.println("Employee First Name : "+rs.getString(2));
					System.out.println("Employee Last Name : "+rs.getString(3));
					System.out.println("Employee Department Name : "+rs.getString(4));
					System.out.println("Employee Salary : "+rs.getInt(5));
					System.out.println("-----------------------------------------------------");
				}
			}
			else
				System.out.println("Table not updated.");
			
			sc.close();
			con.close();
			stmt.close();
			rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
