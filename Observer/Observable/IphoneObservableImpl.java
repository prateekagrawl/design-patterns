package Observer.Observable;

import Observer.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    private List<NotificationAlertObserver> notificationObserverList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver notificationAlertObserver: notificationObserverList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        //notify subscribers about the updated stock count
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount += newStockCount;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
