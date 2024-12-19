package batter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class best
 */
@WebServlet("/welcome")
public class happy implements Servlet {
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public happy() {
        super();
        // TODO Auto-generated constructor stub
    }

    ServletConfig conf=null;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("cii");

    	this.conf=conf;
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("it is distroy");
	}


	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return conf;
		
	}


	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=res.getWriter();
		out.println("<h1>My first Page in Servlet</h1>");
		out.println("<b>Have a ssss nice Day!");
	}


	

}
