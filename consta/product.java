package consta;



import java.util.*;

public class product {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sku2,price2,quantity2,a=0;
        String pname2,yN;
        System.out.println("--- Input Section ---");
        int[] sku1=new int[100];
        int[] price1=new int[100];
        int[] quentity1=new int[100];
        String[] pro_name=new String[100];
        for (int i = 0; i < sku1.length; i++) {
            a++;
            System.out.print("Enter SKU (Unique Number): " );
            sku2=scanner.nextInt();
            sku1[i]=sku2;
            System.out.print("Enter Product Name: ");
            pname2=scanner.next();
            pro_name[i]=pname2;
            System.out.print("Enter "+pname2+" Quantity: ");
            quantity2=scanner.nextInt();
            quentity1[i]=quantity2;
            System.out.print("Enter Single "+pname2+" Price: ");
            price2=scanner.nextInt();
            price1[i]=price2;
            System.out.println();
            System.out.print("Do you want to add more [Y/N] ");
            yN=scanner.next();
            if (yN.equals("Y")||yN.equals("y"))
                continue;
            else if (yN.equals("n")||yN.equals("N")) {
                break;
            }
        }


        int[] sku5=new int[a];
        System.arraycopy(sku1, 0, sku1, 0, a);
        block_chain bencho=new block_chain(sku1,pro_name,quentity1,price1,a);
        bencho.print();
        System.out.println("------ Search Item ------");
        bencho.search();
    }

    static class block_chain {
       int[] sku;
       int[] quantity;
       int[] price;
       String[] pname;
       int aa;
       block_chain(int[] sku,String[] pname,int[] quantity,int[] price,int aa){
           this.sku=sku;
           this.quantity=quantity;
           this.price=price;
           this.pname=pname;
           this.aa=aa;
       }
       void print(){
           int dbs= sku.length;
           for (int i = 0; i < aa; i++) {
               System.out.println();
               System.out.println("Your SKU is ="+sku[i]);
               System.out.println("Your Product name is "+pname[i]);
               System.out.println("Your Quantity is" + quantity[i]);
               System.out.println("Price of Single Product is "+ price[i]);
               System.out.println();
           }
       }
       void search(){
           int a=0,b=0;
           Scanner scanner=new Scanner(System.in);

           System.out.print("Enter Product Item Form SKU No ");
           a=scanner.nextInt();
           for (int i = 0; i < sku.length; i++) {
               if (sku[i]==a){
                   b=i;
                   break;
               }
           }
               System.out.println("Your Product name is "+pname[b]);
               System.out.println("Your Quantity is" + quantity[b]);
               System.out.println("Price of Single Product is "+ price[b]);

       }



   }

    public static class product1 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int sku2,price2,quantity2,a=0;
            String pname2,yN;
            System.out.println("--- Input Section ---");
            int[] sku1=new int[100];
            int[] price1=new int[100];
            int[] quentity1=new int[100];
            String[] pro_name=new String[100];
            for (int i = 0; i < sku1.length; i++) {
                a++;
                System.out.print("Enter SKU (Unique Number): " );
                sku2=scanner.nextInt();
                sku1[i]=sku2;
                System.out.print("Enter Product Name: ");
                pname2=scanner.next();
                pro_name[i]=pname2;
                System.out.print("Enter "+pname2+" Quantity: ");
                quantity2=scanner.nextInt();
                quentity1[i]=quantity2;
                System.out.print("Enter Single "+pname2+" Price: ");
                price2=scanner.nextInt();
                price1[i]=price2;
                System.out.println();
                System.out.print("Do you want to add more [Y/N] ");
                yN=scanner.next();
                if (yN.equals("Y")||yN.equals("y"))
                    continue;
                else if (yN.equals("n")||yN.equals("N")) {
                    break;
                }
            }
            int[] sku5=new int[a];
            consta.product.block_chain bencho=new consta.product.block_chain(sku1,pro_name,quentity1,price1,a);
            bencho.print();
            System.out.println("------ Search Item ------");
            bencho.search();
        }
    }
}