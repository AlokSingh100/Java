package mvc.Assiment.Shape;

import java.util.Scanner;


public class Object {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

Obj obj=new Obj();
        System.out.println("Enter the shape");

 String shape=scanner.next();
 if (shape.equals("Circle")){



     mvc.Assiment.Shape.shape Shape=obj.ObjectShape("Circle");


     Shape.shaping();
 }
 else if (obj.equals(shape)) {


     shape Shape=obj.ObjectShape("Triangle");
     Shape.shaping();
 }
 else if (obj.equals(shape)) {
     shape Shape=obj.ObjectShape("Square");
     Shape.shaping();
 }

    }
}
