package mvc.Assiment;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class emp_main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        empDAO doa=new empDAO();
        emp_pojo em=new emp_pojo();
        Scanner scanner=new Scanner(System.in);
        List <emp_pojo> allemp=doa.getAllemp();
        System.out.println("Employee ID  | Employee Name  | Employee Salary ");
        System.out.println("      -----------------------        ");
        for (emp_pojo o:allemp){
            System.out.println(o);
        }
        System.out.println("Enter Employee ID");
        int id=scanner.nextInt();
        System.out.println("Enter the Employee Name");
        String Name=scanner.next();
        System.out.println("Enter the Employee Salary ");
        int Salary=scanner.nextInt();
//        em.setEmpname(Name);
//        em.setSalary(Salary);
        doa.save(em.Employee(id,Name,Salary));

    }
}
