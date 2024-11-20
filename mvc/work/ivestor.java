package mvc.work;

public class ivestor implements StockObserver{

    private String name;

    public ivestor(String name){
        this.name=name;
    }


    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println(name+"recerved an update"+ stockSymbol+"$"+stockPrice);
    }
}
