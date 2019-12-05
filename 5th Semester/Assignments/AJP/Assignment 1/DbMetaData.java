import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DatabaseMetaData;

public class DbMetaData {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		
			
			Connection			con;
			ResultSet			rs;
			DatabaseMetaData 	db;
			
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password", "password");
			
			
			String	URL = "jdbc:mysql://localhost:3306/pes";
			
			con = DriverManager.getConnection(URL, props);
			
			db = con.getMetaData();
			
			rs = db.getTables("pes", null, "%", null);
			
			System.out.println("Table names : ");
			
			while (rs.next()) {
				System.out.println("Table name: "+rs.getString("Table_NAME"));
		        System.out.println("Table type: "+rs.getString("TABLE_TYPE"));
		        System.out.println("Table schema: "+rs.getString("TABLE_SCHEM"));
		        System.out.println("Table catalog: "+rs.getString("TABLE_CAT"));
		        System.out.println("-------------------------------------------------------");
			}		
			
			System.out.println();
			System.out.println();
			
			rs = db.getColumns("pes", null, "student", null);
			
			System.out.println("Column names : ");
			
			while (rs.next()) {
				System.out.println("Column name : "+rs.getString("COLUMN_NAME"));
			}
			
			con.close();
			rs.close();			
		}
		catch (Exception e) {
			
		}
	}
}
