package batter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/countinga")
public class counting extends HttpServlet {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public counting() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	  ServletConfig conf=null;
	  public void init(ServletConfig config) throws ServletException {
		  this.conf=conf;
		  System.out.println("congig");
		// TODO Auto-generated method stub

	}
	  int a=0;
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			PrintWriter out=response.getWriter();
			out.println("<h1>My first Page in Servlet</h1>");
			out.println("<b>Have a ssss nice Day      !<br>");
			System.out.println(a++);
		
			
		
			
		}
	
	  
//	  public void service(ServletRequest req, ServletResponse res)
//			  throws ServletException, IOException {
//			  // request handling code
//		  
//		  System.out.println("Hella");
//			  }
//	  
	  public void destroy()  
      { 
         System.out.println(a); 
      } 
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}
	  
}
