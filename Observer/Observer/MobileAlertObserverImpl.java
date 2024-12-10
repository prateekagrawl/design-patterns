package Observer.Observer;

import Observer.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    StockObservable stockObservable;
    public String username;

    public MobileAlertObserverImpl(StockObservable stockObservable, String username) {
        this.stockObservable = stockObservable;
        this.username = username;
    }

    @Override
    public void update() {
        sendMessageOnMobile(username , "product is in the stock");
    }

    private void sendMessageOnMobile(String username, String product_is_in_the_stock) {
        System.out.println("Message send to "+ username);
    }
}
