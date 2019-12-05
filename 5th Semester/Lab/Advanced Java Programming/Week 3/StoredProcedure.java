import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StoredProcedure {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Scanner sc = new Scanner(System.in);
			
			Connection			con;
			CallableStatement	stmt;
			ResultSet			rs;
			
			String	URL = "jdbc:mysql://localhost:3306/PES";
			
			con = DriverManager.getConnection(URL, "root", "student");
			
			String fname, lname, query;
			
			System.out.print("Enter First Name : ");
			fname = sc.next();
			System.out.print("Enter Last Name : ");
			lname = sc.next();
			
			query = "{CALL getEmpInfo(?,?)}";
			
			stmt = con.prepareCall(query);
			
			stmt.setString(1, fname);
			stmt.setString(2, lname);
			
			rs = stmt.executeQuery();
			
			System.out.println();
			System.out.println();
			
			while (rs.next()) {
				System.out.println("Employee ID : "+rs.getInt(1));
				System.out.println("Employee First Name : "+rs.getString(2));
				System.out.println("Employee Last Name : "+rs.getString(3));
				System.out.println("Employee Department Name : "+rs.getString(4));
				System.out.println("Employee Salary : "+rs.getInt(5));
				System.out.println("-----------------------------------------------------");
			}
			
			sc.close();
			con.close();
			stmt.close();
			rs.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
