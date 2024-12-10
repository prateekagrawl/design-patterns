import ObservablePkg.IphoneObservableImpl;
import ObservablePkg.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iphoneStockObservable, "prateek@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iphoneStockObservable, "ajay@gmail.com");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl(iphoneStockObservable, "om@gmail.com");

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}