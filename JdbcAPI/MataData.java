package JdbcAPI;

import java.sql.*;

public class MataData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection cnot= DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
        System.out.println("Sql Connection Establish");

        Statement statement=cnot.createStatement();
        ResultSet rs=statement.executeQuery("select *from Employees");
         while (rs.next()){
            System.out.println(STR."\{rs.getInt(1)}\t\{rs.getString(2)}\t\{rs.getString(3)}\t\{rs.getDate(4)}\t\{rs.getString(5)}");
        }
         ResultSetMetaData madata= rs.getMetaData();
        System.out.println(madata.getTableName(1));
int field_cout=madata.getColumnCount();
        System.out.println("number of collam  " + field_cout );
        for (int i = 1; i <field_cout ; i++) {
            System.out.println(STR."\{madata.getColumnName(i)}_____>\{madata.getColumnTypeName(i)}");
        }
    }
}
