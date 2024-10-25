package Threading;

import java.lang.reflect.UndeclaredThrowableException;

class new_block{
    synchronized void Show_block(String arr[]){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            try {
                Thread.sleep(100);
            }catch (Exception e){}
        }
        System.out.println("}");
    }
}
class Thrd extends Thread{
    new_block nb;
    String arr[];
    public Thrd(new_block nb,String arr[]){
        this.nb=nb;
        this.arr=arr;
        start();
    }
    public void run()
    {
        nb.Show_block(arr);
    }
}




public class Sincroize {

    public static void main(String[] args) {


        String Aray1[] = {"how", "many", "time", "Do yoy have"};
        String Aray2[] = {"nice ", "to ", "meet", "with", "you"};


        new_block nd=new  new_block();

        Thrd t1=new Thrd(nd,Aray1);
        Thrd t2=new Thrd(nd,Aray2);
    }
}
