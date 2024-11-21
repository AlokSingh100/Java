package JdbcAPI;

import java.sql.*;
import java.util.*;

import static java.time.chrono.JapaneseEra.values;


public class EmpDetail {




    public static void main(String[] args) throws SQLException, ClassNotFoundException, InputMismatchException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection cnot=DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
        System.out.println("Sql Connection Establish");
        Statement stma=cnot.createStatement();


        List<Employee> emp=new ArrayList<Employee>();
        Scanner scanner=new Scanner(System.in);
        int select = 0, fet=0,newsal = 0;
        int idt=0,sid=0,nit,fir,sip,dat,option;
        String name,sir,lat;
        int salary,tir ;
         PreparedStatement stm = null;

        while (true){
            System.out.println("Select Any one Option");
            System.out.println("1: Insert");
            System.out.println("2: Display");
            System.out.println("3: Search");
            System.out.println("4: Update");
            System.out.println("5: Delete");
            System.out.println("6: Sorting");

            select=scanner.nextInt();
            switch (select){
                case 1:
//                    System.out.println("Enter the Employee Id");
//                    idt=scanner.nextInt();
                    System.out.println("Enter Employee Name");
                    name=scanner.next();
                    System.out.println("Enter the Employee Salary");
                    salary=scanner.nextInt();
//                    emp.add(new Employee(idt,name,salary));
//                     PreparedStatement prepared=cnot.prepareStatement("Insert into employe values(?,?,?)");
//                      prepared.setInt(1,idt);
//                      prepared.setString(2, name);
//                      prepared.setInt(3,salary);
//                    System.out.println("Data Insert Successfully");

try {

    
    String insert=(STR."Insert into employe (Name,Salary) values('\{name}',\{salary});");
    PreparedStatement prepare = cnot.prepareStatement(insert);
    prepare.executeUpdate();
}catch (Exception e){
    System.out.println(e.getMessage());
}
                    break;
                case 2:
                    System.out.println("Employee ID  | Employee Name  | Employee Salary ");
                    try {
                        ResultSet rs = stma.executeQuery("Select* from employe");
                        while (rs.next()) {
                            System.out.println(STR."\t\{rs.getInt(1)}\t\t\t\{rs.getString(2)}\t\t\t\{rs.getInt(3)}");
                        }
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Enter the Employee id ");
                    sid=scanner.nextInt();
                    System.out.println("Employee ID  | Employee Name  | Employee Salary ");

//                    for(int i=0;i<= emp.size();i++) {
//
////                        System.out.println("sid = "+ sid);
////                        System.out.println("idt ="+emp.get(i).getEmpid() );
//                        if (sid==emp.get(i).getEmpid()) {
//                            System.out.println( emp.get(i));
//                            System.out.println(" ");
//                            break;
//                        }
////                        System.out.println(i);
//                    }
                    try {
                        ResultSet ras = stma.executeQuery(STR."select * from employe where empid=\{sid}");
                        while (ras.next()) {
                            System.out.println(STR."\t\{ras.getInt(1)}\t\t\t\{ras.getString(2)}\t\t\t\{ras.getInt(3)}");
                        }
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 4:

//

//                    System.out.println("");
//                       for(int  i=0;i<=emp.size();i++) {
//
//                    	   if (nit==emp.get(i).getEmpid()) {
//
//                                           System.out.println("Enter new employee id");
//                                            fir=scanner.nextInt();
//                                           emp.get(i).setEmpid(fir);
//
//                                           System.out.println("Enter Employee Name");
//                                            sir=scanner.next();
//                                            emp.get(i).setEmpname(sir);
//
//                                            System.out.println("Enter the Employee Salary");
//                                            tir=scanner.nextFloat();
//                                            emp.get(i).setSalary(tir);
//
//                                   }
//
//                               System.out.println("Updated Successfully");
//                           }

                    System.out.println( "What Do you want to update ");
                    System.out.println("1 Employee Id");
                    System.out.println("2 Employee Name");
                    System.out.println("3 Employee Salary");
                    option=scanner.nextInt();
                    switch (option){
                        case 1:
                             System.out.println("Enter the Employee id ");
                              nit=scanner.nextInt();
                            System.out.println("Enter the New Employee Id");
                             newsal=scanner.nextInt();
                      PreparedStatement preparedStatement=cnot.prepareStatement("update employe set empid=? where EmpID=?");
                      preparedStatement.setInt(1,newsal);
                      preparedStatement.setInt(2,nit);
                      preparedStatement.executeUpdate();
                            break;
                        case 2:
                             System.out.println("Enter the Employee id ");
                             int nita=scanner.nextInt();
                            System.out.println("Enter the New Employee Name");
                            String newsala=scanner.next();
                      PreparedStatement Statement=cnot.prepareStatement("update employe set name=? where EmpID=?");
                      Statement.setString(1, newsala);
                      Statement.setInt(2,nita);
                      Statement.executeUpdate();
                      break;
                        case 3:
                            System.out.println("Enter the Employee id ");
                             int ni=scanner.nextInt();
                            System.out.println("Enter the New Employee Name");
                            int newsa=scanner.nextInt();
                      PreparedStatement Stat=cnot.prepareStatement("update employe set Salary=? where EmpID=?");
                      Stat.setInt(1, newsa);
                      Stat.setInt(2,ni);
                      Stat.executeUpdate();
                      break;
                    }

break;

                case 5:
                    System.out.println("Enter the Employee id ");
                    sip=scanner.nextInt();
//                    for(int  i=0;i<=emp.size();i++) {
//
//                        if (sip==emp.get(i).getEmpid()) {
//                            emp.remove(i);
//                            System.out.println("Delete Successfully ");
//                            break;
//                        }
//
//                    }
                    try {


                        PreparedStatement deleat = cnot.prepareStatement(STR."Delete from employe where EmpID=\{sip}");
                        deleat.executeUpdate();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
//                    System.out.println("Sort BY :");
//                    System.out.println("1:By Employee ID");
//                    System.out.println("2:By Employee Name");
//                    System.out.println("3:By Employee Salary");
//                    dat=scanner.nextInt();
//                    switch (dat){
//                        case 1:
//                            System.out.println("Sorted By Employee ID");
//                            Collections.sort(emp,new empId());
//                             System.out.println("Employee ID  | Employee Name  | Employee Salary ");
//                             for (Employee em:emp){
//                                 System.out.println(em);
//                             }
//                             break;
//                        case 2:
//                            System.out.println("Sorted By Employee Name");
//                            Collections.sort(emp,new empName());
//                             System.out.println("Employee ID  | Employee Name  | Employee Salary ");
//                             for (Employee em:emp){
//                                 System.out.println(em);
//                             }
//                             break;
//                        case 3:
//                            System.out.println("Sorted By Employee Salary");
//                            Collections.sort(emp,new empSALARY());
//                             System.out.println("Employee ID  | Employee Name  | Employee Salary ");
//                             for (Employee em:emp){
//                                 System.out.println(em);
//                             }
                    System.out.println("what do you want to sort by");
                    System.out.println("1. name");
                    System.out.println("2. salary");
                    int a=scanner.nextInt();
                    switch (a) {
                        case 1:
                        try {


                            ResultSet sorat = stma.executeQuery("SELECT * FROM employe ORDER BY name ");
                            while (sorat.next()) {
                                System.out.println(STR."\t\{sorat.getInt(1)}\t\t\t\{sorat.getString(2)}\t\t\t\{sorat.getInt(3)}");
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                            break;
                        case 2:
                            try {
                             ResultSet sor = stma.executeQuery("SELECT * FROM employe ORDER BY salary");
                            while (sor.next()) {
                                System.out.println(STR."\t\{sor.getInt(1)}\t\t\t\{sor.getString(2)}\t\t\t\{sor.getInt(3)}");
                            }
                        } catch (Exception e) {
                            System.out.println(a);
                        }
                    }
break;

                default:
                    System.out.println("Enter the right Input");
                    break;
            }

        }



    }



}

