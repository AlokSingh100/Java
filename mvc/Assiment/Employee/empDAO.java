package mvc.Assiment.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


class empDAO implements empinterface {
    List <emp_pojo> e;

 Connection connection() throws SQLException, ClassNotFoundException {

      Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
        System.out.println("Sql Connection Establish");

     return con;
}

    @Override
    public int save(emp_pojo em) {

     Connection conect;
     try {
         conect=connection();


         System.out.println(em.getEmpid()+""+em.getSalary());
         String a=em.empid+ ",'" +em.empname+"',"+em.salary;
         System.out.println(a);
         PreparedStatement insert= conect.prepareStatement("Insert into employe values (" +a+");");

insert.executeUpdate();
     }catch (Exception a){
         System.out.println(a);
     }



        return 0;
    }

    /**
     * @return
     */
    @Override
    public List<emp_pojo> getAllemp() throws SQLException, ClassNotFoundException {
        Connection con;
//        Scanner scanner=new Sacanner(System.in);
        List<emp_pojo>  empobject=new ArrayList<emp_pojo>();
        try {
            con= connection();
            Statement Stat=con.createStatement();
            ResultSet resultSet=Stat.executeQuery("Select* from employe");
            while (resultSet.next()){
                emp_pojo ob=new emp_pojo();
                ob.setEmpid(resultSet.getInt(1));
                ob.setEmpname(resultSet.getString(2));
                ob.setSalary(resultSet.getInt(3));
                empobject.add(ob);
            }


        } catch (Exception e){
            System.out.println(e.getMessage());

        }

        return empobject;
    }

    /**
     * @param empno
     * @return
     */
    @Override
    public emp_pojo getEmp(int empno) {
        return null;
    }

    /**
     * @param e
     */
    @Override
    public void updateEmp(emp_pojo e) {

        Connection con ;
        try {
con=connection();
String updates= "update employe set Name= '"+e.empname+"' where EmpID= "+e.empid;

            PreparedStatement update = con.prepareStatement(updates);
//update.setString(1,e.empname);
//update.setInt(2,e.empid);
            update.executeUpdate();
            System.out.println(updates);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * @param e
     */
    @Override
    public void deleteEmp(emp_pojo e) {
        Connection con;
        try {
            con=connection();
         String del=" delete from employe where EmpID="+ e.empid;
PreparedStatement deleate=con.prepareStatement(del);
deleate.executeUpdate();

        }catch (Exception ex ) {
            System.out.println(ex);
        }
    }
}
