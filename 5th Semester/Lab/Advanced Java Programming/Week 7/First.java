package pes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class First
 */

public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try { 			 			
            response.setContentType("text/html");  
            PrintWriter out = response.getWriter(); 
            int value = 0;
  
            String name = request.getParameter("username"); 
            String pass = request.getParameter("password");
            out.print("Welcome " + name); 
  
            HttpSession session = request.getSession(); 
            
            session.setAttribute("uname", name); 
            session.setAttribute("pass", pass);
            session.setAttribute("count", value);
            
            out.print("<br/>Username : "+name);
            out.print("<br/>Password : "+pass);
            out.print("<br/><a href='servlet2'>Click here to move next.</a>");
  
            out.close(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
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
