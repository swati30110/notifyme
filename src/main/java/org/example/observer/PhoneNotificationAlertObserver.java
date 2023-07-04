package org.example.observer;

import lombok.AllArgsConstructor;
import org.example.observable.StockObservable;
@AllArgsConstructor
public class PhoneNotificationAlertObserver implements NotificationAlertObserver{
    String phoneNo;

    StockObservable observable;
    @Override
    public void update() {
        sendMessage(phoneNo);
    }

    private void sendMessage(String phoneNo){
        System.out.println("sent message to "+phoneNo);
    }
}
