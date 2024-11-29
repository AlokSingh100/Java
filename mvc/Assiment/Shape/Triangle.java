package mvc.Assiment.Shape;

import java.util.Scanner;

public record Triangle() implements shape {
    @Override
    public void shaping() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the height");
        float h=scanner.nextFloat();
        System.out.println("Enter the Bright");
        float b=scanner.nextFloat();
        System.out.println("Area of the Triangle is "+ 0.5*b*h);
    }
}
