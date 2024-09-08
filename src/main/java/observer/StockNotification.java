package observer;

public class StockNotification implements StockObserver{
    @Override
    public void update(String stockSymbol, float price) {
        System.out.println("Stock Alert: " + stockSymbol + " price is now " + price);
    }
}
