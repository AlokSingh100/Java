package JdbcAPI;

import java.sql.*;
import java.util.Scanner;

public class assiment11_table {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         Scanner scanner=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection cnot = DriverManager.getConnection("jdbc:mysql://localhost:3306/super", "root", "Aptech@123");
        System.out.println("Sql Connection Establish");

        Statement statement = cnot.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

//        ResultSet rs = statement.executeQuery("'Show table'");
//        while (rs.next()) {
//            System.out.println(rs.getMetaData());
//        }

        DatabaseMetaData result=cnot.getMetaData();

ResultSet tables = result.getTables(null, null, "%", new String[]{"TABLE"});

            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println(STR."Table Name: \{tableName}");
            }
        System.out.println("Do you want to creat a new table [Y/N]");
            String select =scanner.next();
            if (select.equals("N")|| select.equals("n")){
                System.out.println("Enter The Table name");
            String Tablename=scanner.next();
ResultSet rs = statement.executeQuery("select * from "+Tablename);

            } else if (select.equals("Y")|| select.equals("y")) {
                System.out.println("Enter The Table name");
                String Table_name=scanner.next();
                String value,add = "",chose,last = "";
                while (true){

                    System.out.println("Enter The Column Name And Its Datatype");
                    System.out.println("Example :- LastName varchar(255)");
                    value=scanner.nextLine();
                    System.out.println(" ");
                    System.out.println(" ");

                    System.out.println("Do you want to add more Column [y/n]");

                    chose=scanner.next();
                    if (chose .equals("Y")|| chose.equals("y")) {
                         add= add+value+" , ";
                        continue;

                    } else if (chose .equals("N")|| chose.equals("n")) {
                        last=last+value;
                        break;
                    }


                }

                PreparedStatement calum=cnot.prepareStatement("Create Table "+Table_name+"("+add+" "+last);
calum.executeUpdate();





            }


    }
}
