package com.jdbcpratic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class edidsev
 */
@WebServlet("/edidsev")
public class edidsev extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edidsev() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
//		 List<mainpojo> ns=new ArrayList<mainpojo>();
		mainpojo ma=new mainpojo();
		String Id=request.getParameter("id");
		
		
		out.println(
				"<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h1>\r\n"
				+ "Edit New Employee\r\n"
				+ "</h1>\r\n"
				+ "<form action=\"project\">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "<pre>\r\n"
				+ "Name:- 		<input type=\"text\" name=\"name\" value=\""+ma.getName()+">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Password:- 	<input type=\"password\" name=\"pass\" value=\""+ma.getPassword()+">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Mail:- 		<input type=\"text\" name=\"mail\" value=\""+ma.getMail()+">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Country:- 	<select name=\"Country\" id=\"Country\" value=\""+ma.getCountry()+"><br>\r\n"
				+ "        <option value=\"India\">India</option>\r\n"
				+ "        <option value=\"USA\">USA</option>\r\n"
				+ "        <option value=\"China\">China</option>\r\n"
				+ "        <option value=\"UK\">UK</option>\r\n"
				+ "      </select>\r\n"
				+ "      \r\n"
				+ "      \r\n"
				+ "      <input type=\"submit\">\r\n"
				+ "</pre>\r\n"
				+ "</form>\r\n"
				+ " \r\n"
				+ "</body>\r\n"
				+ "</html>"
				
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
