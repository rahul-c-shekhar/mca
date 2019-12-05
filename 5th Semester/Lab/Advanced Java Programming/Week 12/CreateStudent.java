package pes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateStudent
 */

public class CreateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateStudent() {
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
			CallableStatement	stmt;
			ResultSet			rs;
            
            String  URL = "jdbc:mysql://localhost:3306/PES";
             
            con = DriverManager.getConnection(URL, "root", "student");
            
            String srn = request.getParameter("srn");
            String name = request.getParameter("name");
            String course = request.getParameter("course");
            String sem = request.getParameter("sem");
             
            String query = "{CALL addStudent(?, ?, ?, ?)}";
             
            stmt = con.prepareCall(query);
             
            stmt.setString(1, srn);
            stmt.setString(2, name);
            stmt.setString(3, course);
            stmt.setString(4, sem);
             
            rs = stmt.executeQuery();
            
            out.print("Student record added.");
            
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
