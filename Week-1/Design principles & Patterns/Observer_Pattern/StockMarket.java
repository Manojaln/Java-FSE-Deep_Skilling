package data;
import java.util.*;
public class StockMarket implements Stock {
	private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public void setStock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        notifyObservers(); // Notify all observers of the update
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer registered: " + observer.getClass().getSimpleName());
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, stockPrice);
        }
    }
}
