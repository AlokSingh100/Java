package expances;

import java.util.Scanner;

import static java.lang.System.exit;

public class Personal_manager {
    public static void main(String[] args) {


        double salary, a = 0;
        String name, ans;
        int  i = 0;
        int b=0;
        int[] expance = new int[500];
        String Catugeary[] = {"HouseHold", "Personal", "Food", "Luxury"};
        int[] choseCatageory = new int[500];
        String[] product=new String[500];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        name = sc.next();
        System.out.println("Enter Your income");
        salary = sc.nextDouble();
        System.out.println("Now Starting Your Expanse Detail ");
        for ( i = 0; i < expance.length; i++) {
//            System.out.println("In the Following Category Choose where your Expanse Fall ");
//            System.out.println("1)HouseHold ");
//            System.out.println("2) Personal ");
//            System.out.println("3) Food ");
//            System.out.println("4) Luxury ");
//            int c = sc.nextInt();
//            choseCatageory[i] = c;
            System.out.println("Enter the Product ");
            String da=sc.next();
            product[i]=da;
            System.out.println("Enter The Amount ");
            int exp = sc.nextInt();
            expance[i] = exp;
            System.out.println("Do you have any more Expanse (Y/N)");
            ans = sc.next();
            if (ans.equals("Y") || ans.equals("y"))
                continue;
            else if (ans.equals("n") || ans.equals("N")) {
                break;
            } else exit(0);


        }
i=i+1;
        for (int ia = 0; ia < i; ia++) {
            b =(int)(expance[ia]+b);
        }
       int saveing = (int) (salary-b);
        System.out.println();
        System.out.println("Here is your Expanse and Salary Info ");
        System.out.println();

        System.out.println("Your Total Expenditure is " + b);
        if (salary < b){
            System.out.println("Alert You are Over Spending "+saveing);
        }
        else System.out.println("Your Saving is " +saveing);
        System.out.println(" ");
        System.out.println("Your Expenditure Is  along with Category ");
        System.out.println();
        for (int j = 0; j < i; j++) {
            System.out.println(" Your Product is  "+product[j]+" The Price is "+expance[j]);
        }


    }
}