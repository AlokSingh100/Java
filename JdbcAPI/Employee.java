package JdbcAPI;


import java.util.Comparator;

public class Employee {

    int empid;
    String empname;
     float salary;

    public Employee(int empid, String empname, float salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "      "+empid+"           "+ empname+ "              "+salary ;
    }
}
