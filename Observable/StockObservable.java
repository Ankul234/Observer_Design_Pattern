package com.ankul.Observer_Design_Pattern.Observable;
import com.ankul.Observer_Design_Pattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notify_Subscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
