package com.jdbcpratic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showSev
 */
@WebServlet("/showSev")
public class showSev extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showSev() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param ID 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response, int ID) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int satus=0;
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String mail=request.getParameter("mail");
		String Country=request.getParameter("Country");
		
		int c=0;
		
		
		
		
		
		try 
		{
			  Class.forName("com.mysql.cj.jdbc.Driver");
		        System.out.println("Driver register");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
		        System.out.println("Sql Connection Establish");
		        Statement stma= con.createStatement();
		        List<mainpojo> ns=new ArrayList<mainpojo>();
		        ResultSet rs = stma.executeQuery("Select* from emp");
		      
		        out.println("<table>");
		        out.println("    <tr>\r\n"
                		+ "<th>ID</th>\r\n"
                		+ "<th>Name</th>\r\n"
                		+ "<th>Password</th>\r\n"
                		+ "<th>Email</th>\r\n"
                		+ "<th>Country</th>\r\n"
                		+ "<th>Edit</th>\r\n"
                		+ "<th>Delete</th>\r\n"
                		+ "  </tr>  ");
                while(rs.next()) {
                	
                	out.println("<tr>\r\n"
                			+ "        <td>"+rs.getInt(1)+"</td>\r\n"
                			+ "        <td>"+rs.getString(2)+"</td>\r\n"
                			+ "        <td>"+rs.getString(3)+"+</td>\r\n"
                			+ "        <td>"+rs.getString(4)+"</td>\r\n"
                			+ "        <td>"+rs.getString(5)+"</td>\r\n"
                					+ "        <td><a href='edidsev?ID='"+rs.getInt(ID)+">Edit</a></td>\r\n"
                							+ "        <td><a href=''>Deleate</a></td>\r\n"
                			+ "    </tr>");
                	c++;
                }
                out.println("</table>");
                
		        
		        
		        
		        
		        con.close(); 
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage());
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
