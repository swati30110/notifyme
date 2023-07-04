package org.example.observable;


import org.example.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockCount);

    int getStockCount();

}
