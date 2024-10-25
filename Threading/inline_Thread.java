package Threading;

public class inline_Thread {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <5 ; i++) {
                        System.out.println("Hallo");
                        Thread.sleep(500);
                    }
                }catch (Exception e){}
            }
        };
        Thread ob=new Thread(runnable);
        ob.start();
        }

}
