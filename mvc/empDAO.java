package mvc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


class empDAO implements empinterface  {

 Connection connection() throws SQLException, ClassNotFoundException {

      Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
        System.out.println("Sql Connection Establish");



     return con;
}

    @Override
    public int save(emp_pojo e) {

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



        return List.of();
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

    }

    /**
     * @param e
     */
    @Override
    public void deleteEmp(emp_pojo e) {

    }
}