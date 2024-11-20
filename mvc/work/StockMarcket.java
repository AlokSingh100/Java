package mvc.work;

public interface StockMarcket
{
    void registarObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifiObserver(String stockSyymbol,double StockPrice);
}
