package mvc.Assiment;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class emp_main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        empDAO doa=new empDAO();
        emp_pojo em=new emp_pojo();
        Scanner scanner=new Scanner(System.in);


        while (true) {
              System.out.println("Select Any one Option");

            System.out.println("1: Display");
          System.out.println("2: Insert");
            System.out.println("3: Update");
            System.out.println("4: Delete");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                List<emp_pojo> allemp = doa.getAllemp();
                System.out.println("Employee ID  | Employee Name  | Employee Salary ");
                System.out.println("      -----------------------        ");
                for (emp_pojo o : allemp) {
                    System.out.println(o);
                }
                break;
                case 2:
                System.out.println("Enter Employee ID");
                int id = scanner.nextInt();
                System.out.println("Enter the Employee Name");
                String Name = scanner.next();
                System.out.println("Enter the Employee Salary ");
                int Salary = scanner.nextInt();
                em.setEmpname(Name);
                em.setSalary(Salary);
                em.setEmpid(id);
                doa.save(em.Employee(em));

break;
                case 3:
                System.out.println("Update The Details");
                    System.out.println("Enter the Id Where You want to Update");

                int idserch = scanner.nextInt();
                em.setEmpid(idserch);
                    System.out.println("Enter The Name");
                String name = scanner.next();
                    System.out.println("Enter the Salary");
                    int sal=scanner.nextInt();
                    em.setSalary(sal);
                em.setEmpname(name);
                doa.updateEmp(em.Employee(em));
                break;
                case 4:
                    System.out.println("Enter the Id what detail you want to deleate");
                    int ids=scanner.nextInt();
                    em.setEmpid(ids);
                    doa.deleteEmp(em.Employee(em));
                    break;
            }
        }
    }
}
