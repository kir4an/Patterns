package observer;

public class ObserverRunner {
    public static void main(String[] args) {
        Stock appleStock = new Stock("AAPL");

        StockChart chart = new StockChart();
        StockNotification alert = new StockNotification();

        appleStock.addObserver(chart);
        appleStock.addObserver(alert);

        appleStock.setPrice(150.0f);
        appleStock.setPrice(155.5f);
    }
}
