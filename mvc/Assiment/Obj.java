package mvc.Assiment;

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
}
