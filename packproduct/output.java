package packproduct;

public class output {
    public static void main(String[] args) {
        id Id=new id(1000,"alok");
        System.out.println(Id.name);
        System.out.println(Id.salary);
        System.out.println();
        Id.setName("Nist");
      System.out.println(Id.name);
        System.out.println(Id.salary);
    }
}
