package Threading;

class myth implements Runnable{
    Thread td;
    myth (String num){
        td=new Thread(this);
        td.start();
    }
    public  void run(){
          try {
            for (int i = 0; i <5; i++) {
                System.out.println(td.getName()+">>"+i);
                System.out.println("good day");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class Single_Therading
{
    public static void main(String[] args) throws InterruptedException {
        Thread ob=Thread.currentThread();
        myth md=new myth("lok");
        md.run();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1200);
        }
        System.out.println("End");
    }
}
