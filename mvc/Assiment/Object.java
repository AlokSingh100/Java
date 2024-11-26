package mvc.Assiment;

import java.util.Objects;
import java.util.Scanner;


public class Object {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
 Obj obj=new Obj();
        System.out.println("Enter the shape");

 String shape=scanner.next();
 if (shape.equals("Circle")){
     System.out.println("enter the Readies");
     int cir=scanner.nextInt();

     shape Shape=obj.ObjectShape("Circle",cir);
      Circle circle=new Circle(cir);
     Shape.shaping();
 }
 else if (obj.equals(shape)) {
     System.out.println("enter the Radies");
     int cir=scanner.nextInt();
     shape Shape=obj.ObjectShape("Triangle");
     Shape.shaping();
 }
 else if (obj.equals(shape)) {
     shape Shape=obj.ObjectShape("Square");
     Shape.shaping();
 }

    }
}
