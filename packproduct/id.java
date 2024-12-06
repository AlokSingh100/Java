package packproduct;

public class id {
    int salary;
    String name;
    id(int Salary, String Name){
        name=Name;
        salary=Salary;
    }
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    void setSalary(int Salary1){
         salary=Salary1;

    }
    void setName(String Name1){
        name=Name1;
    }
}
