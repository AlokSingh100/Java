package mvc.work;

public class main_stock
{
    public static void main(String[] args) {
        StckMarcket stockmarcket = new StckMarcket();
        StockObserver invest1 =new ivestor("Sumit");
        StockObserver invest2= new ivestor("Pritam");

        stockmarcket.registarObserver(invest1);
        stockmarcket.registarObserver(invest2);

        stockmarcket.setStockprice("Infi",50000);
        stockmarcket.setStockprice("TATA",7500);

        stockmarcket.removeObserver(invest2);

        stockmarcket.setStockprice("Bajaj",47500);
    }
}
