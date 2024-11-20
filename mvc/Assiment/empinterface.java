package mvc.Assiment;

import java.sql.SQLException;
import java.util.*;
public interface empinterface
{
    public int save(emp_pojo e);
    public List <emp_pojo> getAllemp() throws SQLException, ClassNotFoundException;
    public emp_pojo getEmp(int empno);
    public void updateEmp(emp_pojo e);
     public void deleteEmp(emp_pojo e);


}
