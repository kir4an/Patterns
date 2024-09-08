package observer;

public interface StockObserver {
    void update(String stockSymbol, float price);
}