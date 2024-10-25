package Threading;

import static Threading.complex_thered.p1;

class main1 extends Thread{




    public main1(String name){
        super(name);
    }
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+">>>>"+i);
                Thread.sleep(500);
                System.out.println("main1 status>>"+ p1.getState());
                System.out.println("main2 status>>"+ complex_thered.p2.getState());
            }
        }catch (Exception e){}
    }
}
class main2 extends Thread{
    public main2(String name){
        super(name);
    }
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+">>>>"+i);
                Thread.sleep(510);
                System.out.println("main1 status>>"+ p1.getState());
                System.out.println("main2 status>>"+ complex_thered.p2.getState());
            }
        }catch (Exception e){}
    }
}

public class complex_thered {
    static  main1 p1=null;
    static main2 p2=null;
    public static void main(String[] args) throws InterruptedException {


        p1 = new main1("Theread 1");
        p2=new main2("Theread 2");
        System.out.println("Thread1 Status= " +p1.getState());
            System.out.println("Thread2 Status= " +p2.getState());
p1.start();
p1.join();
        System.out.println("Thread1 Status"+ p1.isAlive());
p2.start();
        System.out.println("Thread 1 State"+ p1.getState());
                System.out.println("Thread 2 State"+ p2.getState());


    }
}
