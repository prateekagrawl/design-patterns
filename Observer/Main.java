package Observer;

import Observer.Observable.IphoneObservableImpl;
import Observer.Observable.StockObservable;
import Observer.Observer.EmailAlertObserverImpl;
import Observer.Observer.MobileAlertObserverImpl;
import Observer.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
      System.out.println("hello");

        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iphoneStockObservable, "prateek@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iphoneStockObservable, "ajay@gmail.com");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl(iphoneStockObservable, "om@gmail.com");

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
}}
