package com.jdbcpratic;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mvc {

	   List <mainpojo> e;
	   mainpojo ma= new mainpojo();

	   Connection connection() throws SQLException, ClassNotFoundException {

	        Class.forName("com.mysql.cj.jdbc.Driver");
	          System.out.println("Driver register");
	          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
	          System.out.println("Sql Connection Establish");

	       return con;
	  }

	      public int save(project em) {

	       Connection conect;
	       try {
	           conect=connection();

	           String a= "'" +ma.name+"','"+ma.password+"','"+ma.mail+"','"+ma.country+"'";
	          
	           System.out.println(a);
	           PreparedStatement insert= conect.prepareStatement("Insert into employe values (" +a+");");

	  insert.executeUpdate();
	       }catch (Exception a){
	           System.out.println(a);
	       }



	          return 0;
	      }

	      /**
	       * @return
	       */
	      public List<mainpojo> getAllemp() throws SQLException, ClassNotFoundException {
	          Connection con;
//	          Scanner scanner=new Sacanner(System.in);
	          List<mainpojo>  empobject=new ArrayList<mainpojo> ();
	          try {
	              con= connection();
	              Statement Stat=con.createStatement();
	              ResultSet resultSet=Stat.executeQuery("Select * from emp");
	              while (resultSet.next()){
	            	  mainpojo ob=new mainpojo();
	                  ob.setId(resultSet.getString("id"));
	                  ob.setName(resultSet.getString("name"));
	                  ob.setPassword(resultSet.getString("password"));
	                  ob.setMail(resultSet.getString("mail"));
	                  ob.setCountry(resultSet.getString("country"));
	                  empobject.add(ob);
       }


	          } catch (Exception e){
	              System.out.println(e.getMessage());

	          }

	          return empobject;
	      }

	      /**
	       * @param empno
	       * @return
	       */
	    
//	      public emp_pojo getEmp(int empno) {
//	          return null;
//	      }

	      /**
	       * @param e
	       */

	      public void updateEmp(matrix e) {

	          Connection con ;
	          try {
	  con=connection();
//	  String updates= "update employe set Name= '"+e.empname+"' where EmpID= "+e.empid;

	       //       PreparedStatement update = con.prepareStatement(updates);
	  //update.setString(1,e.empname);
	  //update.setInt(2,e.empid);
	           //   update.executeUpdate();
	        //      System.out.println(updates);
	          }catch (Exception ex){
	              System.out.println(ex.getMessage());
	          }
	      }

	      /**
	       * @param e
	       */
//	      public void deleteEmp(emp_pojo e) {
//	          Connection con;
//	          try {
//	              con=connection();
//	           String del=" delete from employe where EmpID="+ e.empid;
//	  PreparedStatement deleate=con.prepareStatement(del);
//	  deleate.executeUpdate();
//
//	          }catch (Exception ex ) {
//	              System.out.println(ex);
//	          }
//	      }
	

}
