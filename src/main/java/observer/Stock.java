package observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockSubject {
    private List<StockObserver> observers = new ArrayList<>();
    private String symbol;
    private float price;

    public Stock(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(symbol, price);
        }
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    public String getSymbol() {
        return symbol;
    }
}
