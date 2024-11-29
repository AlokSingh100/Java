package mvc.Assiment.Shape;

import java.util.Scanner;

public class Obj {
      public shape ObjectShape(String Type) {
        if (Type==null)
            return null;
        if (Type.equalsIgnoreCase("Circle") ) {
            return new Circle();
        } else if (Type.equalsIgnoreCase("Triangle") ) {
            return new Triangle();
        }
        else if (Type.equalsIgnoreCase("Square") ) {
            return new Square();
        }
        return null;

    }

    public static class Square implements shape {
        @Override
        public void shaping() {
            System.out.println("Enter the Size of one side ");
            Scanner scanner=new Scanner(System.in);
            float side=scanner.nextFloat();
            System.out.println("The Area of the Square is "+ side);
        }
    }
}
