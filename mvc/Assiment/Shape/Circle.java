package mvc.Assiment.Shape;

import java.util.Scanner;

public class Circle implements shape {




    public Circle() {

    }


    @Override
    public void shaping() {
       System.out.println("enter the Readies");
        Scanner scanner=new Scanner(System.in);
        float r=scanner.nextFloat();
        float pi=3.145f;
        System.out.println("area of the Circle is "+pi*r*r);
    }
}
