package batter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/weome")
public class count extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	  public count() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			PrintWriter out=response.getWriter();
			out.println("<h1>My first Page in Servlet</h1>");
			out.println("<b>Have a ssss nice Day!<br>");
			out.print("Local Name "+ request.getLocalName());
			
			Enumeration ob=request.getHeaderNames();
			
			while(ob.hasMoreElements()) {
				out.println(ob.nextElement()+"<br>");
			}
			
		}

}
