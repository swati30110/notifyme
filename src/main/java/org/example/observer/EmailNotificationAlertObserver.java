package org.example.observer;

import lombok.AllArgsConstructor;
import org.example.observable.StockObservable;

@AllArgsConstructor
public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    @Override
    public void update() {
        sendEmail(emailId);
    }
    private void sendEmail(String emailId){
        System.out.println("Sent email to "+emailId);
    }
}
