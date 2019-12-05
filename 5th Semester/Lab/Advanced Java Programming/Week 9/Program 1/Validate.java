package pes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate
 */

public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validate() {
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
			
			String name = request.getParameter("username");
			String pass = request.getParameter("password");
			
			Boolean flag = false;
			
			HttpSession session = request.getSession();
			
			session.setAttribute("uname", name);
			session.setAttribute("flag", flag);
			
			if (name.equals("admin") && pass.equals("admin")) {
				RequestDispatcher rd = request.getRequestDispatcher("Welcome");
				rd.forward(request, response);
			} else {
				out.print("Sorry wrong username and password");
				out.print("<br/><a href='index.html'>Click here to go back!!</a>");
			}			
			
			out.close();
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
