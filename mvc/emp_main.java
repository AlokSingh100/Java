package mvc;

import java.sql.SQLException;
import java.util.List;

public class emp_main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        empDAO doa=new empDAO();
        emp_pojo em=new emp_pojo();
        List <emp_pojo> allemp=doa.getAllemp();
        System.out.println("Employee ID  | Employee Name  | Employee Salary ");
        System.out.println("      -----------------------        ");
        for (emp_pojo o:allemp){
            System.out.println(o);
        }
    }
}
