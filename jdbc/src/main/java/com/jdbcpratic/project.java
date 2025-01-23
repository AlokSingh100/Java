package com.jdbcpratic;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class project
 */
@WebServlet("/project")
public class project extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public project() {
        super();
        // TODO Auto-generated constructor stub
    }
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	ArrayList<mainpojo> main1=new ArrayList<mainpojo>();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int satus=0;
		String id = request.getParameter("id");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String mail=request.getParameter("mail");
		String Country=request.getParameter("Country");
		
		out.println(name);
		out.println(pass);
		out.println(mail);
		out.println(Country);
		mainpojo ma=new mainpojo(id,name,pass,Country,mail);
		ma.setName(name);
		ma.setCountry(Country);
		ma.setMail(mail);
		ma.setPassword(pass);
		
		
		String a= "'" +ma.name+"','"+ma.password+"','"+ma.mail+"','"+ma.country+"'";
//		  ArrayList<Integer> id = new ArrayList<Integer>();
//		  ArrayList<String> nam = new ArrayList<String>();
//		  ArrayList<String> passw = new ArrayList<String>();
//		  ArrayList<String> email = new ArrayList<String>();
//		  ArrayList<String> coun = new ArrayList<String>();
//		out.println(a);
		try 
		{
			  Class.forName("com.mysql.cj.jdbc.Driver");
		        System.out.println("Driver register");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
		        System.out.println("Sql Connection Establish");
		        Statement stma= con.createStatement();
		        System.out.println("statement");
				PreparedStatement ps=con.prepareStatement("Insert into emp(Name,Password,Mail,Country) values (" +a+");");
				satus=ps.executeUpdate();
				if (satus<=1) {
					
					out.println("data enter sussfully ");
				}
				
//				for {
//					
//					
//				}
				

              
//                    ResultSet rs = stma.executeQuery("Select* from emp");
                   
                   
//                    while (rs.next()) {
//                    id.add(rs.getInt(1));
//                    	nam.add(rs.getString(2));
//                    	passw.add(rs.getString(3));
//                    	email.add(rs.getString(4));
//                    	coun.add(rs.getString(5));
//                    }
                     
                 
//                    for (int i = 0; i < id.size(); i++) {
//                      out.println(id.get(i));
//                      out.println(nam.get(i));
//                      out.println(passw.get(i));
//                      out.println(email.get(i));
//                      out.println(coun.get(i));
//                    }
//                    int c=0;
//                    out.println("    <table>\r\n"
//                    		+ "<th>ID</th>\r\n"
//                    		+ "<th>Name</th>\r\n"
//                    		+ "<th>Password</th>\r\n"
//                    		+ "<th>Email</th>\r\n"
//                    		+ "<th>Country</th>\r\n"
//                    		+ "<th>Edit</th>\r\n"
//                    		+ "<th>Delete</th>\r\n"
//                    		+ "    </table>");
                    
//                    out.println("<table>");
//                    while(rs.next()) {
//                    	
//                    	out.println("<tr>\r\n"
//                    			+ "        <td>"+id.get(c)+"</td>\r\n"
//                    			+ "        <td>"+nam.get(c)+"</td>\r\n"
//                    			+ "        <td>"+passw.get(c)+"+</td>\r\n"
//                    			+ "        <td>"+email.get(c)+"</td>\r\n"
//                    			+ "        <td>"+coun.get(c)+"</td>\r\n"
//                    			+ "    </tr>");
//                    	c++;
//                    }
//                    out.println("</table>");
                    
                    
                    
              
                    con.close();
		 }
		catch (Exception e) {
			out.println(e.getMessage());
		}
			
		
	}

	private void println(String name) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}



}
