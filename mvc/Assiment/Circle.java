package mvc.Assiment;

public class Circle implements shape {


    float radis;
            Circle(float radis){
                this.radis=radis;
            }

    public Circle() {

    }


    @Override
    public void shaping() {
        System.out.println(radis);
    float rad=(float) 3.14f*radis*radis;
        System.out.println("Area of the circle is"+rad);
    }
}
