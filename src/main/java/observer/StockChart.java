package observer;

public class StockChart implements StockObserver {
    @Override
    public void update(String stockSymbol, float price) {
        System.out.println("Stock Chart Updated: " + stockSymbol + " - " + price);
    }
}
