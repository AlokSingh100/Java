package Threading;

class odd_even{

     void even(int arr[]){
//       for (int j : arr) {
//           if (j % 2 == 0) {
//               System.out.println("Even Number" + j);
//           } else System.out.println("Odd Number" + j);
//           try {
//               Thread.sleep(500);
//           } catch (Exception _) {
//           }
//       }
        System.out.println("Even Number");
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                System.out.print(i+" ");
                try {
                Thread.sleep(500);
            }catch (Exception e){}
            }

        }



    }
    void odd(int arr[]){
         System.out.println("}");
        System.out.println("Odd Number");
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] % 2 != 0)
           {
               System.out.print(i+" ");
                try {
               Thread.sleep(650);
           }catch (Exception e){}
           }

        }
        System.out.println("}");
    }


}
class thred extends Thread{
    odd_even od;
    int arr[];
    thred(odd_even od,int arr[]){
        this.od=od;
       this.arr=arr;
       start();
    }
 public void run(){
       od.even(arr);
       od.odd(arr);
    }
}



public class RanableScronizw {
    public static void main(String[] args) {


        int[] num = new int[50];
        for (int i = 1; i < num.length; i++) {
            num[i]=i;
        }
       odd_even odd=new odd_even();

        thred trd=new thred(odd,num);


    }
}
