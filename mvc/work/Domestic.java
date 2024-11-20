package mvc.work;

public class Domestic implements Billing {
    @Override
    public void getBill() {
        System.out.println("This os Domestic");
    }
}
