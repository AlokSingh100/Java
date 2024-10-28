package Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class exuitur {
    public static void main(String[] args) {
//        ExecutorService mee= Executors.newSingleThreadExecutor();
//        ExecutorService mee=Executors.newFixedThreadPool(3);
        ExecutorService mee=Executors.newCachedThreadPool();
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Task 1");
            }
        };
        Runnable t2=()->{
            System.out.println(Thread.currentThread().getName());
                System.out.println("Task 2");
        };
        mee.execute(r1);
        mee.execute(t2);
        mee.execute(new City("mum"));
    }
}
