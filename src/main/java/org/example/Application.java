package org.example;

import org.example.observable.IphoneStockObservable;
import org.example.observable.StockObservable;
import org.example.observer.EmailNotificationAlertObserver;
import org.example.observer.NotificationAlertObserver;
import org.example.observer.PhoneNotificationAlertObserver;

public class Application {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneStockObservable();
        NotificationAlertObserver observer1 =  new EmailNotificationAlertObserver("abc@gmail.com",stockObservable);
        NotificationAlertObserver observer2 =  new PhoneNotificationAlertObserver("9090834856",stockObservable);

        observer1.update();
        observer2.update();
    }
}
