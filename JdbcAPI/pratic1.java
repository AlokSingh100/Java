package JdbcAPI;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.sql.*;

public class pratic1
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection cnot=DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
        System.out.println("Sql Connection Establish");
        Statement stm=cnot.createStatement();
        ResultSet rs=stm.executeQuery("Select* from Employees");
        while (rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDate(4)+"\t"+rs.getString(5));
        }
        PreparedStatement prps=cnot.prepareStatement("Update Employee set ");
    }
}