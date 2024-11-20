package mvc.work;

public class Commercial implements Billing {
    @Override
    public void getBill() {
        System.out.println("this is Commercial");
    }
}
