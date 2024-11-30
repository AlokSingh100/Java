package lamada;

import java.util.Scanner;

public class packagss {
    public static void main(String[] args) {

            calcil ba=(double a,double b)->{
                System.out.println("Addicional "+a+b);
                System.out.println("Sibcrition "+(a-b));
                System.out.println("Multiply "+a*b);
                System.out.println("Devide "+a/b);

            };
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First Number");
        double a=scanner.nextDouble();
        System.out.println("Enter the Second Number");
        double b=scanner.nextDouble();
    ba.calculate( a, b);
    }
}
