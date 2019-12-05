package pes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class Second
 */

public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Second() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.setContentType("text/html"); 
		
        PrintWriter out = response.getWriter(); 
  
        HttpSession session = request.getSession(false); 
        
        int count = (int)session.getAttribute("count");
        
        if(session.isNew()) {
        	count = 0;
        }else {
        	count += 1;
        }
        
        session.setAttribute("count", count);
        
        Date creationTime = new Date(session.getCreationTime());
        Date lastAccess = new Date(session.getLastAccessedTime());
        String id = session.getId().toString();        
        String n = (String)session.getAttribute("uname"); 
        int interval = session.getMaxInactiveInterval();
        out.println("Hello " + n);
        out.println("<br/>Session ID : "+id);
        out.println("<br/>Session Creation time : "+creationTime);
        out.println("<br/>Session Last Accessed time : "+lastAccess);
        out.println("<br/>Maximum Inactive Interval : "+interval);
        out.println("<br/>Visit Count : "+count);       
  
        out.close(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
