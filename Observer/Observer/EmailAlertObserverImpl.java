package Observer.Observer;

import Observer.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    private StockObservable observable;
    private String emailId;

    public EmailAlertObserverImpl(StockObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId , "mail sent to emailId");
    }

    private void sendMail(String emailId, String mail_sent_to_emailId) {
        System.out.println("Email send to emailId "+ emailId);
    }
}
