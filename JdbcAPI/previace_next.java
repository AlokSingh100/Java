package JdbcAPI;

import java.sql.*;
import java.util.Scanner;

public class previace_next {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection cnot = DriverManager.getConnection("jdbc:mysql://localhost:3306/super", "root", "Aptech@123");
        System.out.println("Sql Connection Establish");

        Statement statement = cnot.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select *from Employees");
        rs.last();
        int cout=1;
        while (rs.previous()) {
         if (cout==2)
             Thread.sleep(2000);
         cout++;
            System.out.println(STR."\{rs.getInt(1)}\t\{rs.getString(2)}\t\{rs.getString(3)}\t\{rs.getDate(4)}\t\{rs.getString(5)}");
        }
        System.out.println();
        System.out.println();
rs.last();
while (rs.next()){
    Thread.sleep(5000);
     System.out.println(STR."\{rs.getInt(1)}\t\{rs.getString(2)}\t\{rs.getString(3)}\t\{rs.getDate(4)}\t\{rs.getString(5)}");
}



    }
}