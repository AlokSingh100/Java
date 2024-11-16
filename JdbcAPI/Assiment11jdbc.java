package JdbcAPI;

import java.sql.*;
import java.util.Scanner;

public class Assiment11jdbc {
    public static void main(String[] args) throws SQLException, InterruptedException, ClassNotFoundException {
         Scanner scanner=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection cnot = DriverManager.getConnection("jdbc:mysql://localhost:3306/super", "root", "Aptech@123");
        System.out.println("Sql Connection Establish");

        Statement statement = cnot.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = statement.executeQuery("select *from Employees");


        int select;
        while (true){
            System.out.println("Select any one option");
        System.out.println("1.First");
        System.out.println("2.previous ");
        System.out.println("3.Last");
        System.out.println("4.next");
         select=scanner.nextInt();
        switch (select) {

            case 1:
                rs.first();
            System.out.println(STR."\{rs.getInt(1)}\t\{rs.getString(2)}\t\{rs.getString(3)}\t\{rs.getDate(4)}\t\{rs.getString(5)}");
break;
            case 2:
try {
    rs.previous();
    System.out.println(STR."\{rs.getInt(1)}\t\{rs.getString(2)}\t\{rs.getString(3)}\t\{rs.getDate(4)}\t\{rs.getString(5)}");
}catch (Exception e){
    System.out.println("This is last First Data");
}
break;
            case 3:
                    rs.last();
                    System.out.println(STR."\{rs.getInt(1)}\t\{rs.getString(2)}\t\{rs.getString(3)}\t\{rs.getDate(4)}\t\{rs.getString(5)}");
break;
            case 4:
 try {
                rs.next();
                System.out.println(STR."\{rs.getInt(1)}\t\{rs.getString(2)}\t\{rs.getString(3)}\t\{rs.getDate(4)}\t\{rs.getString(5)}");
  }catch (Exception e){
                    System.out.println("This is last Data");
                }
                break;
        }
        }
    }
}
