package mvc.Assiment.Employee;

public class emp_pojo {





    int empid ;
    int salary;
    String empname;


    public emp_pojo Employee(int empid,String empname, int salary) {
        this.empid=empid;
        this.empname = empname;
        this.salary = salary;

        return null;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return STR."      \{empid}           \{empname}              \{salary}";
    }

    public emp_pojo Employee(emp_pojo em) {
        return em;
    }
}

