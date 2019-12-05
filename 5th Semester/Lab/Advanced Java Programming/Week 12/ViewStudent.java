package pes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewStudent
 */
@WebServlet("/ViewStudent")
public class ViewStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
			Connection 			con;
			Statement			stmt;
			ResultSet			rs;
            
            String  URL = "jdbc:mysql://localhost:3306/PES";
             
            con = DriverManager.getConnection(URL, "root", "student");
            
            String srn = request.getParameter("srn");
            String name = request.getParameter("name");
            String course = request.getParameter("course");
            String sem = request.getParameter("sem");
             
            String query = "select * from Student";
            
            stmt = con.createStatement();
            
            rs = stmt.executeQuery(query);
            
            out.print("<h1>Student Records</h1>");
            
            while (rs.next()) {
                out.println("Student SRN : "+rs.getString(1));
                out.println("<br/>Student Name : "+rs.getString(2));
                out.println("<br/>Course : "+rs.getString(3));
                out.println("<br/>Semester : "+rs.getString(4));      
                out.println("<br/>-----------------------------------------------------");
            }
            
            
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
