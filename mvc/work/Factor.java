package mvc.work;

public class Factor {
    public static void main(String[] args)
    {
        Factory bill=new Factory();
        Billing billing=bill.computeBilll("Domestic");

        billing.getBill();
    }
}
