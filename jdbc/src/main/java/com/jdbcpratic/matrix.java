package com.jdbcpratic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class matrix
 */
@WebServlet("/matrix")
public class matrix extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public matrix() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter out=response.getWriter();


	mvc ob1=new mvc();

		List<mainpojo> ns= new  ArrayList<>();

	try {
				
			ns=ob1.getAllemp();
			System.out.println(ns);
			
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
	       
            for(mainpojo rs:ns) 
            {

            	System.out.println(rs.getId());
            	out.println("<tr>\r\n"
            			+ "        <td>"+rs.getId()+"</td>\r\n"
            			+ "        <td>"+rs.getName()+"</td>\r\n"
            			+ "        <td>"+rs.getPassword()+"+</td>\r\n"
            			+ "        <td>"+rs.getMail()+"</td>\r\n"
            			+ "        <td>"+rs.getCountry()+"</td>\r\n"
            					+ "        <td><a href='edidsev?id='"+rs.getId()+"'>Edit</a></td>\r\n"
            							+ "        <td><a href=''>Deleate</a></td>\r\n"
            			+ "    </tr>");
            
            }
	}
            
           catch (Exception e) {
			// TODO: handle exception
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
