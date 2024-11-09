package JdbcAPI;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;




public class EmpDetail {




    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection cnot=DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
        System.out.println("Sql Connection Establish");


        List<Employee> emp=new ArrayList<Employee>();
        Scanner scanner=new Scanner(System.in);
        int select = 0, fet=0,newsal = 0;
        int idt=0,sid=0,nit,fir,sip,dat;
        String name,sir,lat;
        Float salary,tir ;
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
                    System.out.println("Enter the Employee Id");
                    idt=scanner.nextInt();
                    System.out.println("Enter Employee Name");
                    name=scanner.next();
                    System.out.println("Enter the Employee Salary");
                    salary=scanner.nextFloat();
                    emp.add(new Employee(idt,name,salary));


                    break;
                case 2:
                    System.out.println("Employee ID  | Employee Name  | Employee Salary ");
                    ResultSet rs=stm.executeQuery("Select* from employe");
        while (rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }
                    break;

                case 3:
                    System.out.println("Enter the Employee id ");
                    sid=scanner.nextInt();
                    System.out.println("Employee ID  | Employee Name  | Employee Salary ");

                    for(int i=0;i<= emp.size();i++) {

//                        System.out.println("sid = "+ sid);
//                        System.out.println("idt ="+emp.get(i).getEmpid() );
                        if (sid==emp.get(i).getEmpid()) {
                            System.out.println( emp.get(i));
                            System.out.println(" ");
                            break;
                        }
//                        System.out.println(i);
                    }
                    break;
                case 4:
                	   System.out.println("Enter the Employee id ");
//
                        nit=scanner.nextInt();
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
                    newsal=scanner.nextInt();
                      PreparedStatement preparedStatement=cnot.prepareStatement("update employe set salary=? where EmpID?");
                      preparedStatement.setInt(1,newsal);
                      preparedStatement.setInt(2,nit);
                    		   break;

                case 5:
                    System.out.println("Enter the Employee id ");
                    sip=scanner.nextInt();
                    for(int  i=0;i<=emp.size();i++) {

                        if (sip==emp.get(i).getEmpid()) {
                            emp.remove(i);
                            System.out.println("Delete Successfully ");
                            break;
                        }

                    }
                    break;
//                case 6:
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
//                             break;
//
//                    }
                default:
                    System.out.println("Enter the right Input");
                    break;
            }

        }



    }



}

