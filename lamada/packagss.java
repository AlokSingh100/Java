package lamada;

import java.util.Scanner;

public class packagss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to calculate");
        System.out.println("1. addiction");
        System.out.println("2. subcration");
        System.out.println("3. division");
        System.out.println("4. multiply");
        int chose = scanner.nextInt();
        calcil ba = null;
        switch (chose) {
            case 1:
                ba = (double a, double b) -> {
                    System.out.println("Addicional " + (a + b));

                };
                break;
            case 2:
                ba = (double a, double b) -> {
                    System.out.println("Sibcrition " + (a - b));

                };
                break;
            case 3:
                ba = (double a, double b) -> {

                    System.out.println("Multiply " + a * b);

                };
                break;
            case 4:
                ba = (double a, double b) -> {

                    System.out.println("Devide " + a / b);
                };
                break;
        }
        System.out.println("Enter the First Number");
        double a = scanner.nextDouble();
        System.out.println("Enter the Second Number");
        double b = scanner.nextDouble();
        ba.calculate(a, b);

    }
}
