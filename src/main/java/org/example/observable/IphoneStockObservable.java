package org.example.observable;

import org.example.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    public List<NotificationAlertObserver> subscribers = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver subscriber : subscribers){
            subscriber.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0)
            notifySubscribers();
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
