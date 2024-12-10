package Observer.Observable;

import Observer.Observer.NotificationAlertObserver;

//observable object for the stock of different items
public interface StockObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int stockCount);

    public int getStockCount();
}
